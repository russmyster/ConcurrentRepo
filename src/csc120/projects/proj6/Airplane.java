// package proj6;

package csc120.projects.proj6;

/**
 * <p>Title: Project 6 - Airline reservation system mechanics</p>
 * 
 * <p>Description: The program interacts with seats on an airplane.
 * It first constructs an airplane, which is then assigned with
 * 4 newly created first-class seats, and 6 newly created coach seats.
 * There is a reserve seat and a cancel reservation function for users
 * to be able to reserve the next available seat or to cancel a reservation.
 * There is also a method, toString, that returns
 * the state of the airplane object as a string.</p>
 * 
 * @author Russell Sleeby
 */
public class Airplane {
    private Seat[] seats;

    /**
     * Constructor: makes an airplane w/ 4 first-class and 6 coach seats.
     */
    public Airplane() {
        seats = new Seat[10];
        for (int i = 0; i < 4; i++) {
            seats[i] = new Seat(i + 1, "First Class");
        }
        for (int i = 4; i < 10; i++) {
            seats[i] = new Seat(i + 1, "Coach");
        }
    }

    /**
     * reserveSeat: reserves next available seat based on user's selected type.
     * 
     * @param seatType the type of seat to reserve ("First Class" or "Coach").
     * @return returns a string message indicating 
     * the reservation's success or failure upon execution.
     */
    public String reserveSeat(String seatType) {
        for (Seat seat : seats) {
            if (seat.getSeatType().equals(seatType) && seat.isEmpty()) {
                seat.reserve();
                return "Reservation successful! " + seatType + " seat " + seat.getSeatNumber() + " is reserved.";
            }
        }
        return "No reservation made. There are no available seats in " + seatType + ".";
    }

    /**
     * cancelReservation: cancels the reservation for a specified seat number.
     * 
     * @param seatNumber the number of the seat whose reservation is to be canceled.
     * @return returns a string message indicating 
     * the cancellation's success or failure upon execution.
     */
    public String cancelReservation(int seatNumber) {
        if (seatNumber > 0 && seatNumber <= seats.length) {
            Seat seat = seats[seatNumber - 1];
            if (!seat.isEmpty()) {
                seat.cancel();
                return "Cancellation successful. Seat number " + seatNumber + " has been canceled.";
            }
        }
        return "Cancellation unsuccessful. The seat is empty or the seat number is invalid.";
    }

    /**
     * toString: returns the state of all seats in the airplane.
     * 
     * @return returns a string that represents 
     * the current state of all of the airplane's seats.
     */
    public String toString() {
        String airplaneState = "";
        for (Seat seat : seats) {
            airplaneState += seat.toString() + "\n";
        }
        return airplaneState;
    }
}
