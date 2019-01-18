package first.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Bookstore {

    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Pen> pens = new ArrayList<>();
    ArrayList<Notebook> notebooks = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addPens(Pen pen) {
        pens.add(pen);
    }

    public void addNotebook(Notebook notebook) {
        notebooks.add(notebook);
    }

    public void printBooks() {
        for (Book a : books) {
            System.out.println(a.getTitle());

        }
    }

    public void printPens() {
        for (Pen b : pens) {
            System.out.println(b.getName());
        }
    }

    public void printNotebooks() {
        for (Notebook c : notebooks) {
            System.out.println(c.getName());
        }
    }

    public void readBook(Scanner input) {
        String tempTitle;
        double tempPrice;
        int tempId;
        int tempDiscount;
        boolean tempIsOnDiscount;
        System.out.println("Type the title of the book to add: ");
        tempTitle = input.nextLine();
        System.out.println(tempTitle);

        System.out.println("Type the price of " + tempTitle + ": ");
        tempPrice = input.nextDouble();
        System.out.println(tempPrice);

        System.out.println("Type the ID of " + tempTitle + ": ");
        tempId = input.nextInt();
        System.out.println(tempId);

        System.out.println("What discout does apply to " + tempTitle + ": ");
        tempDiscount = input.nextInt();
        System.out.println(tempDiscount);

        System.out.println("Discount applied for " + tempTitle + "? true/false ");
        tempIsOnDiscount = input.nextBoolean();
        System.out.println(tempIsOnDiscount);

        Book book = new Book(tempTitle, tempId, tempPrice, tempDiscount, tempIsOnDiscount);
        addBook(book);


    }

    public void readPen(Scanner input) {
        String tempName;
        double tempPrice;
        int tempId;
        int tempDiscount;
        boolean tempIsOnDiscount;
        System.out.println("Type the name of the pen to add: ");
        tempName = input.next();
        System.out.println( "----->?>>>>>>>>>>" + tempName);

        System.out.println("Type the price of " + tempName + ": ");
        tempPrice = input.nextDouble();
        System.out.println(tempPrice);

        System.out.println("Type the ID of " + tempName + ": ");
        tempId = input.nextInt();
        System.out.println(tempId);

        System.out.println("What discout does apply to " + tempName + ": ");
        tempDiscount = input.nextInt();
        System.out.println(tempDiscount);

        System.out.println("Discount applied for " + tempName + "? true/false ");
        tempIsOnDiscount = input.nextBoolean();
        System.out.println(tempIsOnDiscount);

        Pen pen = new Pen(tempName, tempId, tempPrice, tempDiscount, tempIsOnDiscount);
        addPens(pen);
    }

    public void readNotebook(Scanner input) {
        String tempName;
        double tempPrice;
        int tempId;
        int tempDiscount;
        boolean tempIsOnDiscount;
        System.out.println("Type the name of the notebook to add: ");
        tempName = input.next();
        System.out.println(tempName);

        System.out.println("Type the price of " + tempName + ": ");
        tempPrice = input.nextDouble();
        System.out.println(tempPrice);

        System.out.println("Type the ID of " + tempName + ": ");
        tempId = input.nextInt();
        System.out.println(tempId);

        System.out.println("What discout does apply to " + tempName + ": ");
        tempDiscount = input.nextInt();
        System.out.println(tempDiscount);

        System.out.println("Discount applied for " + tempName + "? true/false ");
        tempIsOnDiscount = input.nextBoolean();
        System.out.println(tempIsOnDiscount);

        Notebook notebook = new Notebook(tempName, tempId, tempPrice, tempDiscount, tempIsOnDiscount);
        addNotebook(notebook);
    }
}








