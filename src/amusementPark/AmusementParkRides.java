package amusementPark;

public class AmusementParkRides {
	int height;

	void ridesAllowed() {
		
		if (height >= 90 && height <= 200)
			System.out.println("Allowed to take Rides");
		else {
			System.out.println("Not Allowed to take Rides");
		}
	}

}
