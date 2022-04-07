package Lab_02.Problem_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     StudentModify svit = new StudentModify();
        Scanner sc = new Scanner(System.in);
        int choose;
        do{
            Menu();
            choose = Integer.parseInt(sc.nextLine());
            switch(choose){
                case 1:{
                    svit.input();
                    break;
                }
                case 2:{
                    svit.print();
                    break;
                }
                case 3: {
                    svit.checkStudentByName();
                    break;
                }
                case 4:{
                    svit.deleteStudentByName();
                    break;
                }
                case 5:{
                    svit.findGbaMax();
                    break;
                }
                case 6:{
                    svit.printMathMarkLessFive();
                    break;
                }
                case 7:{
                    svit.saveFile();
                    break;
                }
            }

        }while (choose != 8);
    }
    public static void Menu(){
        System.out.println("====MENU====");
        System.out.println("1.Add a new student to the list.");
        System.out.println("2.Print out the student list.");
        System.out.println("3.Check if a student name x exists in the list or not.");
        System.out.println("4.Delete a student from the list by a given name x.");
        System.out.println("5.Find the student having the biggest average of math, physic and language\n" +
                "marks.");
        System.out.println("6.Print the list of students whose math mark is less than 5.");
        System.out.println("7.Write the student list to a file named StudentList.txt.");
    }
}
