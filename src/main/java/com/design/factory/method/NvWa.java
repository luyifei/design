package com.design.factory.method;

public class NvWa {
public static void main(String[] args) {
	AbstractHumanFactory humanFactory = new HumanFactory();
	Human blackHuman = humanFactory.createHuman(BlackHuman.class);
	Human yellowHuman = humanFactory.createHuman(YellowHuman.class);
	Human whiteHuman = humanFactory.createHuman(WhiteHuman.class);
	blackHuman.getColor();
	blackHuman.talk();
	yellowHuman.getColor();
	yellowHuman.talk();
	whiteHuman.getColor();
	whiteHuman.talk();
}
}
