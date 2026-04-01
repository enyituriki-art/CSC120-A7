/* This is a stub for the Library class */
import java.util.Hashtable;

/**
 * The Library class represents a building that stores a collection of books.
 * Each book title is stored as a key in a Hashtable and its availability is
 * represented by a Boolean value (true = available, false = checked out).
 *
 * A Library extends Building and implements LibraryRequirements.
 */

public class Library extends Building implements LibraryRequirements{

  private Hashtable<String, Boolean> collection;
    
    /**
     * Constructs a new Library object with the given name, address, and number of floors.
     * Initializes an empty book collection.
     *
     * @param name the name of the library
     * @param address the street address of the library
     * @param nFloors the number of floors in the library
     */

    public Library(String name, String address, int nFloors) {

      super (name, address, nFloors);
      this.collection = new Hashtable<String, Boolean>();
      System.out.println("You have built a library: 📖");
    }

    /**
     * Adds a new book title to the library collection and marks it as available.
     *
     * @param title the title of the book to add
    */


    public void addTitle(String title){
        this.collection.put(title, true);
      }
    
    /**
     * Removes a book title from the library collection if it exists.
     *
     * @param title the title of the book to remove
     * @return the removed title, or null if the book was not in the collection
    */

    public String removeTitle(String title){
      if(this.collection.containsKey(title)){
        this.collection.remove(title);
        return title;
      }
      return null;

    } 

    /**
     * Checks out a book by marking it as unavailable, if it exists in the collection.
     *
     * @param title the title of the book to check out
    */

    public void checkOut(String title){
      if(this.collection.containsKey(title)){
        this.collection.replace(title, false);
        
      }
     
    } 

    /**
     * Returns a book by marking it as available, if it exists in the collection.
     *
     * @param title the title of the book to return
    */

    public void returnBook(String title){

      if(this.collection.containsKey(title)){
        this.collection.replace(title, true);
       
      }

    } 

    /**
     * Checks whether the library contains a given book title.
     *
     * @param title the title to check
     * @return true if the title exists in the collection, false otherwise
    */
   
    public boolean containsTitle(String title){
      return this.collection.containsKey(title); 
    } 

    /**
     * Checks whether a given book is available to be checked out.
     *
     * @param title the title of the book to check
     * @return true if the book exists and is available, false otherwise
    */

    public boolean isAvailable(String title){
          
      if(this.collection.containsKey(title)){
        return this.collection.get(title);
        
      }
      return false;

    } 

    /**
     * Prints the entire book collection showing each title and its availability status.
    */

    public void printCollection(){
      for(String title : this.collection.keySet()){
        boolean available = this.collection.get(title);
        if (available){
          System.out.println(title + " -Available");
        } else 
        System.out.println(title + " - " +  "Checked out");
        }
    }

    
    /**
     * A simple test method for the Library class.
     * Demonstrates adding books, checking out a book, and returning it.
    */
    public static void main(String[] args) {

      Library lib = new Library ("Neilson", "7 Neilson St", 4);
      lib.addTitle("Purple Hibiscus by Chimamanda Ngozi Adichie");
      lib.addTitle("Things Fall Apart by Chinua Achebe");
      lib.printCollection();
      lib.checkOut("Purple Hibiscus by Chimamanda Ngozi Adichie");
      System.out.println("Purple Hibiscus?  " +lib.isAvailable("Purple Hibiscus by Chimamanda Ngozi Adichie") );
      lib.returnBook("Purple Hibiscus by Chimamanda Ngozi Adichie");
      System.out.println("Purple Hibiscus? " +lib.isAvailable("Purple Hibiscus by Chimamanda Ngozi Adichie") );

    }
  
  }