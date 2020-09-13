package com.java.thread.communication2;

/**
 * Description:	   <br/>
 * Date:     0013, September 13 11:24 <br/>
 *
 * @author Aaron CHEN
 * @see
 */
public class ThreadCommunicationDemo {

    public static void main(String[] args) {
        Basket basket = new Basket();

        Producer producer = new Producer(basket);
        Consumer consumer = new Consumer(basket);

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);

        t1.start();
        t2.start();
    }
}
