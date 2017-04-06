package com.design.bulider;

/**
 * ²úÆ·Àà
 * @author sunny
 *
 */
public class BMWCarModel extends CarModel{

	@Override
	public void boom() {
		System.out.println("BMWBoom");
	}

	@Override
	public void alerm() {
		System.out.println("BMWAlerm");
	}

	@Override
	public void start() {
		System.out.println("BMWStart");
	}

	@Override
	public void stop() {
		System.out.println("BMWStop");
	}

}
