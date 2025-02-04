class Vehicle {
    private static double registrationFee = 525;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }
}

public class VehicleRegistration {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Pankaj", "Car", "UP85");
        Vehicle vehicle2 = new Vehicle("Krish", "Moto Car", "UP86");

        System.out.println("\nBefore Updating Reg:");

        vehicle1.displayDetails();
        vehicle2.displayDetails();

        Vehicle.updateRegistrationFee(700);

        System.out.println("\nAfter Updating Reg:");

        vehicle1.displayDetails();
        vehicle2.displayDetails();
    }
}
