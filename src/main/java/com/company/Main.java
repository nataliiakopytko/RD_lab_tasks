package com.company;

public class Main {

    public static void main(String[] args) {
        Dogee Marsik = new Dogee("Marsik", "red");
        Marsik.eat();

        Dogee Barsik = new Dogee("Barsik", "red", 3, 4, true);

        Barsik.play();

        Dogee Rex = new Dogee();

        Rex.eat();
        Rex.waveTail(false);
    }
}
