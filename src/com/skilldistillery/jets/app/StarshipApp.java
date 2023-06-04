package com.skilldistillery.jets.app;

import java.util.List;
import java.util.Scanner;

import com.skilldistillery.jets.entities.Airfield;
import com.skilldistillery.jets.entities.Jet;

public class StarshipApp {
public static void main(String[] args) {
	StarshipApp sa = new StarshipApp();
	sa.run();
	
	
}
	public void run() {
		Airfield af = new Airfield();
		System.out.println("Welcome Captain, Startup Sequence, Launched");
		Scanner scan = new Scanner(System.in);
		
		boolean ifRunning = true;
		while (ifRunning) {
			menu();
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				af.listFleet();
				break;
			case 2: 
				af.flyAllJets();
				break;
			default:
				System.out.println("Improper input, try again");
			}
		
		}
		
	}
	public void menu() {
		System.out.println("1. List Fleet");
		System.out.println("2. Fly All Jets");
		System.out.println("3. View Fastest Jet");
		System.out.println("4. View Jet with longest range ");
		System.out.println("5. Load all cargo jets");
		System.out.println("6. Dogfight ");
		System.out.println("7. Add a jet to fleet");
		System.out.println("8. Remove a jet from fleet");
		System.out.println("9. Quit");
		
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "StarshipApp [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
		
// owns scanner
// needs to go to airfield app for all information about the jets 


}
