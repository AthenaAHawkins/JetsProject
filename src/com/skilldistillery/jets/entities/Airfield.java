package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//no scanner
public class Airfield {
	private List<Jet> fleet;
//	String filename = "Jets.txt";
//	Airfield af = new Airfield();
//	List<Jet> jets = af.readJets(filename);

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
				if (name.equals("Starship Enterprise")) {
					Jet j = new Enterprise(name, speed, range, price);
					fleet.add(j);

				}
				if (name.equals("Federation Freighter")) {
					Jet j = new FederationFreighter(name, speed, range, price);
					fleet.add(j);

				}
				if (name.equals("Escape Pod")) {
					Jet j = new EscapePod(name, speed, range, price);
					fleet.add(j);
				}

			}
		} catch (IOException e) {
			System.err.println(e);
		}
		return fleet;
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
