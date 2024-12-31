public class Doctor {
    private boolean isSlotBooked = false;

    // Method to book an appointment
    public synchronized boolean bookAppoinment(String patientName) {
        if (isSlotBooked) {
            System.out.println("Sorry " + patientName + ", the slot is already booked.");
            return false;
        } else {
            isSlotBooked = true;
            System.out.println("Appointment booked successfully for " + patientName + ".");
            return true;
        }
    }

    // Method to cancel an appointment
    public synchronized void cancelAppoinment(String patientName) {
        if (isSlotBooked) {
            isSlotBooked = false;
            System.out.println("Appointment for " + patientName + " has been cancelled.");
        } else {
            System.out.println("No appointment found for " + patientName + ".");
        }
    }
}
