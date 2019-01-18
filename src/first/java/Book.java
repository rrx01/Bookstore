package first.java;

public class Book {
    private String title;
    private int id;
    private double price;
    private boolean isOnDiscount;
    private int offerDiscount;

    public Book (String title,int id, double price, int offerDiscount, boolean isOnDiscount) {
      this.title = title;
      this.id = id;
      this.price = price;
      this.offerDiscount = offerDiscount;
      this.isOnDiscount = isOnDiscount;

    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        if (this.isOnDiscount) {
           return  price - (price * (offerDiscount/100));
        }


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

  //  public double calculateDiscount () {
    //    if (offerDiscount > 0) {
      //     return price = price - (price * (offerDiscount/100));
        //} else {
          //  return price;
        }



