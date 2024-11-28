package com.ibm.training.basics;

//Lx
//HeadLamps
//Lxi
//airbags
//Vx
//alloy wheels
//power steering
//Vxi
//Radio
//ADAS

public class CarVariantsUsingSwitch {

	public static void main(String[] args) {
		
		//String variant = "Vxi";
		String variant = args[0];
		
		System.out.println("The features you get in variant : "+variant);
		
		switch(variant) {
		case "Vxi":
			System.out.println("Radio");
			System.out.println("ADAS");
			//break;
		case "Vx":
			System.out.println("Alloy Wheels");
			System.out.println("Power Steering");
			//break;
		case "Lxi":
			System.out.println("Airbags");
			//break;
		case "Lx":
			System.out.println("Headlamps");
			//break;
		default:
			System.out.println("Invalid Variant");
		}

	}

}
