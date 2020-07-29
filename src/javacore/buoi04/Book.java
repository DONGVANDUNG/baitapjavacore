package javacore.buoi04.com;

public class Book {
    private String name;
    private String author;
    private float price;
    private int totalSold;

    public Book(String name, String author, float price, int totalSold) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.totalSold = totalSold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getTotalSold() {
        return totalSold;
    }

    public void setTotalSold(int totalSold) {
        this.totalSold = totalSold;
    }

    public boolean isBestseller() {
        if (getTotalSold() > 1000) {
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", totalSold=" + totalSold +
                '}';
    }
}

