package Lab_02.Demo;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(list, new Course("21", "laptrinhc", 2));
        list.insert(list, new Course("22", "laptrinhjava", 2));
        list.insert(list, new Course("23", "laptrinhC#", 2));

        list.DeleteLinkedList(list, 1);
        list.printList(list);
    }
}
