package first.java;

public class Notebook {
    private String name;
    private int id;
    private double price;
    private boolean isOnDiscount;
    private int offerDiscount;

    public Notebook (String name, int id, double price, int offerDiscount, boolean isOnDiscount) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.offerDiscount = offerDiscount;
        this.isOnDiscount = isOnDiscount;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOnDiscount() {
        return isOnDiscount;
    }

    public void setOnDiscount(boolean onDiscount) {
        isOnDiscount = onDiscount;
    }

    public int getOfferDiscount() {
        return offerDiscount;
    }

    public void setOfferDiscount(int offerDiscount) {
        this.offerDiscount = offerDiscount;
    }


}
