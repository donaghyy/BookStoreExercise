package Store;


import java.util.HashMap;
import java.util.Map;

public class Service {
    private Map<Integer, Book> store = new HashMap<Integer, Book>();
   

    public void addBook(Integer key, String author, String title )
    {
        Book newBook = new Book(author, title);
        store.put(key, newBook);
    }

    public void removeBook(Integer key){
    		store.remove(key);
    }

    public void printAll(){
    		store.forEach((key, book) -> 
    		{
            System.out.print("ID: " + key + "\n" + "The author is: " + book.getAuthor() + "\n"
            		+ "The books title is: " + book.getTitle() + "\n\n");

        });
    }

}

