package com.company;

public class Dogee {

    private String breed = "Australian Shepherd";
    private String color;
    private int age;
    private int pawsAmount;
    private boolean tail;
    private String name;
    private int energy = 10;
    private int happiness = 50;

    Dogee() {
        breed = "Akita";
        color = "Black/White";
        name = "Marsik";
        age = 3;
        pawsAmount = 4;
        tail = true;
        energy = 100;
        happiness = 80;
    }

    Dogee(String newName, String color) {
        this();
        name = newName;
        this.color = color;
    }

    Dogee(String name, String color, int age, int pawsAmount, boolean tail) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.pawsAmount = pawsAmount;
        this.tail = tail;
    }


    public void eat() {
        if(energy < 100){
            energy +=10;
            happiness +=20;
            System.out.println("Thanks, my energy is " + energy);
            System.out.println("And I'm " + happiness + " % happy!");
        }
        System.out.println("Oh, no! I'm full enough! My energy is " + energy);
    }

    public void play() {
        if (energy < 20){
            System.out.println("Feed me, I can't play :( My energy is: " + energy);
        }
        else if(energy > 20){
        energy -=20;
        happiness += 20;
        System.out.println("I'm happier now! Look: " + happiness);
    }
    }
    public void waveTail( boolean tail){
       if(tail){
           energy -= 10;
           happiness +=10;
           System.out.println("Yeeeeah, I like it :)");
       }
        System.out.println("It's not funny, I don't have a tail :(");
        happiness -=40;
    }
}