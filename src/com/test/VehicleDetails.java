package com.test;

import com.city.CityNames;

public class VehicleDetails extends CityNames {
	
	public void bikes() {
		System.out.println("BIKES");
	}
	public void cars() {
		System.out.println("CARS");
	}
	
	public static void main(String[] args) {
		VehicleDetails v = new VehicleDetails();
		v.bikes();
		v.cars();
		v.trichy();
		v.chennai();
		v.petrol();
		v.diesel();
	}

}
