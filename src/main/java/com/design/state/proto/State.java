package com.design.state.proto;

/**
 * ����״̬��ɫ
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
