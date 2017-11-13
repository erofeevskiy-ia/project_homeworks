package com.epam.javacore.homework.hw7.task1;

public class UseBills {


    public static void main(String[] args) {
        Bill bill_1 = new Bill("123");
        Bill bill_2 = new Bill("111");
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5000; i++) {
                Bill.transaction(bill_1,bill_2,1);
                //System.out.println(Thread.currentThread().getName()+" - "+bill_1.getBalance());
                //sleepThread(150);
            }
            //sleepThread(2000);
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5000; i++) {
                Bill.transaction(bill_1,bill_2,1);
                // System.out.println(Thread.currentThread().getName()+" - "+bill_1.getBalance());
                //sleepThread(50);
            }
        });
        t1.setName("mythread-1");
        t2.setName("mythread-2");
        t1.start();
        t2.start();
        //sleepThread(500);
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(bill_1.getBalance());
        System.out.println(bill_2.getBalance());
        bill_1.saveAndClose();
        bill_2.saveAndClose();

    }

    private static void sleepThread(long mills) {
        try {
            System.out.println(Thread.currentThread().getName());
            Thread.currentThread().sleep(mills);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
