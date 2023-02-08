package constructor_test;

public class main {
    public static void main(String[]args){
        //using default constructor
        student s1 = new student();
        System.out.println("Name: "+s1.name + "Marks: "+s1.marks);


        //using parameterized constructor
    student s2=new student("Luke",73);
    
    System.out.println("Name: " + s2.name + "Marks: " + s2.marks);
    }
    

}
