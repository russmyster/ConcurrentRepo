package personal.practice.OverloadedConstructorsTEST;

public class ElapsedTime {
    private int hrs;
    private int mins;

    public ElapsedTime(){
        this(0, 0);
    }

    // Constructor with parameters for hours and minutes
    public ElapsedTime(int hrs, int mins){
        this.hrs = hrs;
        this.mins = mins;
    }

    // Constructor with a single parameter for hours (assuming minutes = 0)
    public ElapsedTime(int hrs){
        this(hrs, 0);          // Chaining to the constructor with parameters
    }

    // Constructor with a single parameter for minutes (assuming hours = 0)
    public ElapsedTime(double mins){
        this(0, (int) mins);    // Chaining to the constructor with parameters
    }

    // Method to add minutes
    public int addMinutes(int mins){
        return mins += mins;
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
