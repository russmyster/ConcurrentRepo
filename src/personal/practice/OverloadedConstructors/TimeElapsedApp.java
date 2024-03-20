package personal.practice.OverloadedConstructors;

public class TimeElapsedApp {
    public static void main(String[] args){
        int hrs;
        int mins;

        ElapsedTime lap = new ElapsedTime(3.0);

        lap.addMinutes(5);
        lap.addMinutes(10);
        lap.addMinutes(81);

        System.out.println(lap.getMins());
        System.out.println(lap.getTime());
        System.out.println(lap.getMins());
    }
}
