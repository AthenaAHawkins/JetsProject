package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//no scanner
public class Airfield {
	Scanner scan = new Scanner(System.in);
	private List<Jet> fleet;

	public Airfield() {
		readJets("jets.txt");
	}

	private List<Jet> readJets(String filename) {
		fleet = new ArrayList<>();

		try (BufferedReader bufIn = new BufferedReader(new FileReader(filename))) {
			String line;

			while ((line = bufIn.readLine()) != null) {
				String[] jetRecord = line.split(",");
				String name = jetRecord[0];
				double speed = Double.parseDouble(jetRecord[1]);
				int range = Integer.parseInt(jetRecord[2]);
				long price = Long.parseLong(jetRecord[3]);
				Jet j = null;
				if (name.equals("Starship Enterprise")) {
					j = new Enterprise(name, speed, range, price);
//					System.out.println(j);

				}
				if (name.equals("Federation Freighter")) {
					j = new FederationFreighter(name, speed, range, price);
//					System.out.println(j);

				}
				if (name.equals("Escape Pod")) {
					j = new EscapePod(name, speed, range, price);
//					System.out.println(j);
				}
				fleet.add(j);
			}
		} catch (IOException e) {
			System.err.println(e);
		}
		return fleet;
	}

	public void listFleet() {
		System.out.println("All docked aircraft are as follows: ");
		for (int i = 0; i < fleet.size(); i++) {
			if (fleet != null) {
				System.out.println(fleet.get(i));
			}
		}
	}

	public void flyAllJets() { // DST distance speed time // worked through them till I settled upon the fore
		for (Jet jet : fleet) {
			double speed = jet.getSpeed();
			int range = jet.getRange();
			double time = range / speed;
			System.out.println(jet + " TIME REMAINING IN FLIGHT " + time);
		}
	}

	public void viewFastestJet() {
		double fastestJetSpeed = 0;
		Jet fastestJet = null;
		for (Jet jet : fleet) {
			if (jet.getSpeed() > fastestJetSpeed) {
				fastestJetSpeed = jet.getSpeed();
				fastestJet = jet;
			}
		}
		System.out.println(fastestJet);
	}

	public void longestRange() {
		Jet longestRanged = null;
		int longestRange = 0;
		for (Jet jet : fleet) {
			if (jet.getRange() > longestRange) {
				longestRange = jet.getRange();
				longestRanged = jet;
			}
		}
		System.out.println(longestRanged);
	}

	public void loadCargoCarrier() {
		for (Jet jet : fleet) {
			if (jet instanceof FederationFreighter) {
				((FederationFreighter) jet).loadCargo();

			}
		}
	}

	public void evasiveManeuvers() {
		for (Jet jet : fleet) {
			if (jet instanceof Enterprise) {
				((Enterprise) jet).DogFight();

			}
		}
	}

	public void addJet() {
		System.out.println("Add your Jet. Starship, Freighter, or an EscapePod. (Enter in Model, Speed, Range, and Price)");
		String model = scan.next();
		double speed = scan.nextDouble();
		int range = scan.nextInt();
		long price = scan.nextLong();

		if (model.toLowerCase().contains("star")) {
			fleet.add(new Enterprise(model, speed, range, price));
			return;
		}

		if (model.toLowerCase().contains("fre")) {
			fleet.add(new FederationFreighter(model, speed, range, price));
			return;
		}
		if (model.toLowerCase().contains("esc")) {
			fleet.add(new EscapePod(model, speed, range, price));
			return;
		}
		System.out.println("Wrong Input, please select from the following Types: Starship, Freighter or EscapePod");

	}

	public void removeJet() {
		System.out.println("Please select from the following list: ");
		for (int index = 0; index < fleet.size(); index++) {
			System.out.println(index + ". " + fleet.get(index));
		}
		int selection = scan.nextInt();
		fleet.remove(selection);

	}

	public List<Jet> getFleet() {
		return fleet;
	}

	public void setFleet(List<Jet> fleet) {
		this.fleet = fleet;
	}

}
// fly all jets method 
// method to display all jets 
