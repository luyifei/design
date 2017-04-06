package com.design.bulider;

import java.util.ArrayList;

/**
 * 具体建造者
 * 
 * @author sunny
 *
 */
public class BMWCarModelBuilder extends CarBuilder {
	ArrayList<String> sequence = new ArrayList<>();

	@Override
	public void setSequence(ArrayList<String> sequence) {
		this.sequence.clear();
		this.sequence = sequence;
	}

	@SuppressWarnings("unchecked")
	@Override
	public CarModel getCarModel() {
		BMWCarModel model = new BMWCarModel();
		model.setSequence((ArrayList<String>)sequence.clone());
		return model;
	}

}
