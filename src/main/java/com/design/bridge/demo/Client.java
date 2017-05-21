package com.design.bridge.demo;

/**
 * 解决继承的缺点提出的设计模式<br>
 * 主要考虑如何拆分抽象和实现
 * 
 * @author User
 *
 */
public class Client {
    public static void main(String[] args) {
        Corp houseCorp = new HouseCorp(new House());
        Corp shanzhaiCorp = new ShanZhaiCorp(new IPod());
        houseCorp.makeMoney();
        shanzhaiCorp.makeMoney();
    }
}
