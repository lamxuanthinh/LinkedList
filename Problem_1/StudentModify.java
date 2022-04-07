package Lab_02.Problem_1;

import Lab_02.Problem_1.Student;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class StudentModify {
    private static Scanner sc = new Scanner(System.in);
    private static LinkedList<Student> studentlist = new LinkedList<>();

    public static void input(){
        String name, yob;
        Double mathmark, physicmark;
        System.out.println("profile sutdent" + studentlist.size() +1);
        System.out.print("enter name student is : ");
        name = sc.nextLine();

        System.out.print("enter date student is : ");
        yob = sc.nextLine();

        System.out.print("enter math mark  student is : ");
        mathmark = Double.parseDouble(sc.nextLine());

        System.out.print("enter physic mark student is : ");
        physicmark = Double.parseDouble(sc.nextLine());

        Student sv = new Student(name, yob, mathmark, physicmark);
        studentlist.add(sv);
    }
    public static void print(){
        for (Student x : studentlist) {
            System.out.println(x);
        }
    }
    public static void deleteStudentByName(){
        System.out.println("enter name by delete is : ");
        String name = sc.nextLine();
        for (Student x : studentlist) {
            if(x.getName().equals(name)){
                studentlist.remove(x);
                System.out.println("Done !!!");
                break;
            }
        }
    }
    public static void checkStudentByName(){
        System.out.println("enter name by delete is : ");
        String name = sc.nextLine();
        for (Student x: studentlist) {
            if(x.getName().equals(name)){
                System.out.println("exists in the list");
                break;
            }else
                System.out.println("not exists in the list");
        }
    }
    public static void printMathMarkLessFive(){
        for (Student x : studentlist) {
            if(x.getMathmark() < 5)
            System.out.println(x);
        }
    }
    public static void findGbaMax(){
        Collections.max(studentlist, new Comparator<Student>() {
            @Override
            public int compare(Student t0, Student t1) {
                return (int) (t0.getGba() - t1.getGba());
            }
        });
    }
    public static void saveFile(){
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("StudentList.txt",true);
            for (Student x: studentlist) {
                String line = x.printStudentInFlie() + "\n";
                byte b[] = line.getBytes(StandardCharsets.UTF_8);
                fos.write(b);
                System.out.println("Done");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(fos != null){
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
