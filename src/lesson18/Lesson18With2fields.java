package lesson18;

public class Lesson18With2fields {

    private String book;
    private int pages;

    public Lesson18With2fields(String book, int pages) {
        this.book = book;
        this.pages = pages;
    }

    public Lesson18With2fields() {

    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
