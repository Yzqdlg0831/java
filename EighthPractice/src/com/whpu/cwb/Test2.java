package com.whpu.cwb;
import java.util.HashMap;
public class Test2 {
    public static void main(String[] args) {
        HashMap<String,String> person = new HashMap<String,String>();
        person.put("id","1");
        person.put("name","张三");
        person.put("sex","男");
        person.put("age","25");
        person.put("love","爱学Java");
        System.out.println(person);
        System.out.println(person.size());
        System.out.println("删除的元素： age:"+person.get("age"));
        person.remove("age");
        System.out.println(person.size());
    }
}
