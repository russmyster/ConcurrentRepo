package csc120.labs.lab6;

/**
 * JavaDoc comments here
 */

 public class Lab6App {
    public static void main( String args[] ) {
       // your code here
       System.out.println("Testing default constructor:");
       PhoneBookEntry entry1 = new PhoneBookEntry();
       System.out.println(entry1.toString() + "\n");
       
       System.out.println("Testing parameterized constructor:");
       PhoneBookEntry entry2 = new PhoneBookEntry("Mary", "Smith", "631-123-4567", "03/15", 'F');
       System.out.println(entry2.toString() + "\n");
       
       System.out.println("Testing accessor methods:");
       System.out.println("First name: " + entry2.getFirstName());
       System.out.println("Last name: " + entry2.getLastName());
       System.out.println("Phone number: " + entry2.getPhoneNumber());
       System.out.println("Date of birth: " + entry2.getBirthDate());
       System.out.println("Relationship: " + entry2.getRelationship());
       
       // Ignore: Testing statements
       // entry2.setLastName("Collins");
       // System.out.println("Last name: " + entry2.getLastName());
       
       PhoneBookEntry entry3 = new PhoneBookEntry();
       
       entry3.setLastName("Doe");
       System.out.println("\n" + "Testing mutator method for the last name on default object:");
       System.out.println(entry3.toString());
       
       entry3.setPhoneNumber("516-123-4567");
       System.out.println("\n" + "Testing mutator method for the phone number on default object:");
       System.out.println(entry3.toString());
 
       PhoneBookEntry entry4 = new PhoneBookEntry("Mary", "Smith", "516-572-7383", "04/10", 'B');
       System.out.println("\n" + "Testing equals method:");
       if( entry4.equals(entry2) ){
          System.out.println(entry2 + "\nIS THE SAME PERSON AS\n" + entry4);
       } else{
          System.out.println(entry2 + "\nIS NOT THE SAME PERSON AS\n" + entry4);
       }
       // System.out.println( entry4.equals(entry2) );
       
       PhoneBookEntry entry5 = new PhoneBookEntry("John", "Smith", "516-572-7700", "01/20", 'M');
       if( entry5.equals(entry2) ){
          System.out.println("\n" + entry2 + "\nIS THE SAME PERSON AS\n" + entry5);
       } else{
          System.out.println("\n" + entry2 + "\nIS NOT THE SAME PERSON AS\n" + entry5);
       }
 
 
    }
 }
