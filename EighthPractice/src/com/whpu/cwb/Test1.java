package com.whpu.cwb;
import java.util.ArrayList;
public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> ArrayList = new ArrayList<String>();
        ArrayList.add("张三");
        ArrayList.add("李四");
        ArrayList.add("王五");
        ArrayList.add("马六");
        ArrayList.add("赵六");
        System.out.println(ArrayList);
        System.out.println(ArrayList.size());
        for (int i = 0; i < 3; i++) {
            System.out.println("删除的第"+(i+1)+"个元素："+ArrayList.get(i));
            ArrayList.remove(i);
        }
        System.out.println(ArrayList);
        System.out.println(ArrayList.size());
    }
}
