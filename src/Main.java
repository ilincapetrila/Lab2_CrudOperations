public class Main {
    public static void main(String[] args) {


    //Books model  = retriveBooksFromDatabase();

    BooksView view= new BooksView();
    Books model =view.readData();
    BooksController controller= new BooksController(model, view);

    controller.updateView();

    //update model data
          controller.setBookName("Flori de mucigai");
          controller.setBookAuthor("Arghezi");
          System.out.println("Am updatat poezia");

          controller.updateView();}

    private static Books retriveBooksFromDatabase(){
        Books book = new Books();
        book.setName("Luceafarul");
        book.setAuthor("Eminescu");
        book.setType("Poezie");
        return book;


    }}

