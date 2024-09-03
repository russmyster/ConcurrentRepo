package csc120.classNotes.week6.mar5;

public class DataOnly {
    int i = 9;
    double d;
    boolean b;

    public DataOnly( int i ){
    i = i; // instance var i = the parameter var i
    // field member i = parameter i

    // i = i; // parameter var should equal the parameter var

/*
    extra notes from chatgpt:
    this.i = i; // Assigning the value of the parameter `i` to the instance variable `i`.
    // Here, `this.i` refers to the class-level variable `i`, and `i` refers to the parameter `i`.
    // This assignment sets the class-level variable `i` to the value passed as the argument to the constructor.

    // i = i; // This statement is incorrect because it assigns the parameter `i` to itself.
    // It doesn't assign anything to the class-level variable `i`. It's effectively a no-op.
    // If you want to assign the parameter `i` to the class-level variable `i`, you should use `this.i = i;`.
    // Otherwise, you'll have to use different variable names to distinguish between the local and class-level variables.
*/

    }
    
    public static void main(String[] args){
        DataOnly data = new DataOnly( 5 );
        System.out.println( data.i );
    }
}
