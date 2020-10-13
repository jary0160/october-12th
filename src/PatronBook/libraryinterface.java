
package PatronBook;
import java.util.Scanner;
import java.awt.print.Book;
import static java.sql.JDBCType.NULL;

/**
 *
 * @author bsamra
 */
public class libraryinterface {
     String name;
     String author;
     public String authorChosen;
     public String bookChosen;
     Scanner input = new Scanner(System.in);
    libraryinterface(String name, String author) {
    }
     @Override
      public String toString(){
        
        return name + " " + author + " ";
            }
      
            
    public static void main(String[] args) {
    
    
        libraryinterface b1 = new libraryinterface("From Russia With Love", "Greg Hines") ;
        libraryinterface b2 = new libraryinterface("Living Smart","Rita Langill");
        libraryinterface b3 = new libraryinterface("Singing in the Rain","Harry Conner");
        libraryinterface b4 = new libraryinterface("Good Housekeeping","Pat Burns");
        libraryinterface b5 = new libraryinterface("To Be a Model", "Lisa Lahey");
        System.out.println("Here are the books available:"  );
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
          
        //Patron p = new Patron("Miles Davis");
        
            }
}

