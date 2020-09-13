package com.java.thread.communication1;

/**
 * Description:	   线程通信的共享数据<br/>
 * Date:     0013, September 13 10:47 <br/>
 *
 * @author Aaron CHEN
 * @see
 */
public class Basket {

    private boolean empty;

    public Basket() {
    }

    public Basket(boolean empty) {
        this.empty = empty;
    }

    public boolean getEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }
}
