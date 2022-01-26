package j03_Programming;

import j03_Programming.Elevator;
import j03_Programming.Security;
import j03_Programming.Lighting;

public class OkJavaGoInHome {

	public static void main(String[] args) {
		String id = "JAVA APT 507";
		
		// Elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
				
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		// Light on
		Lighting hallLamp = new Lighting(id+" / Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id +" / FloorLamp");
		floorLamp.on();

	} // main

} // class
