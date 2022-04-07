package Lab_02.Problem_2;

public class Node {
    int num;
    int coeff;
    Node next;
    public Node(int num , int coeff){
        this.num = num;
        this.coeff = coeff;
    }
    public static void print(Node head){
        if(head == null)
            System.out.println("list empty !!!");
        else {
            Node temp = head;
            while(temp != null){
                System.out.println(temp.num + " " + temp.coeff);
                temp = temp.next;
            }
        }
    }
    public static void subtractionOnTwoPolynomials(Node head){
        if(head == null)
            System.out.println("list empty !!!");
        else {
            Node temp = head;
            while(temp != null){
                System.out.println(temp.num - temp.coeff);
                temp = temp.next;
            }
        }
    }
    public static void additionOnTwoPolynomials(Node head){
        if(head == null)
            System.out.println("list empty !!!");
        else {
            Node temp = head;
            while(temp != null){
                System.out.println(temp.num + temp.coeff);
                temp = temp.next;
            }
        }
    }
}
