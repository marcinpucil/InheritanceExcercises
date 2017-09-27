package Excercise4;/*Excercise3
Zdefiniuj typ wyliczeniowy dla ośmiu kombinacji kolorów podstawowych: BLACK,
RED, BLUE, GREEN, CYAN, MAGENTA, YELLOW, WHITE z metodami: getRed, getGreen i getBlue.
cd.
Klasa Class ma sześć metod zwracających ciąg znaków opisujący typ reprezentowany
przez obiekt Class. Czym się różnią, gdy użyte są dla tablicy, zwykłego typu, klasy
wewnętrznej i typu prostego?
*/

public class Main {

    public static void main(String[] args) {
        int[] tableForClassTest = {1, 2, 3};

        Colours colours;
        colours = Colours.getBlue();
        System.out.println(colours);
        //second part
        secondPart(tableForClassTest);
    }

    private static void secondPart(Object objectForTest) {
        Class<?> aClass = objectForTest.getClass();
        System.out.println(aClass.getCanonicalName());
        System.out.println(aClass.getName());
        System.out.println(aClass.getSimpleName());
        System.out.println(aClass.getTypeName());
        System.out.println(aClass.toGenericString());
        System.out.println(aClass.toString());
    }


}
