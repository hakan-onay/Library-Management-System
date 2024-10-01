
package librarymanagement;

import java.util.Scanner;


public class LibraryManagement {

    
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        
        
        //Getting number of books
        System.out.println("Enter the number of books");
        int numberOfBook = input.nextInt();
        System.out.println();
        
        
        String[] books = new String[numberOfBook];
        String[] authors = new String[numberOfBook];
        String[] publishers = new String[numberOfBook];
        
        //Getting informations about books
        for(int i=0; i<numberOfBook; i++){
            System.out.println("Enter book "+(i+1)+"'s name");
            books[i] = input.next();
            System.out.println("Enter book "+(i+1)+"'s author");
            authors[i] = input.next();
            System.out.println("Enter book "+(i+1)+"'s publisher");
            publishers[i] = input.next();
        }
        
        //Getting name of the aimed book
        System.out.println("Enter the title of book");
        String titleOfBook = input.next();
        
        
        
        //Getting information about the aimed books 
        for(int i=0; i<numberOfBook; i++){
            if(books[i].equals(titleOfBook)){
            System.out.println("Book "+(i+1)+"'s name is: "+books[i]);
            System.out.println("Book "+(i+1)+"'s author is: "+authors[i]);
            System.out.println("Book "+(i+1)+"'s publisher is: "+publishers[i]);
            System.out.println();
            }
        }
        
        
        
        
        
        //Printing all of the books in library
        System.out.println("All the books are");
        for(int i=0; i<numberOfBook; i++){
            System.out.println("Book "+(i+1)+"'s name is: "+books[i]);
            System.out.println("Book "+(i+1)+"'s author is: "+authors[i]);
            System.out.println("Book "+(i+1)+"'s publisher is: "+publishers[i]);
            System.out.println();
        }
    }
    
}
