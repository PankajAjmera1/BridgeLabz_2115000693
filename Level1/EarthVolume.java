public class EarthVolume {
    public static void main(String[] args) {
        final double EARTH_RADIUS_KM = 6378;
        final double PI = Math.PI;
        
        double volumeKm = (4.0/3) * PI * Math.pow(EARTH_RADIUS_KM, 3);
        double volumeMiles = volumeKm / Math.pow(1.6, 3);
        
        System.out.printf("The volume of earth in cubic kilometers is %.2f and cubic miles is %.2f", volumeKm, volumeMiles);
    }
}