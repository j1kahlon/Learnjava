package firstprogram;

public class MainClass {

	public static void main(String[] args) {
		PenDrive myPenDrive = new PenDrive();
		myPenDrive.brand ="hp";
		myPenDrive.model="hp vcws";
		myPenDrive.capacity="128 gb";
		myPenDrive.price=1000;
		myPenDrive.usbSpecification=2.0;
		myPenDrive.isThisCompatibleWithAllOperatingSystem=true;
		myPenDrive.penDriveQuality();
		// TODO Auto-generated method stub

	}

}