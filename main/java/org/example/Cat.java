package org.example;

public class Cat {
    private String name;
    private int apetate;
    private boolean hangri;

    Cat(String name, int apetate){
        this.name = name;
        this.apetate = apetate;
        this.hangri = true;

    }

    void Inf(){
        String isHangry = !hangri ? "good" : "hangry";
        System.out.println(name + ": " + isHangry);

    }

    void eat(Plate plate){
        if (hangri && plate.decreaceFood(apetate))
            hangri = false;

    }
}
