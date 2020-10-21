/*
 * Lukas Krampitz
 * Oct 20, 2020
 * A book
 */
package searchingexercise1;

/**
 *
 * @author Tacitor
 */
public class Book {

    protected String title;
    protected int refNum;

    public Book() {
        title = "NO TITLE";
        refNum = 0;
    }

    public Book(int refNum, String title) {
        this();
        this.refNum = refNum;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getRef() {
        return refNum;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRef(int refNum) {
        this.refNum = refNum;
    }

    public boolean equals(Book other) {
        return (this.title.equals(other.title) && this.refNum == other.refNum);
    }

    @Override
    public Book clone() {
        Book copy = new Book(refNum, title);
        return copy;
    }

    @Override
    public String toString() {
        return "Title: " + title
                + "\nReference number: " + refNum;
    }

}
