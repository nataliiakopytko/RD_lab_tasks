package lesson_6_interfaces;

import java.util.ArrayList;

public class Drama implements Film {
    private String name;
    private int year;
    private float rating;
    ArrayList<String> cast;

    @Override
    public void download() {
        System.out.println("Drama is downloaded");

    }

    @Override
    public void save() {
        System.out.println("Drama is saved");

    }

    @Override
    public void watch() {
        System.out.println("Drama is watched");

    }

    @Override
    public void like() {
        System.out.println("Drama is liked");

    }
}
