package com.skilldistillery.jets.entities;

public class Enterprise extends Jet implements CombatReady{
	
	public Enterprise (String model, double speed, int range, long price) {
		super(model,speed,range,price);
	}

	@Override
	public String toString() {
		return "Enterprise Model: " + getModel() + " Speed: " + getSpeed() + " Range: " + getRange()
				+ " Price: " + getPrice();
	}

	@Override
	public void DogFight() {
		System.out.println("Pew Pew Pew Take Evasive Manuevers!");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	
	
}
