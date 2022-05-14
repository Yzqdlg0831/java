package com.whpu.cwb;
public class TaskThreadDemo {
    public static void main(String[] args) {
        Runnable printA = new PrintChar('a', 100); 	// Create tasks
        Runnable printB = new PrintChar('b', 100);
        Runnable print100 = new PrintNum(100);
        Thread thread1 = new Thread(printA); 		// Create threads
        Thread thread2 = new Thread(printB);
        Thread thread3 = new Thread(print100);
        thread1.start();    thread2.start();    thread3.start();	 // Start threads
    }
}
class PrintChar implements Runnable {
    private char charToPrint; // The character to print
    private int times; // The times to repeat
    public PrintChar(char c, int t) {    charToPrint = c;    times = t;  }
    public void run() {
        for (int i = 0; i < times; i++) {      System.out.print(charToPrint);    }
    }}//class PrintChar

class PrintNum implements Runnable {
    private int lastNum;
    public PrintNum(int n) {    lastNum = n;  }
    public void run() {
        for (int i = 1; i <= lastNum; i++) {      System.out.print(" " + i);    }
    }}//class PrintNum