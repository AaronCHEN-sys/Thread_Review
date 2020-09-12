package com.java.thread;

/**
 * Description:	   创建线程的第一种方式<br/>
 * Date:     0012, September 12 20:26 <br/>
 *
 * @author Aaron CHEN
 * @see
 */
public class ThreadDemo1 extends Thread {

    public ThreadDemo1(String name) {
        super(name);
    }

    /**
     * 线程执行的逻辑体
     */
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(this.getName() + "下载了" + i + "%");
        }
    }

    public static void main(String[] args) {
        ThreadDemo1 threadDemo1 = new ThreadDemo1("线程1");
        //启动线程
        threadDemo1.start();

        ThreadDemo1 threadDemo2 = new ThreadDemo1("线程2");
        //启动线程
        threadDemo2.start();
    }
}
