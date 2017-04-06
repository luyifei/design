package com.design.bulider;

import java.util.ArrayList;
/**
 * 产品抽象类
 * @author sunny
 *
 */
public abstract class CarModel {
	private ArrayList<String> sequence = new ArrayList<>();

	public abstract void boom();

	public abstract void alerm();

	public abstract void start();

	public abstract void stop();

	public void setSequence(ArrayList<String> sequence) {
		this.sequence = sequence;
	}

	public void run() {
		for (String string : sequence) {
			switch (string) {
			case "boom":
				boom();
				break;
			case "alerm":
				alerm();
				break;
			case "start":
				start();
				break;
			case "stop":
				stop();
				break;
			}
		}
	}
}
