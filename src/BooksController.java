
public class BooksController {

    private Books model;
    private BooksView view;

    public BooksController(Books model, BooksView view){
        this.model = model;
        this.view = view;
    }
    public void setBookName(String name){
        model.setName(name);
    }

    public String getBookName(){
        return model.getName();
    }

    public void setBookType(String type){
        model.setType(type);
    }

    public String getBookType(){
        return model.getType();
    }

    public void setBookAuthor(String author){
        model.setAuthor(author);
    }

    public String getBookAuthor(){
        return model.getAuthor();
    }
    public void updateView(){
        view.printDetails(model.getName(), model.getType(), model.getAuthor());
    }

}

