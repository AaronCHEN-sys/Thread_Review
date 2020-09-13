package com.java.thread;

/**
 * Description:	   线程并发问题<br/>
 * Date:     0013, September 13 09:19 <br/>
 *
 * @author Aaron CHEN
 * @see
 */
public class ThreadConcurrency extends Thread {

    public ThreadConcurrency() {
    }

    public ThreadConcurrency(String name) {
        super(name);
    }

    /**
     * 定义共享的数据100张车票
     */
    static int tickets = 100;

    @Override
    public void run() {
        try {
            while (true) {
                if (tickets > 0) {
                    System.out.println(this.getName() + "卖出的座位是" + (tickets--) + "号");
                } else {
                    break;
                }
                //线程休眠（暂停执行）
                Thread.sleep(200);
            }
            System.out.println(this.getName() + "买票结束！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ThreadConcurrency t1 = new ThreadConcurrency("窗口1");
        ThreadConcurrency t2 = new ThreadConcurrency("窗口2");
        ThreadConcurrency t3 = new ThreadConcurrency("窗口3");
        ThreadConcurrency t4 = new ThreadConcurrency("窗口4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
