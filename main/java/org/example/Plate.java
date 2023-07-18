package org.example;

public class Plate {
    public int food;
    public Plate(int food){
        this.food = food;
    }

    boolean decreaceFood(int n){
        int diff = food - n;
        if(diff < 0) return false;

        food -= n;
        return true;

    }

    void addFood(int food){
        this.food += food;

    }

    void Info(){
        System.out.println("plate: " + food);
    }
}
