package com.whpu.cwb;

import java.util.*;

public class TestArrayAndLinkedList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1); // 1 is autoboxed to new Integer(1)
        arrayList.add(2);    arrayList.add(3);
        arrayList.add(1);    arrayList.add(4);  //[1,2,3,1,4]
        arrayList.add(0, 10);    	//[10,1,2,3,1,4]
        arrayList.add(3, 30);	//[10,1,2,30,3,1,4]
        System.out.println("A list of integers in the array list:");
        System.out.println(arrayList); //[10,1,2,30,3,1,4]

        LinkedList<Object> linkedList = new LinkedList<>(arrayList); //[10,1,2,30,3,1,4]
        linkedList.add(1, "red");		//[10,red,1,2,30,3,1,4]
        linkedList.removeLast();		//[10,red,1,2,30,3,1]
        linkedList.addFirst("green");	//[green,10,red,1,2,30,3,1]

        System.out.println("Display the linked list backward:");
        for (int i = linkedList.size() - 1; i >= 0; i--) {//逆序输出
            System.out.print(linkedList.get(i) + " ");
        }//[1,3,30,2,1,red,10,green]
    }
}
