package com.design.observe.demo;

import java.util.Observable;
import java.util.Observer;

/**
 * ������--�۲���
 * 
 * @author sunny
 *
 */
public class Subscribe implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("reading... " + arg.toString());
    }

}
