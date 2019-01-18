package first.java;

import java.util.Scanner;

public class BookstoreRunner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bookstore bookstore = new Bookstore();

        Book book = new Book("Cosmic Trigger", 5,5,4,true);
        bookstore.addBook(book);
        bookstore.printBooks();
        bookstore.readBook(input);
        bookstore.printBooks();



        Pen pen = new Pen ("Stabilo", 6,5,0,false);
        bookstore.addPens(pen);
        bookstore.printPens();
        bookstore.readPen(input);
        bookstore.printPens();

        Notebook notebook = new Notebook("Moleskine", 12,24,10,true);
        bookstore.addNotebook(notebook);
        bookstore.printNotebooks();
        bookstore.readNotebook(input);
        bookstore.printNotebooks();










   //   Texts print = new Texts();
  //  print.getMainMenu();
    // print.getaddProductMenu();
     // print.getbuyMenu();
      // print.getlistProductsMenu();




        }

    }


