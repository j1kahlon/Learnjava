package amusementPark;

import java.util.Scanner;

public class MainaAmusementPark {
	

	public static void main(String[] args) {
		AmusementParkRides amusementParkRides = new AmusementParkRides();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter person height");

amusementParkRides.height = sc.nextInt();
		amusementParkRides.ridesAllowed();
		

	}

}
