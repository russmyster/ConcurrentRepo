package personal.practice;

public class StringMethod {
    public static void main(String[] args){
    String bbt = new String("Big Bang Theory");
    String sw = new String("Star Wars");

    int bbtLength = bbt.length();

    //Q1
    int startIndexWars = sw.indexOf("Wars");
    System.out.println("Index of first occurence of substring Wars: " + startIndexWars);

    //Q2
    int endIndexSw = sw.length();
    String substringWars = sw.substring(startIndexWars, endIndexSw);
    System.out.println("Substring extracted: " + substringWars);

    //Q3
    if(bbt.indexOf("Theory") >= 0) System.out.println("Substring found");
    else System.out.println("Substring not found");

    //Q4
    String substringStar = sw.substring(0, startIndexWars - 1);
    System.out.println("Starting word extracted: " + substringStar);

    //Q5
    System.out.print(sw);
    sw = sw.replace("Wars", "Trek");
    System.out.println(" refactored is " + sw);

    //Q6
    String bbtSubstring4To8 = bbt.substring(4, 8);
    System.out.println("Substring from BBT from index 4 to index 8 is: " + bbtSubstring4To8);

    //Q7 //indexOf gives the index value of the string/letter RIGHT BEFORE it starts!!
    int bbtIndexOfLastG = bbt.indexOf('g', 4);
    System.out.println("The index of the last g in BBT is: " + bbtIndexOfLastG);

    //Q8
    String bbtCheckBig = bbt.substring(0,3);
    String strBig = "Big";
    if ( bbtCheckBig.equals(strBig) ) System.out.println("Starts with Big");
    else System.out.println("Does not start with Big");

    //Q9
    String swSubstringAfterIndex5 = sw.substring(5);
    System.out.println("Substring of SW after index of 5 is: " + swSubstringAfterIndex5);

    //Q10
    int countOfA = 0; // refactored idea excerpted from ChatGPT

    for( int i = 0; i < bbt.length(); i++){
        if( bbt.charAt(i) == 'a'){
            countOfA++;
        }
    } System.out.println("Number of times the letter 'a' occurs in BBT: " + countOfA);
    }
}

/*
Some example questions that involve using indexOf() and substring() with stored strings like "Big Bang Theory" or "Star Wars":

Question1: Given the string "Big Bang Theory", find the index of the first occurrence of the substring "Bang".
Question2: From the string "Star Wars", extract the substring "Wars" and store it in a new string variable.
Question3: Determine if the string "Big Bang Theory" contains the substring "Theory". If it does, print "Substring found", otherwise print "Substring not found".
Question4: Extract the first word from the string "Star Wars" and store it in a new string variable.
Question5: Replace the substring "Wars" in the string "Star Wars" with "Trek".
Question6: Given the string "Big Bang Theory", extract the substring starting from index 4 and ending at index 8.
Question7: Find the index of the last occurrence of the letter 'g' in the string "Big Bang Theory".
Question8: Check if the string "Big Bang Theory" starts with the substring "Big". If it does, print "Starts with Big", otherwise print "Does not start with Big".
Question9: Given the string "Star Wars", extract the substring starting from index 5 to the end of the string.
Question10: Count the number of occurrences of the letter 'a' in the string "Big Bang Theory".

These questions cover a range of scenarios where you'd use indexOf() and substring() methods to manipulate and extract information from stored strings.
 */



/* My original method for Q.10 is wasteful of system resources
int letterACounter = 0;
int substringIndexCreator = 0;
String bbtTempCopy = bbt;
for(int i = 0; i < bbt.length(); i++){
    if( bbtTempCopy.indexOf('a') >= 0 ){
        letterACounter++; // increase letterACounter due to 'a' being found
        // manipulate bbtTempCopy to create substrings after each 'a' found
        // then check those subsequent substrings for occurences of 'a'
        bbtTempCopy = bbtTempCopy.substring( (bbtTempCopy.indexOf('a') + 1) );
        // substring created AFTER each 'a' requires a + 1 modifier
        // so that the created substring doesn't include the previously found 'a' in it!
    }
} System.out.println("Number of times the letter 'a' occurs in BBT: " + letterACounter);
*/