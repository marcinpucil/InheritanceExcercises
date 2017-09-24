/*Excercise3
Załóżmy, że w podrozdziale 4.2.2, „Metoda equals”, metoda Item.equals korzysta
z testu instanceof. Zaimplementuj DiscountedItem.equals w taki sposób,
by porównywała tylko klasę nadrzędną, jeśli otherObject jest klasy Item, ale również
brała pod uwagę zniżkę, jeśli jest ona klasy DiscountedItem. Pokaż, że ta metoda
zachowuje symetrię, ale nie jest przechodnia — czyli znajdź takie instancje obu klas,
by prawdziwe było x.equals(y) i y.equals(z), ale nie x.equals(z).
*/
package Excercise3;

public class DiscountedItem extends Item {
    private double discount;

    @Override
    public boolean equals(Object otherObject) {
        if(otherObject instanceof Item) return super.equals(otherObject);
        DiscountedItem other = (DiscountedItem) otherObject;
        return this.discount==other.discount;
    }
}
