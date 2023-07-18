package org.example;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Vasya", 5),
                    new Cat("Stepa", 50),
                    new Cat("Busya", 14),
                    new Cat("joPa", 70)
                    };
        Plate plate = new Plate(80);

        for (Cat cat : cats){
            cat.eat(plate);
            cat.Inf();
        }

    }
}