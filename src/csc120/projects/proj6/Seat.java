// package proj6;

package csc120.projects.proj6;

/**
 * <p>Title: Project 6 - Airline automated reservation system</p>
 * 
 * <p>Description: The program represents seats on an airplane.
 * It first constructs a seat, which is assigned an empty state at first.
 * There are methods that give the user the values of the seat number,
 * the seat type, and the seat reservation status of a given seat.
 * Of course, users may call the reserve method to create seat reservations
 * and or call upon the cancel method in order to cancel seat reservations.
 * Moreover, there is a method, toString, that returns
 * the state of the seat object as a string.</p>
 * 
 * @author Russell Sleeby
 */
public class Seat {
    private boolean isEmpty;
    private int seatNumber;
    private String seatType; // either "First Class" or "Coach"

    /**
     * Constructor: makes a seat w/ specified number & type.
     * Note, initially, the seat is assigned as empty.
     * 
     * @param seatNumber the seat number that should be created.
     * @param seatType the type of seat to be created ("First Class" or "Coach").
     */
    public Seat(int seatNumber, String seatType) {
        this.seatNumber = seatNumber;
        this.seatType = seatType;
        this.isEmpty = true;
    }

    /**
     * getSeatNumber: returns seat number.
     * 
     * @return returns integer value of seatNumber.
     */
    public int getSeatNumber() {
        return seatNumber;
    }

    /**
     * getSeatType: returns type of seat.
     * 
     * @return returns string of seatType.
     */
    /**
     * Returns type of seat.
     */
    public String getSeatType() {
        return seatType;
    }

    /**
     * isEmpty: checks if seat is empty.
     * 
     * @return returns boolean value of isEmpty.
     */
    public boolean isEmpty() {
        return isEmpty;
    }

    /**
     * reserve: reserves seat by declaring that seat is no longer empty.
     */
    public void reserve() {
        isEmpty = false;
    }

    /**
     * cancel: cancels the seat's reservation.
     */
    public void cancel() {
        isEmpty = true;
    }

    /**
     * toString: returns state of the seat in a according to the given format.
     * 
     * @return returns string that contains the state of the seat object.
     */
    public String toString() {
        String seatStatus;
        if (isEmpty) {
            seatStatus = "Empty";
        } else {
            seatStatus = "Reserved";
        }
        return "Seat " + seatNumber + " - " + seatType + " - " + seatStatus;
    }
}
