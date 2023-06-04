package com.skilldistillery.jets.entities;

public class EscapePod extends Jet {

	public EscapePod(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public String toString() {
		return "Escape Pod Model: " + getModel() + " Speed: " + getSpeed() + " Range: " + getRange() + " Price: "
				+ getPrice();
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub

	}

}
