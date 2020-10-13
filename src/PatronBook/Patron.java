
package PatronBook;

import java.util.Scanner;

 
public class Patron {
    String name, b1, b2, b3, b4, pname;
    Patron(String name) {

    }
    
       public String getName(){
           Scanner input = new Scanner(System.in);
           System.out.println("Enter Your Name: ");
           this.pname = input.nextLine();
           return pname;
}
       public String hasBook(){
               return name;
}
       
       public Boolean Borrow(String b, String a){
           if (b1==null){
               b1 = b;
               return true;
           }
           else if (b1=="a"){
                return false;
       }
           else if (b2==null){
               b2 = b;
               return true;
           }
           else if(b2=="a") {
                   return false;
       }
           else if (b3==null){
               return true;
           }
           else if(b3=="a"){
                   return false;
       }
   
       


