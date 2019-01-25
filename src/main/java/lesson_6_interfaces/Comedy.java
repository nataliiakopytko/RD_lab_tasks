package lesson_6_interfaces;

import java.util.ArrayList;

public class Comedy implements Film{
    private String name;
    private int year;
    private float rating;
    ArrayList<String> cast;
    private int like = 0;

    public Comedy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getLike() {
        return like;
    }

    @Override
    public void download() {
        System.out.println("Comedy is downloaded");
    }

    @Override
    public void save() {
        System.out.println("Comedy is saved");
    }

    @Override
    public void watch() {
        System.out.println("Comedy is watched");
    }

    @Override
    public void like() {
        like ++;
        System.out.println("Comedy is liked - " + getLike());
    }
}
