package com.design.bridge.demo;

/**
 * ����̳е�ȱ����������ģʽ<br>
 * ��Ҫ������β�ֳ����ʵ��
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
