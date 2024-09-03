// package proj6;

package csc120.projects.proj6;
import gui.*;

/**
 * <p>Title: Project 6 - Airline reservation system</p>
 * 
 * <p>Description: The program is responsible for the order by which a 
 * user's request to create a seat is handled. This program is also
 * responsible for managing how seats are cancelled and to ensure that
 * the correct seat number is cancelled based on user request.
 * The core of the program involves the utilization of a newly created
 * airplane object and operating gui selections made by the user.
 * This program primarily details said gui selections (cases), which are:
 * make a reservation, cancel a reservation, display a seating chart, or quit.
 * There is also a catchall case (identical to the "quit" function)
 * in case the user tries to forcibly close the application.</p>
 * 
 * @author Russell Sleeby
 */
public class Project6App {
    /**
     * Name: main method
     * 
     * @param args values to be sent to the method.
     */
    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        int option;
        String[] options = {"Make a reservation",       // case 0
                            "Cancel a reservation",     // case 1
                            "Display a seating chart",  // case 2
                            "Quit"};                    // case 3

        do {// first display message box and terminal message header, then display options
            // howOptionDialog displays options to user
            option = GUI.showOptionDialog("What would you like to do?",   // message box
                                        "CSC 120 Airline Main Menu",    // terminal message header
                                        options);

            switch (option) { // start user interaction loop..
                case 0:  // make a reservation
                    String[] seatTypes = {"First Class", "Coach"};
                    int seatType = GUI.showOptionDialog("Choose seat class:",  // message box
                                                        "Reserve Seat",     // terminal message header
                                                        seatTypes);
                    String reservationResult = airplane.reserveSeat(seatTypes[seatType]);
                    GUI.showMessageDialog(reservationResult, 
                                          "Reservation Result"); // terminal message header
                    break;
                case 1:  // cancel a reservation
                    String seatNumberStr = GUI.showInputDialog("Enter the seat number to cancel:", // message box
                                                             "Cancel Seat");                     // terminal message header
                    try {
                        int seatNumber = Integer.parseInt(seatNumberStr);
                        String cancellationResult = airplane.cancelReservation(seatNumber);
                        GUI.showMessageDialog(cancellationResult, "Cancellation Result");        // terminal message header
                    } catch (NumberFormatException exceptionReachedForFun) { // catches nonpositive and or noninteger inputs and reprompts user for valid input, sort of unnecessary per instructions, but cool to have
                        GUI.showMessageDialog("Invalid seat number entered.", // message box
                                            "Error");                       // terminal message header
                    }
                    break;
                case 2:  // display a seating chart
                    String seatingChart = airplane.toString();
                    GUI.showMessageDialog(seatingChart, "Seating Chart"); // terminal message header
                    break;
                case 3:  // quit the application
                    break;
                default: // quit catchall, in case the application closes unexpectedly (e.g. alt+f4)
                    break;
            }
        } while (option != 3); // repeat case checks while app has not been quit
    }
}