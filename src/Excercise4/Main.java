package Excercise4;/*Excercise3
Zdefiniuj typ wyliczeniowy dla ośmiu kombinacji kolorów podstawowych: BLACK,
RED, BLUE, GREEN, CYAN, MAGENTA, YELLOW, WHITE z metodami: getRed, getGreen i getBlue.
cd.
Klasa Class ma sześć metod zwracających ciąg znaków opisujący typ reprezentowany
przez obiekt Class. Czym się różnią, gdy użyte są dla tablicy, zwykłego typu, klasy
wewnętrznej i typu prostego?
*/

public class Main {

    public static void main(String[] args) throws NoSuchMethodException {
        int[] tableForClassTest = {0, 1, 2, 3};
        int primitiveForClassTest = 0;
        Integer integerForTest = 0;
        Colours colours;
        colours = Colours.getBlue();
        System.out.println(colours);
        //second part
        System.out.println("Table");
        classTests(tableForClassTest);
        System.out.println("Primitive");
        classTests(primitiveForClassTest);
        System.out.println("Integer");
        classTests(integerForTest);
        System.out.println("InnerClass");
        classTests(new InnerClassForTest());
    }

    private static void classTests(Object objectForTest) throws NoSuchMethodException {
        Class<?> aClass = objectForTest.getClass();
        System.out.println(aClass.getCanonicalName());
        System.out.println(aClass.getName());
        System.out.println(aClass.getSimpleName());
        System.out.println(aClass.getTypeName());
        System.out.println(aClass.toGenericString());
        System.out.println(aClass.toString());
        System.out.println("");
    }


    private static class InnerClassForTest {
    }


}
