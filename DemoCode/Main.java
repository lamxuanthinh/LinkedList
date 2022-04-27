package Lab_02.DemoCode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        String hovaten;
        Double toan, li , hoa;
        hovaten = sc.nextLine();
        toan = Double.parseDouble(sc.nextLine());
        li = Double.parseDouble(sc.nextLine());
        hoa = Double.parseDouble(sc.nextLine());
        list.insert(list, new Student(hovaten, toan, li, hoa));
        list.printList(list);
    }
}
