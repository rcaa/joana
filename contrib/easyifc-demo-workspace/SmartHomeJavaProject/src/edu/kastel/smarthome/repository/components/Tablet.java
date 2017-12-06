package edu.kastel.smarthome.repository.components;

import edu.kastel.smarthome.repository.interfaces.EnergyControlling;
import edu.kastel.smarthome.repository.interfaces.TabletControlling;

public class Tablet implements TabletControlling {
	@SuppressWarnings("unused")
	private EnergyControlling energyControlling;

	public Tablet(EnergyControlling energyControlling) {
		this.energyControlling = energyControlling;		
	}

	@Override
	public int switchOn(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getConsumption(boolean present) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public void setPresence(boolean present) {
		// TODO Auto-generated method stub
		
	}
	
}
