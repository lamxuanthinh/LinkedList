package Lab_02.DemoCode;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(list , new Student("thinh", 6.0,6.0,6.0));
        list.insert(list , new Student("thinh1", 1.0,1.0,1.0));
        list.insert(list , new Student("thinh3", 4.0,4.0,4.0));
        list.insertLast(list, new Student("thinh3", 3.0,3.0,3.0));
        list.printList(list);
    }
}
