import java.util.Scanner;
public class BooksView {
    public void printDetails(String bookName, String bookAuthor, String bookType){
        System.out.println("Book name is: " +bookName );
        System.out.println("the Author is: " +bookAuthor);
        System.out.println("the Booktype is: " +bookType);
    }

    public static Books readData(){
        Scanner in= new Scanner(System.in);
        System.out.println("Book name is: ");
        String NumeCarte= in.nextLine();
        System.out.println("Book author is: ");
        String NumeAutor=in.nextLine();
        System.out.println("The Book Type is: ");
        String TipulCartii= in.nextLine();
        Books book= new Books();
        book.setName(NumeCarte);
        book.setAuthor(NumeAutor);
        book.setType(TipulCartii);
        return book;

    }
}
