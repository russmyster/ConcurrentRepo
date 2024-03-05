package csc120.week2.feb8;

public class notes{
    public static void main(String[] args){
        /* 
        - fields (aka data members)
        --> defines the state of the object
        *adjectives
        --> such as q.i as shown on feb 15th




        - methods (aka member functions)
        --> defines the behavior of the object
        *verbs
        --> shuffle deck
        --> deal me a card

        tempString.length()
        // the () implies a "behavior" (give me a charAt(13), give me substring created from (0, 7), etc.)
*/

        /*
        class Student{
            int id;
            Sting firstName;
            String lastName;
            int birthYear, birthMonth, birthDay;

            boolean isBirthday(){
                // Return true if it's the student's birthday today.
                return false;
            }

            void giveWarning(boolean isFinalWarning){
                // You should study harder!
            }

            int numerOfFriends(){
                // Return the number of friends the student has.
                return 0;
            }

            */


            /*class DataOnly{
                int i;
                double d;
                boolean b;
            }

            DataOnly data = new DataOnly();

            data.i = 47;
            data.d = 1.1;
            data.b = false;
            data.i = 53;

            System.out.println(data);
            System.out.printf("", data.i);
            
            
            Methods:
            return type describes value that comes back from the method, after you call it
            parameter list gives types and names for the information that you want to pass into the method
            --> method name and parameter list (called the signature of the method) uniquely identify that method
            - methods are called by naming the object, then followed by a DOT, followed by the name of the method and the parameter list

            - note that parameter is a variable in a method definition
            - when a method is called, the arguments are the data within the parenthesis
            ex. person.run(15);
               or
                person.run(); // if the method does not need any arguments

            Instance Methods:
            
            
            */


            String temp = "Dylan Thomas";
            int i = temp.indexOf('a');
            String temp2 = new String ("System.out.println(i);");
            System.out.println(i);
            System.out.println(temp2);
            
        }
    }