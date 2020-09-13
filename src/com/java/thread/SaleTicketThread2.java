package com.java.thread;

/**
 * Description:	   线程并发问题的解决二<br/>
 * Date:     0013, September 13 09:39 <br/>
 *
 * @author Aaron CHEN
 * @see
 */
public class SaleTicketThread2 implements Runnable {


    /**
     * 定义共享的数据100张车票
     */
    int tickets = 100;

    //创建一个锁对象，这个对象是多个线程对象共享的数据
    Object object = new Object();

    @Override
    public void run() {
        try {
            while (true) {
                if (tickets > 0) {
                    System.out.println(Thread.currentThread().getName() + "卖出的座位是" + (tickets--) + "号");
                } else {
                    break;
                }
                //线程休眠（暂停执行）
                Thread.sleep(200);
            }
            System.out.println(Thread.currentThread().getName() + "买票结束！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        SaleTicketThread2 saleTicketThread2 = new SaleTicketThread2();

        Thread t1 = new Thread(saleTicketThread2, "窗口1");
        Thread t2 = new Thread(saleTicketThread2, "窗口2");
        Thread t3 = new Thread(saleTicketThread2, "窗口3");
        Thread t4 = new Thread(saleTicketThread2, "窗口4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
