package com.design.bulider;

/**
 * ²úÆ·Àà
 * @author sunny
 *
 */
public class BCCarModel extends CarModel {

	@Override
	public void boom() {
		System.out.println("BCBoom");
	}

	@Override
	public void alerm() {
		System.out.println("BCAlerm");
	}

	@Override
	public void start() {
		System.out.println("BCStart");
	}

	@Override
	public void stop() {
		System.out.println("BCStop");
	}

}
