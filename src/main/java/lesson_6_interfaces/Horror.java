package lesson_6_interfaces;

import java.util.ArrayList;

public class Horror implements Film {
    private String name;
    private int year;
    private float rating;
    ArrayList<String> cast;

    @Override
    public void download() {
        System.out.println("Horror is downloaded");

    }

    @Override
    public void save() {
        System.out.println("Horror is saved");

    }

    @Override
    public void watch() {
        System.out.println("Horror is watched");

    }

    @Override
    public void like() {
        System.out.println("Horror is liked");

    }
}
