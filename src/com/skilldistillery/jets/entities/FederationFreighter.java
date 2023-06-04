package com.skilldistillery.jets.entities;

public class FederationFreighter extends Jet implements CargoCarrier{

	public FederationFreighter(String model, double speed, int range, long price) {
		super(model,speed,range,price);
	}

	@Override
	public void loadCargo() {
		
		
	}

	@Override
	public String toString() {
		return "Federation Freighter Model: " + getModel() + " Speed: " + getSpeed() + " Range: "
				+ getRange() + " Price: " + getPrice();
	}

	

	
	
	
}
