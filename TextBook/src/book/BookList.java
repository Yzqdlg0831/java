package book;

public class BookList {
    private Book[] books = new Book[100];
    private int size;

    public BookList() {
        books[0] = new Book("西游记","吴承恩",20,"小说");
        books[1] = new Book("三国演义","罗贯中",28,"小说");
        books[2] = new Book("红楼梦","曹雪芹",31,"小说");
        size = 3;
    }


    public Book getBooks(int ver) {
        return books[ver];
    }

    public void setBooks(int size,Book book) {
        books[size] = book;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
