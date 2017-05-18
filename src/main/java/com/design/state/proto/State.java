package com.design.state.proto;

/**
 * ³éÏÐ×´Ì¬½ÇÉ«
 * 
 * @author sunny
 *
 */
public abstract class State {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void doSomething1();

    public abstract void doSomething2();
}
