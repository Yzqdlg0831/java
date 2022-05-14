package com.whpu.cwb;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;
public class AccountWithSyncUsingLock {
    private static Account account = new Account();
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 100; i++) {      executor.execute(new AddAPennyThread());    }
        executor.shutdown();
        // Wait until all tasks are finished
        while (!executor.isTerminated()) {    }
        System.out.println("What is balance ? " + account.getBalance());
    }
    private static class AddAPennyThread implements Runnable {
        public void run() {      account.deposit(1);    }
    }
    private static class Account {
        private static Lock lock = new ReentrantLock(); // Create a lock
        private int balance = 0;
        public int getBalance() {      return balance;    }
        public void deposit(int amount) {
            lock.lock(); // Acquire the lock
            try {
                int newBalance = balance + amount;
                Thread.sleep(5);
                balance = newBalance;
            }catch (InterruptedException ex) {      }
            finally {        lock.unlock(); // Release the lock
            }
        }
    }
}