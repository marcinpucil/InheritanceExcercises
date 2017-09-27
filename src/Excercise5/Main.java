package Excercise5;
/*Excercise5
Napisz „uniwersalną” metodę toString wykorzystującą refleksje do zwrócenia ciągu
znaków ze wszystkimi zmiennymi instancji obiektu. Dostaniesz dodatkowe punkty,
jeśli potrafisz obsłużyć odwołania cykliczne.
*/

import java.lang.reflect.Field;

public class Main {
    private java.lang.String string = "cos";

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(uniwersalToStringMethod(main));
    }

    private static java.lang.String uniwersalToStringMethod(Object o) {
        StringBuilder stringBuilder = new StringBuilder();
        Class<?> aClass = o.getClass();
        for (Field field : aClass.getDeclaredFields()) {
            stringBuilder.append(field.getName());
        }
        return stringBuilder.toString();
    }
}
