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
    		store.forEach((k,b)-> 
    		{
            System.out.print("ID: " + k + "\n" + "The author is " + b.getAuthor() + "\n"
            		+ "The books title is " + b.getTitle() + "\n");

        });
    }

}

