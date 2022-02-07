package j03_Programming;

import javax.swing.JOptionPane;

import j03_Programming.Elevator;
import j03_Programming.Security;
import j03_Programming.Lighting;


public class OkJavaGoInHomeInput {
	
	// parameter, 매개변수
	public static void main(String[] args) {
		
		String id = args[0];
		String bright = args[1];
		
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
		
		DimmingLights moodLamp = new DimmingLights(id+" moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
		
	} // main

} // class
