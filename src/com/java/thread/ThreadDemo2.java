package com.java.thread;

/**
 * Description:	   创建线程的第二种方式<br/>
 * Date:     0012, September 12 21:51 <br/>
 *
 * @author Aaron CHEN
 * @see
 */
public class ThreadDemo2 implements Runnable {

    private String name;

    public ThreadDemo2(String name) {
        this.name = name;
    }

    /**
     * 线程执行的逻辑体
     */
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(this.name + "下载了" + i + "%");
        }
    }

    public static void main(String[] args) {
        //创建线程对象
        Thread thread1 = new Thread(new ThreadDemo2("线程1"));
        Thread thread2 = new Thread(new ThreadDemo2("线程2"));

        //启动线程
        thread1.start();
        thread2.start();
    }
}
