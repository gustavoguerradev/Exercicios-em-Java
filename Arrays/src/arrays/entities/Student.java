package arrays.entities;

public class Student extends Person {
    private double finalGrade;

    public Student(String name) {
        super(name);
    }

    public void calculateAverage(double n1, double n2) {
        double average = (n1 + n2) / 2 ;
        this.finalGrade = average;
    }

    public double getFinalGrade() {
        return finalGrade;
    }
}
