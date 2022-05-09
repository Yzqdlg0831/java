package com.whpu.cwb;
import java.util.*;
public class TestTreeSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("London");    set.add("Paris");    set.add("New York");
        set.add("San Francisco");    set.add("Beijing");    set.add("New York");
        TreeSet<String> treeSet = new TreeSet<>(set);
        System.out.println("Sorted tree set: " + treeSet);//按字符串大小排序输出
        // Use the methods in SortedSet interface
        System.out.println("first(): " + treeSet.first());   //第一个元素
        System.out.println("last(): " + treeSet.last());    //最后一个元素　
        //New York 之前的那些元素　
        System.out.println("headSet(\"New York\"): " +    treeSet.headSet("New York"));
        //New York及其 之后的那些元素　
        System.out.println("tailSet(\"New York\"): " +       treeSet.tailSet("New York"));

        // Use the methods in NavigableSet interface
        System.out.println("lower(\"P\"): " + treeSet.lower("P"));       //<P的最大
        System.out.println("higher(\"P\"): " + treeSet.higher("P"));	    //>P的最小
        System.out.println("floor(\"P\"): " + treeSet.floor("P"));		//<=P的最大
        System.out.println("ceiling(\"P\"): " + treeSet.ceiling("P")); 	//>=P的最小
        System.out.println("pollFirst(): " + treeSet.pollFirst());	//删除第一个并返回值
        System.out.println("pollLast(): " + treeSet.pollLast()); //删除最后一个并返回值
        System.out.println("New tree set: " + treeSet);
    }
}