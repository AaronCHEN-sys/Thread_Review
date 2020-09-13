package com.java.thread.communication2;

/**
 * Description:	   <br/>
 * Date:     0013, September 13 10:59 <br/>
 *
 * @author Aaron CHEN
 * @see
 */
public class Consumer implements Runnable {

    private Basket basket;

    public Consumer(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (basket) {
                try {
                    if (basket.getEmpty()) {
                        //线程等待
                        basket.wait();
                    }
                    System.out.println("开始消费水果");
                    basket.setEmpty(true);

                    basket.notify();

                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
