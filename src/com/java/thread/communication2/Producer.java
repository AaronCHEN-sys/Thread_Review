package com.java.thread.communication2;

/**
 * Description:	   生产者<br/>
 * Date:     0013, September 13 10:49 <br/>
 *
 * @author Aaron CHEN
 * @see
 */
public class Producer implements Runnable {

    private Basket basket;

    public Producer(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void run() {
        while (true) {
            //定义同步代码块
            synchronized (basket) {
                try {
                    if (!basket.getEmpty()) {
                        //线程等待
                        basket.wait();
                    }
                    System.out.println("开始生产水果");
                    basket.setEmpty(false);

                    //通知在这个共享对象上等待的线程
                    basket.notify();

                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
