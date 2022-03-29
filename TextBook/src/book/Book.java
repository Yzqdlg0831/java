package book;

public class Book {
    private String name;
    private String author;
    private int price;
    private String type;
    private boolean borrowed;

    public Book(String name, String author, int price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        return "图书：" + this.name +"  作者：" + this.author + "  售价："
                + this.price + "  图书类型：" + this.type + "  状态：" + this.isBorrowed();
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

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String isBorrowed() {
        return this.borrowed?"借出":"未借出";
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }
}
