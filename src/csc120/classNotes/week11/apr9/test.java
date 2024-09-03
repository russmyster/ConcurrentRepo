package csc120.classNotes.week11.apr9;

public class test {
    private double[] grades = {1,2,3}
    public void setGrades(double[] theGrades){
        for(int i = 0; i < grades.length; i++){
            gradesCopy[i] = grades[i];
        }
        for(int i = 0; i < gradesCopy.length; i++){
            gradesCopy[i] = theGrades[i];
        }
    }
}
