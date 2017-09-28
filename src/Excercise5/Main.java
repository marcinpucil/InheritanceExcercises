package Excercise5;
/*Excercise5
Napisz „uniwersalną” metodę toString wykorzystującą refleksje do zwrócenia ciągu
znaków ze wszystkimi zmiennymi instancji obiektu. Dostaniesz dodatkowe punkty,
jeśli potrafisz obsłużyć odwołania cykliczne.
*/

import java.lang.reflect.Field;

public class Main {
    private java.lang.String string = "cos";
    private Integer integer = 10;

    public static void main(String[] args) throws IllegalAccessException {
        Main main = new Main();
        System.out.println(uniwersalToStringMethod(main));
    }

    private static java.lang.String uniwersalToStringMethod(Object o) throws IllegalAccessException {
        StringBuilder stringBuilder = new StringBuilder();
        Class<?> aClass = o.getClass();
        for (Field field : aClass.getDeclaredFields()) {
            field.setAccessible(true);
            stringBuilder.append(field.getName()).append(" ").append(field.get(o)).append(" ");
        }
        return stringBuilder.toString();
    }
}
