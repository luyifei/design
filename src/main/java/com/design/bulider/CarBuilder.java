package com.design.bulider;

import java.util.ArrayList;

/**
 * 抽象建造者
 * 
 * @author sunny
 *
 */
public abstract class CarBuilder {
	public abstract void setSequence(ArrayList<String> sequence);

	public abstract CarModel getCarModel();

}
