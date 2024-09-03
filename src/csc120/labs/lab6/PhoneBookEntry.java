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
       firstName = "None";
       lastName = "None";
       phoneNumber = "516-555-5555";
       birthDate = "01/01";
       relationship = 'X';
    }
    
    public PhoneBookEntry(String userFirstName, 
                          String userLastName, 
                          String userPhoneNumber, 
                          String userBirthDate, 
                          char userRelationship){
       firstName = userFirstName;
       lastName = userLastName;
       phoneNumber = userPhoneNumber;
       birthDate = userBirthDate;
       relationship = userRelationship;
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
    
    public String toString(){
       if (relationship == 'F') relationshipType = "Friend";
       else if (relationship == 'M') relationshipType = "Family Member";
       else if (relationship == 'B') relationshipType = "Business Associate";
       else relationshipType = "Not specified";
       
       return lastName + ", " + firstName + "\n" + phoneNumber + "\n" + birthDate + "\n" + relationshipType;
    }
    
    public void setLastName(String userLastName){
       lastName = userLastName;
    }
    
    public void setPhoneNumber(String userPhoneNumber){
       phoneNumber = userPhoneNumber;
    }
    
    public boolean equals(PhoneBookEntry userEntryToCompareTo){
       if ( (this.firstName.equals(userEntryToCompareTo.firstName)) 
         && (this.lastName.equals(userEntryToCompareTo.lastName)) ){
          return true;
       } else{
          return false;
       }
    }
 }
