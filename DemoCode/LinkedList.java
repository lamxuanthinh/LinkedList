package Lab_02.DemoCode;

public class LinkedList {
    Node head;
    static class Node {
        Student data;
        Node next;
        Node(Student data)
        {
            this.data = data;
            next = null;
        }
    }
    public static void printList(LinkedList list)
    {
        int count = 0;
        Node temp = list.head;
        System.out.println("LinkedList: ");
        while (temp != null) {
            temp.data.display();
            System.out.println();
            if(temp.data.getGBA() > 5){
                count++;
            }
            temp = temp.next;
        }
        System.out.println("so sinh vien diem GBA tren 5 la : " + count);
    }
    public static void printListGBAon7(LinkedList list)
    {
        Node temp = list.head;

        System.out.println("Sinh vien tren 7 diem la : ");

        while (temp != null) {
            if(temp.data.getGBA() > 7){
                temp.data.display();
                System.out.println();
            }
            temp = temp.next;
        }
    }

   public static LinkedList insertLast (LinkedList list , Student data){
        Node new_node = new Node(data);
        new_node.next = null;
        if(list.head == null){
            list.head = new_node;
        }
        else{
            Node temp = list.head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next =new_node;
        }
        return list;
   }

    public static LinkedList insert(LinkedList list, Student data)
    {
        Node new_node = new Node(data);
        new_node.next = null;
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            Node temp = list.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new_node;
        }
        return list;
    }
}
