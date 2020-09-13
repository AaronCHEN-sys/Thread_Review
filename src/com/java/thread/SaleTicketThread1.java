package com.java.thread;

/**
 * Description:	   线程并发问题的解决一<br/>
 * Date:     0013, September 13 09:19 <br/>
 *
 * @author Aaron CHEN
 * @see
 */
public class SaleTicketThread1 extends Thread {

    public SaleTicketThread1() {
    }

    public SaleTicketThread1(String name) {
        super(name);
    }

    //创建一个锁对象，这个对象是多个线程对象共享的数据
    static Object object = new Object();

    /**
     * 定义共享的数据100张车票
     */
    static int tickets = 100;

    @Override
    public void run() {
        try {
            while (true) {
                synchronized (object) {
                    if (tickets > 0) {
                        System.out.println(this.getName() + "卖出的座位是" + (tickets--) + "号");
                    } else {
                        break;
                    }
                }
                //线程休眠（暂停执行）
                Thread.sleep(1000);
            }
            System.out.println(this.getName() + "买票结束！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SaleTicketThread1 t1 = new SaleTicketThread1("窗口1");
        SaleTicketThread1 t2 = new SaleTicketThread1("窗口2");
        SaleTicketThread1 t3 = new SaleTicketThread1("窗口3");
        SaleTicketThread1 t4 = new SaleTicketThread1("窗口4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
