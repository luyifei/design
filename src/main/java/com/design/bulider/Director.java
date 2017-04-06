package com.design.bulider;

import java.util.ArrayList;

/**
 * µº—›¿‡
 * 
 * @author sunny
 *
 */
public class Director {
	private BCCarModelBuilder bcBuilder = new BCCarModelBuilder();
	private BMWCarModelBuilder bmwBuilder = new BMWCarModelBuilder();

	public BCCarModel getABCCarModel() {
		ArrayList<String> sequence = new ArrayList<>();
		sequence.add("start");
		sequence.add("boom");
		sequence.add("stop");
		bcBuilder.setSequence(sequence);
		return (BCCarModel) bcBuilder.getCarModel();
	}

	public BCCarModel getBBCCarModel() {
		ArrayList<String> sequence = new ArrayList<>();
		sequence.clear();
		sequence.add("boom");
		sequence.add("start");
		sequence.add("stop");
		bcBuilder.setSequence(sequence);
		return (BCCarModel) bcBuilder.getCarModel();
	}

	public BMWCarModel getCBMWCarModel() {
		ArrayList<String> sequence = new ArrayList<>();
		sequence.clear();
		sequence.add("start");
		sequence.add("alerm");
		sequence.add("stop");
		bmwBuilder.setSequence(sequence);
		return (BMWCarModel) bmwBuilder.getCarModel();
	}

	public BMWCarModel getDBMWCarModel() {
		ArrayList<String> sequence = new ArrayList<>();
		sequence.clear();
		sequence.add("alerm");
		sequence.add("start");
		sequence.add("stop");
		bmwBuilder.setSequence(sequence);
		return (BMWCarModel) bmwBuilder.getCarModel();
	}
}
