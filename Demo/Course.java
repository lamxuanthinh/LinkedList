package Lab_02.Demo;

public class Course {
    private String courselD;
    private String coursename;
    private int    number_of_credits;

    public Course(String courselD, String coursename, int number_of_credits) {
        this.courselD = courselD;
        this.coursename = coursename;
        this.number_of_credits = number_of_credits;
    }
    public void display(){
        System.out.println(courselD);
        System.out.println(coursename);
        System.out.println(number_of_credits);
    }
}
