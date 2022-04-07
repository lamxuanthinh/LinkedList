package Lab_02.Problem_2;

public class Main {
    public static void main(String[] args) {
        Node n1 = new Node(1,2);
        Node n2 = new Node(3,4);
        Node n3 = new Node(5,6);

        n1.next = n2;
        n2.next = n3;
        Node.print(n1);
        Node.additionOnTwoPolynomials(n1);
        Node.subtractionOnTwoPolynomials(n1);
    }
}
