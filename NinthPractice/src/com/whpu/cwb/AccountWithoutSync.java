package com.whpu.cwb;
import java.util.concurrent.*;
public class AccountWithoutSync {
    private static Account account = new Account();
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {      executor.execute(new AddAPennyThread());    }
        executor.shutdown();
        while (!executor.isTerminated()) {    } // Wait until all tasks are finished
        System.out.println("What is balance ? " + account.getBalance());
    }
    // A thread for adding a penny to the account
    private static class AddAPennyThread implements Runnable {
        public void run() {      account.deposit(1);    }
    }
    // An inner class for account
    private static class Account {
        private int balance = 0;
        public int getBalance() {      return balance;    }
        public void deposit(int amount) {//存钱
            int newBalance = balance + amount;
            // This delay is deliberately added to magnify the data-corruption problem and make it easy to see.
            try {        Thread.sleep(1);
            } catch (InterruptedException ex) {      }
            balance = newBalance;
        }
    }
}
