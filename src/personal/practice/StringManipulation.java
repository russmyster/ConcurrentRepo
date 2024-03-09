package personal.practice;

public class StringManipulation {
    public static void main(String[] args){
        String tvShow = new String("American Idol");
        String movie = new String("The Chronicles of Narnia");

        int length;
        int position;
        char letter;
        char letter2;
        String temp;
        String temp2;

        int length2;
        char letter3;
        char letter4;
        int position2;
        String temp3;
        String temp4;

        String temp5;

        length = tvShow.length();
        System.out.println(length);

        letter = tvShow.charAt(4);
        System.out.println(letter);

        letter2 = tvShow.charAt(8);
        System.out.println(letter2);

        position = tvShow.indexOf("can");
        System.out.println(position);

        temp = tvShow.substring(7);
        System.out.println(temp);

        temp2 = tvShow.substring(6,10);
        System.out.println(temp2);

        length2 = movie.length();
        System.out.println(length2);

        letter3 = movie.charAt(0);
        System.out.println(letter3);

        letter4 = movie.charAt(11);
        System.out.println(letter4);

        position2 = movie.indexOf("ron");
        System.out.println(position2);

        temp3 = movie.substring(18);
        System.out.println(temp3);

        temp4 = movie.substring(8, 15);
        System.out.println(temp4);

        //temp5 = movie.substring( 23 );
        //System.out.println(temp5);
    }
}
