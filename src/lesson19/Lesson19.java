package lesson19;

import lesson8.L8Cars;
import utils.CarUtils;

import java.util.List;

public class Lesson19 {

    public static void numbersForPrint1 (int start, int end) {
       Runnable runnable = new Runnable() {
           @Override
           public void run() {
               for (int i = start; i <= end ; i++) {
                   System.out.println(i);
               }
           }
       };

        Thread thread = new Thread(runnable);
        thread.start(); // ljubomu Thred-u nado propisat' start
    };

    public static void numbersForPrint2 (int start, int end) {
        new Thread(() -> {
            for (int i = start; i <= end ; i++) {
                System.out.println(i);
            }
        }).start();

    }

    private static int price = 100;

    private static volatile int prc = 10;

    private synchronized static int incrementPrice( int increment){
        return prc += increment;
    }




    public static void main(String[] args) throws InterruptedException {

        /*System.out.println("Hello from main Tread!!!");

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2_000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Play MUSIC");
            }
        };

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Print me DOCUMENTS");
            }
        };

        MyThread myThread1 = new MyThread(runnable1, "Tread Nr 1 ");
        MyThread myThread2 = new MyThread(runnable2, "Tread Nr 2 ");
        MyThread myThread3 = new MyThread(() -> System.out.println("Print my FOTO"),
                "Tread Nr3 ");

        System.out.println("Drink cofee...");

        myThread1.start();
        myThread2.start();

        myThread1.join();
        myThread2.join();

        System.out.println("Come back");*/

        //numbersForPrint1(0,5);
        //numbersForPrint1(10,15);
        //numbersForPrint1(20,25);

        //numbersForPrint2(0,100);
        //numbersForPrint2(101,200);
        //numbersForPrint2(201,300);

        /*Runnable runnable1FRC = new Runnable() {
            @Override
            public void run() {
                try {Thread.sleep(1_000);
                    System.out.println("Before Incremet R1 : " + price);
                    price++;
                    System.out.println("After Increment R1 : " + price);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };*/

        /*Runnable runnable2FRC = new Runnable() {
            @Override
            public void run() {
                System.out.println("Before Incremet R2 : " + price);
                price+=2;
                System.out.println("After Increment R2 : " + price);
            }
        };*/

        //new Thread(runnable1FRC).start();
        //new Thread(runnable2FRC).start();

        /*Runnable runnable1getPrice = new Runnable() {
            @Override
            public void run() {
                try {Thread.sleep(1_000);
                    System.out.println("Before Incremet R1 getPrice: " + prc);
                    incrementPrice(1);
                    System.out.println("After Increment R1 getPrice: " + prc);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable runnable2getPrice = new Runnable() {
            @Override
            public void run() {
                System.out.println("Before Incremet R2 getPrice : " + prc);
                incrementPrice(2);
                System.out.println("After Increment R2 getPrice: " + prc);
            }
        };

        new Thread(runnable1getPrice).start();
        new Thread(runnable2getPrice).start();*/

        List<L8Cars> carsForThread = CarUtils.generListCar(10);
        printCarsInTwoThreads(carsForThread);

    }
    private static void printCarsInTwoThreads (List<L8Cars> cars){

        List<L8Cars> part1 = cars.subList(0, cars.size()/2);
        List<L8Cars> part2 = cars.subList(cars.size()/2, cars.size());

        Runnable runnableForCars1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1 : " + part1);
            }
        };

        Runnable runnableForCars2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 2 : " + part2);
            }
        };

        new Thread(runnableForCars1).start();
        new Thread(runnableForCars2).start();
    }
}


