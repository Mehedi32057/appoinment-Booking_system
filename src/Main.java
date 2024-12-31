import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        Scanner scanner = new Scanner(System.in);

        // Asking for input for the first patient
        System.out.print("Enter name for the first patient: ");
        String patientName1 = scanner.nextLine();

        // Asking for input for the second patient
        System.out.print("Enter name for the second patient: ");
        String patientName2 = scanner.nextLine();

        // Simulate multiple patients trying to book appointments at the same time
        Thread patient1 = new Thread(() -> {
            doctor.bookAppoinment(patientName1);
        });

        Thread patient2 = new Thread(() -> {
            doctor.bookAppoinment(patientName2);
        });

        // Start both threads
        patient1.start();
        patient2.start();

        // Close the scanner after input is taken
        scanner.close();
    }
}