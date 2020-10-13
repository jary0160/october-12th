
package PatronBook;



import java.util.Scanner;

public class Book {
        public String authorChosen;
        public String bookChosen;
        public Book(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Book Name:");
        this.bookChosen = input.nextLine();
        System.out.println("Enter Author Name:");
        this.authorChosen = input.nextLine();
    
}
}