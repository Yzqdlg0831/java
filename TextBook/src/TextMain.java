import book.*;
import operation.*;
import user.*;

import java.util.Scanner;

public class TextMain {
    public static User login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的姓名:");
        String name = scanner.next();
        System.out.println("请输入您的身份(1 表示管理员, 0 表示普通用户):");
        int who = scanner.nextInt();
        if (who == 1) {
            return new Admin(name);
        }
        return new NormalUser(name);
    }
    public static void main(String[] args) {
        // 1. 准备基本的数据
        BookList bookList = new BookList();
        // 2. 创建用户
        User user = login();
        // 3. 进入主循环
        while (true) {
            int choice = user.menu();
            user.doOperation(choice, bookList);
        }
    }
}
