package lesson_6_interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Melodrama melodrama = new Melodrama();
        melodrama.dislike();

        Comedy comedy = new Comedy("Hangover");
        Drama drama = new Drama();
        Horror horror = new Horror();

        ArrayList<Film> films = new ArrayList<>();
        films.add(comedy);
        films.add(drama);
        films.add(horror);

        for (Film counter: films) {
            counter.download();
            counter.save();
            counter.watch();
            counter.like();
        }
    }
}
