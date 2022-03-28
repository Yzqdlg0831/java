package operation;

import book.BookList;

import java.util.Objects;
import java.util.Scanner;

public class DelOperation implements IOperation{

    @Override
    public void work(BookList bookList) {
        System.out.println("请输入书名：");
        String name;
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
        int i = 0;
        for (; i<bookList.getSize();i++) {
            if (Objects.equals(bookList.getBooks(i).getName(), name)){
                for (int j = i; j < bookList.getSize() - 1; j++) {
                    bookList.setBooks(j,bookList.getBooks(j+1));
                }
                bookList.setBooks(bookList.getSize() - 1,null);
                break;
            }
        }
        if(i == bookList.getSize())
            System.out.println("没有找到这本书！！");
        bookList.setSize(bookList.getSize() - 1);
    }

}
