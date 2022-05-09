package com.whpu.cwb;

import java.util.*;
public class TestHashSet {
    public static void main(String[] args) {
        // Create a hash set
        Set<String> set = new HashSet<>();

        // Add strings to the set
        set.add("London");	    	set.add("Paris");
        set.add("New York");		set.add("San Francisco");
        set.add("Beijing");	    	set.add("New York");//重复的元素仅添加一次
        System.out.println(set);
        // [San Francisco, Beijing, New York, London, Paris] 顺序没有按照添加顺序存放

        // Display the elements in the hash set
        for (String s: set) {      System.out.print(s.toUpperCase() + " ");    }
        //SAN FRANCISCO BEIJING NEW YORK LONDON PARIS
    }
}