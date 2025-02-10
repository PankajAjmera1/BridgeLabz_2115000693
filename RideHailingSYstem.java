abstract class VehicleR {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public VehicleR(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per KM: " + ratePerKm);
    }
}

class CarR extends VehicleR {
    public CarR(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }
}

class BikeR extends VehicleR {
    public BikeR(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }
}

class Auto extends VehicleR {
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

public class RideHailingSYstem {
    public static void main(String[] args) {
        VehicleR car = new CarR("C123", "Pat", 10);
        VehicleR bike = new BikeR("B456", "Starc", 5);
        VehicleR auto = new Auto("A789", "John", 7);

   

        displayDetails(car, 10);
        displayDetails(bike, 5);
        displayDetails(auto, 8);
    }

    public static void displayDetails(VehicleR vehicle, double distance) {
        System.out.println("Vehicle Type: " + vehicle.getClass().getSimpleName());
        System.out.println("Vehicle ID: " + vehicle.getVehicleId());
        System.out.println("Driver Name: " + vehicle.getDriverName());
        System.out.println("Rate per KM: " + vehicle.getRatePerKm());
        System.out.println("Distance Travelled: " + distance + " KM");
        System.out.println("Total Fare: " + vehicle.calculateFare(distance));
        System.out.println("------------------------------------------\n");
    }
}
