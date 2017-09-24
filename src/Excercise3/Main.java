/*Excercise3
Załóżmy, że w podrozdziale 4.2.2, „Metoda equals”, metoda Item.equals korzysta
z testu instanceof. Zaimplementuj DiscountedItem.equals w taki sposób,
by porównywała tylko klasę nadrzędną, jeśli otherObject jest klasy Item, ale również
brała pod uwagę zniżkę, jeśli jest ona klasy DiscountedItem. Pokaż, że ta metoda
zachowuje symetrię, ale nie jest przechodnia — czyli znajdź takie instancje obu klas,
by prawdziwe było x.equals(y) i y.equals(z), ale nie x.equals(z).
*/
package Excercise3;

public class Main {

    public static void main(String[] args) {
        Item item = new Item();
        Item item1 = new Item();
        DiscountedItem discountedItem = new DiscountedItem();
        DiscountedItem discountedItem1 = new DiscountedItem();
        System.out.println(item.equals(discountedItem));
        System.out.println(item.equals(item1));
        System.out.println(discountedItem.equals(discountedItem1));

    }
}
