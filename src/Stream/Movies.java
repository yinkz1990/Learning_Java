package Stream;

public class Movies {
    private String name;

    public int getLikes() {
        return likes;
    }

    private int likes;

    public Movies(String name, int likes) {
        this.name = name;
        this.likes = likes;
    }
}
