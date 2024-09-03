package personal.practice.OverloadedConstructors;

public class ElapsedTime {
    private int hrs;
    private int mins;

    public ElapsedTime(){
        this(0, 0);
    }

    // Constructor with parameters for hours and minutes
    public ElapsedTime(int userHrs, int userMins){
        this.hrs = userHrs;
        this.mins = userMins;
    }

    // Constructor with a single parameter for hours (assuming minutes = 0)
    public ElapsedTime(int userHrs){
        this(userHrs, 0);          // Chaining to the constructor with parameters
    }

    // Constructor with a single parameter for minutes (assuming hours = 0)
    public ElapsedTime(double userMins){
        this(0, (int) userMins);    // Chaining to the constructor with parameters
    }

    // Method to add minutes
    public int addMinutes(int userMins){
        return mins += userMins;
    }

    // Method to get total time in minutes
    public int getMins(){
        return (this.hrs * 60) + this.mins;
    }

    public String getTime(){
        this.hrs = (int) ( this.mins / 60.0 );
        this.mins = this.mins % 60;

        return (this.hrs + " hours and " + this.mins + " minutes" );
    }
}
