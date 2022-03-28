package user;
// User 类是一个抽象类, 每个子类需要做两件事情
// 1. 初始化对应的操作数组
// 2. 实现 Menu 菜单
import book.BookList;
import operation.IOperation;

abstract public class  User {
    protected String name;
    protected IOperation[] operations;

    abstract public int menu();

    public void doOperation(int choice, BookList bookList) {
        operations[choice].work(bookList);
    }
}
