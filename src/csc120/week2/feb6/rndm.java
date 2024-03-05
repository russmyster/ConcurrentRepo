package csc120.week2.feb6;

public class rndm{
    public static void main(String[] args){
        String tvShow = ("Big Bang Theory");
        int length = tvShow.length();
        char fifthChar = tvShow.charAt(4);
        int pos = tvShow.indexOf("B");

        int posOfSpace = tvShow.indexOf(" ");
        //System.out.println

        // String str3 = tvShow.substring(0, 4);

        System.out.println(tvShow);
        System.out.println(tvShow.length());
        System.out.println(tvShow.charAt(4));

        System.out.println(tvShow.indexOf("Bang"));

        System.out.println(posOfSpace);
        System.out.println(tvShow.substring(0,3));
        System.out.println(tvShow.substring(2));

        /*
        for (){
            if ()
            String test = tvShow.substring(5);
        }*/



    }
}