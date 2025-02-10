abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class InPatient extends Patient {
    private int numberOfDaysAdmitted;
    private double roomChargesPerDay;

    public InPatient(int patientId, String name, int age, int numberOfDaysAdmitted, double roomChargesPerDay) {
        super(patientId, name, age);
        this.numberOfDaysAdmitted = numberOfDaysAdmitted;
        this.roomChargesPerDay = roomChargesPerDay;
    }

    public int getNumberOfDaysAdmitted() {
        return numberOfDaysAdmitted;
    }

    public void setNumberOfDaysAdmitted(int numberOfDaysAdmitted) {
        this.numberOfDaysAdmitted = numberOfDaysAdmitted;
    }

    public double getRoomChargesPerDay() {
        return roomChargesPerDay;
    }

    public void setRoomChargesPerDay(double roomChargesPerDay) {
        this.roomChargesPerDay = roomChargesPerDay;
    }

    @Override
    public double calculateBill() {
        return numberOfDaysAdmitted * roomChargesPerDay;
    }
}

class OutPatient extends Patient {
    private double consultationFee;

    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

public class HospitalManagement {
    public static void main(String[] args) {
        Patient inPatient = new InPatient(1, "Max", 45, 5, 200);
        Patient outPatient = new OutPatient(2, "Pat Cummins", 33, 150);

      

        System.out.println("In-Patient Details:");
        inPatient.getPatientDetails();
        System.out.println("Total Bill: " + inPatient.calculateBill());
        System.out.println("------------------------------------------\n");

        System.out.println("Out-Patient Details:");
        outPatient.getPatientDetails();
        System.out.println("Total Bill: " + outPatient.calculateBill());
        System.out.println("------------------------------------------");
    }
}

