package lesson_6_interfaces;

public class Melodrama extends Native_Film {
    private int likes = 10;

    @Override
    public void dislike() {
        super.dislike();
        likes--;
        System.out.println("Likes: " + likes);
    }
}
