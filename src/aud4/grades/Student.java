package aud4.grades;

public class Student implements Comparable<Student> {

    private String lastName;
    private String firstName;
    private int exam1;
    private int exam2;
    private int exam3;
    private char grade;

    public Student(String lastName,String firstName, int exam1, int exam2, int exam3) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.exam1 = exam1;
        this.exam2 = exam2;
        this.exam3 = exam3;
        setGrade();
    }

    public char getGrade() {
        return grade;
    }
    private double calculatePoints(){
        return 0.25 * exam1 + 0.3 * exam2 + 0.45 * exam3;
    }

    public void setGrade() {
        double points = calculatePoints();
        if(points >= 90){
            this.grade = 'A';
        }
        else if(points >= 80){
            this.grade = 'B';
        }
        else if(points >= 70){
            this.grade = 'C';
        }
        else if(points >= 60){
            this.grade = 'D';
        }
        else if(points >= 50){
            this.grade = 'E';
        } else this.grade = 'F';
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + " " + grade;
    }

    public String printFullInformation(){
        return String.format("%s %s %d %d %d %.2f %c", lastName, firstName, exam1, exam2, exam3, grade);
    }

    @Override
    public int compareTo(Student o) {
        return Character.compare(this.grade,o.grade);
    }

    public static Student create(String line){
        String[] parts = line.split("\\s+");
        return new Student(parts[0],
                parts[1],
                Integer.parseInt(parts[2]),
                Integer.parseInt(parts[3]),
                Integer.parseInt(parts[4]));
    }
}
