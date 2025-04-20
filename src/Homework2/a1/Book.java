package Homework2.a1;

public class Book extends Publication{
    protected String author;

    public Book(String title, int year, String author) {
        super(title, year);
        this.author = author;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", by " + author;
    }
}
