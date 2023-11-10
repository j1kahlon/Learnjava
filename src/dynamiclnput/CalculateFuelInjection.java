package dynamiclnput;

public class CalculateFuelInjection {

	int xThrottle, yFuel;

	void calculateFuelInjection() {
		// boolean isXlessThan127 = xThrottle<=127;
		// if(condition/compariaion){code that will be executed when the result of
		// condition is true}

		if (xThrottle <= 127) {

			yFuel = xThrottle * 2;
		}
		else {
			yFuel = xThrottle + 127;
		}

		System.out.println("yFuel value is :" + yFuel);
	}

}
