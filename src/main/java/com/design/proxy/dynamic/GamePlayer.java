package com.design.proxy.dynamic;

public class GamePlayer implements IGamePlayer {
    private String name = "";

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String username, String password) {
        System.out.println("姓名：" + name + " 用户名：" + username);
    }

    @Override
    public void killBoss() {
        System.out.println(name + "杀死大Boss!");

    }

    @Override
    public void upgrade() {
        System.out.println(name + " 升了一级！");
    }

}
