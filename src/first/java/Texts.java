package first.java;

public class Texts {

    private static String mainMenu = "Main Menu:\n" + "\t" + "\n1.Add Products" + "\n2.List Products" + "\n3.Buy" + "\n4.Exit" + "\n";
    private static String addProductMenu = "Add Product Menu:\n" + "\t" + "\n1.Add book" + "\n2.Add notebook" + "\n3.Add first.java.Pen" + "\n4.Back" + "\n";
    private static String buyMenu = "Buy Menu:\n" + "\t" + "\n1.Add Product to shopping cart" + "\n2.Total price" + "\n3.Checkout" + "\n4.Back" + "\n";
    private static String listProductsMenu = "List Products Menu:\n" + "\t" + "\n1.Show Books" + "\n2.Show Notebooks" + "\n3.Show Pens" + "\n4.Back";



    public void getMainMenu() {
        System.out.println(mainMenu);
    }
    public void getaddProductMenu() {
        System.out.println(addProductMenu);
    }
    public void getbuyMenu () {
        System.out.println(buyMenu);
    }
    public void getlistProductsMenu () {
        System.out.println(listProductsMenu);
    }

}

