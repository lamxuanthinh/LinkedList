package Lab_02.Demo;

import Lab_02.DemoCode.Student;

public class LinkedList {
    Node head;
    static class Node {
        Course data;
        Node next;
        Node(Course data)
        {
            this.data = data;
            next = null;
        }
    }
    public static void printList(LinkedList list)
    {
        Node temp = list.head;
        System.out.println("LinkedList: ");
        while (temp != null) {
            temp.data.display();
            System.out.println();
            temp = temp.next;
        }
    }
    public static LinkedList insert(LinkedList list, Course data)
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
    public static LinkedList DeleteLinkedList(LinkedList list , int index){
        if(list.head == null)
            System.out.println("list empty");
        else {
            int count = 0;
            Node temp = list.head;
            Node prev = null;
            while(temp != null){
                count++;
                prev = temp;
                if(count == index){
                     prev.next = temp.next;
                     break;
                }
                prev = temp;
                temp = temp.next;
            }
        }
        return list;
    }
}
