package com.java.thread.communication1;

/**
 * Description:	   <br/>
 * Date:     0013, September 13 11:02 <br/>
 *
 * @author Aaron CHEN
 * @see
 */
public class ThreadCommunicationDemo {

    public static void main(String[] args) {
        Basket basket = new Basket();

        Producer producer = new Producer(basket);
        Consumer consumer = new Consumer(basket);

        producer.start();
        consumer.start();
    }
}
