
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    private String title;
    private String author;
    private int numberOfPages;
    private boolean grond;
    private boolean londonOnWheels;
    public Book(String t, String a, int p, boolean g, boolean l){
        title = t;
        author = a;
        numberOfPages = p;
        grond = g;
        londonOnWheels = l;
    }
    public void setTitle(String t){
        title = t;
    }
    public String getTitle(){
        return title;
    }
    public void setAuthor(String a){
        author = a;
    }
    public String getAuthor(){
        return author;
    }
    public void setPages(int p){
        numberOfPages = p;
    }
    public int getPages(){
        return numberOfPages;
    }
    public String toString(){
        String objectData = "\nTitle: " + title + " \nAuthor: " + author + " \nNumber Of Pages: " + numberOfPages;
        return objectData;
    }
}
