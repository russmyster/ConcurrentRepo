package csc120.zybooks.chapter3;

import java.util.Scanner;

public class lab19ParsingAUrl
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);

        String url = scnr.nextLine();

        System.out.println("The URL is " + url + ".");

        int posColon = url.indexOf(":");
        System.out.print("The colon is at position ");
        System.out.println(posColon + ".");

        System.out.print("The protocol is ");
        System.out.println( (url.substring(0, posColon) ) + ".");

        System.out.print("The rest of the URL is ");
        String restOfUrl = url.substring(posColon + 3);
        System.out.println(restOfUrl + ".");

        System.out.print("The domain name is ");

        int posDotCom = url.indexOf(".com");
        //System.out.print(posDotCom);

        System.out.println( ( url.substring( (posColon + 3) , (posDotCom + 4) ) ) + ".");

        System.out.print("The position of the slash is ");
        System.out.println( restOfUrl.indexOf("/") + "." );

        System.out.print("The file name is ");

        //int urlLength = url.length
        String fileName = url.substring( (posDotCom + 5) );
        System.out.println( (fileName + ".") );

        int lengthFileName = fileName.length();

        System.out.println("The file name is " + lengthFileName + " characters long.");

        System.out.print("The first letter of the filename is ");
        System.out.println(fileName.charAt(0) + ".");

        System.out.print("The last letter of the filename is ");
        System.out.println(( fileName.charAt( fileName.length() - 1 ) ) + ".");





    }
}