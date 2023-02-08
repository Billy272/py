package constructor_test;

public class student {
    public String name;
    public int marks;

    //default constructor
    public student(){

    }

    //parameterized constructor
    public student(String studentName, int score){
        this.name = studentName;
        this.marks = score;
    }
}
