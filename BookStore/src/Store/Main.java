package Store;

public class Main {

    public static void main(String [] args) {
        Service Store = new Service();

        Store.addBook(1, "JK Rowling", "Harry Potter");
        Store.addBook(2, "David Donaghy", "Animal Farm");

        Store.printAll();

        System.out.println("\n Removing Harry Potter \n");

        Store.removeBook(1);

        Store.printAll();


    }
}
