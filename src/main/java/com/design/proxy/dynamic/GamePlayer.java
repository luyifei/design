package com.design.proxy.dynamic;

public class GamePlayer implements IGamePlayer {
    private String name = "";

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String username, String password) {
        System.out.println("������" + name + " �û�����" + username);
    }

    @Override
    public void killBoss() {
        System.out.println(name + "ɱ����Boss!");

    }

    @Override
    public void upgrade() {
        System.out.println(name + " ����һ����");
    }

}
