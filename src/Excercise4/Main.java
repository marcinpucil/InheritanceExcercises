/*Excercise3
Załóżmy, że w podrozdziale 4.2.2, „Metoda equals”, metoda Item.equals korzysta
z testu instanceof. Zaimplementuj DiscountedItem.equals w taki sposób,
by porównywała tylko klasę nadrzędną, jeśli otherObject jest klasy Item, ale również
brała pod uwagę zniżkę, jeśli jest ona klasy DiscountedItem. Pokaż, że ta metoda
zachowuje symetrię, ale nie jest przechodnia — czyli znajdź takie instancje obu klas,
by prawdziwe było x.equals(y) i y.equals(z), ale nie x.equals(z).
*/
package Excercise4;

import Excercise3.DiscountedItem;
import Excercise3.Item;

public class Main {

    public static void main(String[] args) {
        Colours red = Colours.RED;


    }
}
