package csc120.labs.lab6;

/**
 * JavaDoc comments here
 */

 public class Lab6App {
    public static void main( String args[] ) {
        PhoneBookEntry entry1 =  new PhoneBookEntry();
        PhoneBookEntry entry2 =  new PhoneBookEntry( "Mary", "Smith", "516-123-4567", "05/31/1994", 'M');
        PhoneBookEntry entry3 =  new PhoneBookEntry( "Mary", "Doe", "516-123-4567", "05/31/1994", 'M');
        PhoneBookEntry entry4 =  new PhoneBookEntry( "Mary", "Smith", "516-475-4567", "05/31/2015", 'B');

        System.out.println( "Testing default constructor:\n" + entry1.toString());
        System.out.println();
        System.out.println( "Testing parameterized constructor:\n" + entry2.toString());
        System.out.println();
        System.out.println( "Testing parameterized constructor:\n" + entry3.toString());
        System.out.println();
        System.out.println( "Testing parameterized constructor:\n" + entry4.toString());
        System.out.println();

        System.out.println( "Testing equals on 2 & 3:" + entry2.equals(entry3));
        System.out.println( "Testing equals on 2 & 4:" + entry2.equals(entry4));
        System.out.println( "Testing equals on 3 & 4:" + entry3.equals(entry4));

        System.out.println( "Testing calculateAge on entry1: " + entry1.calculateAge() + "\n");
        System.out.println( "Testing calculateAge on entry2: " + entry2.calculateAge() + "\n");
        System.out.println( "Testing calculateAge on entry3: " + entry3.calculateAge() + "\n");
        System.out.println( "Testing calculateAge on entry4: " + entry4.calculateAge() + "\n");


    }
 }
