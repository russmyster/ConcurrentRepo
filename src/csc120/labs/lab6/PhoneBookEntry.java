package csc120.labs.lab6;

/**
 * JavaDoc comments here
 */

public class PhoneBookEntry {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String birthDate;
    private char relationship;

    private String relationshipType;

    public PhoneBookEntry(){
        this.firstName = "None";
        this.lastName = "None";
        this.phoneNumber = "516-555-5555";
        this.birthDate = "01/01";
        this.relationship = 'X';
    }

    public PhoneBookEntry(String userFirstName, 
                        String userLastName, 
                        String userPhoneNumber, 
                        String userBirthDate, 
                        char userRelationship){
        this.firstName = userFirstName;
        this.lastName = userLastName;
        this.phoneNumber = userPhoneNumber;
        this.birthDate = userBirthDate;
        this.relationship = userRelationship;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String getBirthDate(){
        return birthDate;
    }

    public char getRelationship(){
        return relationship;
    }

    public int calculateAge(){
        int age = Integer.parseInt( birthDate.substring(5) );
        return 2025 - age;
    }

    public String toString(){
        String entry = "";
        entry += lastName + ", " + firstName + "\n";
        entry += phoneNumber + "\n";
        entry += birthDate + "\n";

        if ( relationship == 'F' )
            entry += "Friend";
        else if ( relationship == 'M' )
            entry += "Family Member";
        else if ( relationship == 'B')
            entry += "Business associate";
        else
            entry += "Not specified";

            return entry;
    }

    public void setLastName(String userLastName){
        lastName = userLastName;
    }

    public void setPhoneNumber(String userPhoneNumber){
        phoneNumber = userPhoneNumber;
    }

    public boolean equals(PhoneBookEntry userEntryToCompareTo){
        return this.firstName.equals(userEntryToCompareTo.firstName) 
           && this.lastName.equals(userEntryToCompareTo.lastName);
    }
}
