package csc120.zybooks.chapter4.PeopleCounter;

public class AttendanceExample {
    public static void main(String[] args) {
        PeopleCounter attendeeCounter = new PeopleCounter();
        
        for (int i = 0; i < 5; i++){
            attendeeCounter.incrementCount();
        }
        System.out.print("Attendee count: ");
        attendeeCounter.printCount();
        
        PeopleCounter carsOnLotCounter = new PeopleCounter();
        for (int i = 0; i <= 36; i++){ // afternoon expected cars on lot
            carsOnLotCounter.incrementCount();
        } 
        System.out.print("\nCars on the parking lot in the afternoon: ");
        carsOnLotCounter.printCount();
        
        System.out.print("\nCars on the parking lot at midnight: ");
        carsOnLotCounter.resetCount();
        carsOnLotCounter.printCount();
        
        double customers = 0;
        for (int i = 0; i < 24; i++){ // expected TRUNCATED total # of sales from hired salespeople
            customers += 1.37;
        } 
        int truncatedCountableCustomers = (int) customers;
        System.out.println("\n\nFloor of Countable Customers: " + truncatedCountableCustomers);
        
        double ceilingCountableCustomers = Math.ceil( ((double) customers) );
        System.out.printf("Ceiling of Countable Customers: %.0f\n", ceilingCountableCustomers);
    }
}