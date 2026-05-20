package Assignment4;

import java.util.Scanner;

//abstract class
abstract class Person{
    protected String name;
    protected int age;

    //constructor
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    //abstract method
    public abstract void displayDetails();
}

interface services{
    void bookService();
    void displayStatus();
}

//Patient class
class Patient extends Person {
    int patientId;
    String gender;

    public Patient(int PatientId, String name, int age, String gender) {
        super(name, age);
        this.patientId = patientId;
        this.gender = gender;
    }

    //override
    public void displayDetails() {
        System.out.println("Patient ID: " + patientId + " , Name: " + name + ", Age: " + age + ", Gender:" + gender);

    }
}
    //Doctor Class
    class Doctor extends Person {
        String Specialization;

        //constructor
        public Doctor(String name, int age, String Specialization) {
            super(name, age);
            this.Specialization = Specialization;
        }

        //override
        public void displayDetails() {
            System.out.println("Doctor: " + name + ", Age" + age + ", Specialization: " + Specialization);
        }

        //Appointment class
        static class Appointment implements services {
            Patient patient;
            Doctor doctor;

            //constructor linking patient & doctor
            public Appointment(Patient patient, Doctor doctor) {
                this.patient = patient;
                this.doctor = doctor;
            }

            //implements interface method,override
            public void bookService() {
                System.out.println("Appointment Booked for: " + patient.name + " With Dr. " + doctor.name);
            }

            public void displayStatus() {
                System.out.println("Consultation Successful");
            }
        }

        //Billing class
        static class Billing {
            //method overloading
            public int generateBill(int consultationFee) {
                return consultationFee;
            }

            public int generateBill(int consultationFee, int medicineBill) {
                return consultationFee + medicineBill;
            }

            public int generateBill(int consultationFee, int medicineBill, int labTestFee) {
                return consultationFee + medicineBill + labTestFee;
            }
        }

        //class Pharmacy, implements interface
        static class Pharmacy implements services {
            int medicineBill;

            //override
            public void bookService() {
                System.out.println("Medicine Bill added successfully");
            }

            public void displayStatus() {
                System.out.println("Medicine Bill: " + medicineBill);
            }
        }

        //lab test class
        static class Labtest implements services {
            String testName;

            //constructor
            public Labtest(String testName) {
                this.testName = testName;
            }

            //override
            public void bookService() {
                System.out.println("Labtest Booked successfully");
            }

            public void displayStatus() {
                System.out.println("Labtest Booked for: " + testName);
            }
        }


        //Main class
        public static class HospitalManagmentSystem {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                //declaration
                Patient patient = null;
                Doctor doctor = null;
                Billing billing = new Billing();
                Pharmacy pharmacy = new Pharmacy();
                Labtest labTest = null;

                while (true) {
                    System.out.println("===== HOSPITAL MANAGEMENT SYSTEM =====");
                    System.out.println("1. Add Patient");
                    System.out.println("2. View Patient");
                    System.out.println("3. Add Doctor");
                    System.out.println("4. View Doctor");
                    System.out.println("5. Book Appointment");
                    System.out.println("6. Generate Bill");
                    System.out.println("7. Consultation Status");
                    System.out.println("8. Pharmacy Service");
                    System.out.println("9. Lab Test Service");
                    System.out.println("10. Exit");
                    System.out.print("Enter Choice: ");
                    int choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            //patient object
                            patient = new Patient(101, "Asha", 20, "Female");
                            System.out.println("Patient Added Successfully");
                            break;
                        case 2:
                            // Display patient details if patient exists
                            if (patient != null) patient.displayDetails();
                            else System.out.println("No Patient Added yet");
                            break;
                        case 3:
                            //doctor object
                            doctor = new Doctor("Shetty", 50, "General Physician");
                            System.out.println("Doctor Added Successfully");
                            break;
                        case 4:
                            // Display doctor details if doctor exists
                            if (doctor != null) doctor.displayDetails();
                            else System.out.println("No Doctor Added Yet");
                            break;
                        case 5:
                            // Book appointment if patient and doctor available
                            if (patient != null && doctor != null) {
                                Appointment appt = new Appointment(patient, doctor);
                                appt.bookService();
                            } else {
                                System.out.println("Add Patient and Doctor first!");
                            }
                            break;
                        case 6:
                            // Generate bill
                            System.out.print("Enter Consultation Fee: ");
                            int fee = sc.nextInt();
                            System.out.println("Total Hospital Bill: " + billing.generateBill(fee));
                            break;
                        case 7:
                            // Show consultation status
                            System.out.println("Consultation Completed Successfully");
                            break;
                        case 8:
                            // Add pharmacy bill
                            System.out.print("Enter Medicine Bill Amount: ");
                            int medBill = sc.nextInt();
                            pharmacy.medicineBill = medBill; // directly assign value
                            pharmacy.bookService();
                            break;
                        case 9:
                            // Book lab test
                            labTest = new Labtest("Blood Test");
                            labTest.bookService();
                            break;
                        case 10:
                            // Exit program
                            System.out.println("Exiting...");
                            sc.close();
                            return;
                        default:
                            System.out.println("Invalid Choice!");
                    }
                    System.out.println("--------------------------------");
                }

            }

            }

        }

