
/**
 * Write a description of class BookTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BookTester
{
    public static void main(String[] args){
        Book b1 = new Book("Mortal Engines", "Philip Reeve", 289, false, true);
        System.out.println(b1);
        b1.setTitle("The Lord Of The Rings");
        System.out.println(b1.getTitle());
        b1.setAuthor("JRR Tolkien");
        System.out.println(b1.getAuthor());
        b1.setPages(1024);
        System.out.println(b1.getPages());

    }
}
