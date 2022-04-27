package Lab_02.DemoCode;

public class Student {
    private String hovaten;
    private Double toan;
    private Double li;
    private Double hoa;
    public Student (){
    }
    public Student(String hovaten, Double toan, Double li, Double hoa) {
        this.hovaten = hovaten;
        this.toan = toan;
        this.li = li;
        this.hoa = hoa;
    }

    public Double getGBA(){
        return (toan + li + hoa) / 3;
    }

    public void setHoa(Double hoa) {
        this.hoa = hoa;
    }
    public void display(){
        System.out.println("ten :" + hovaten);
        System.out.println("toan :" + toan);
        System.out.println("li :" + li);
        System.out.println("hoa :" + hoa);
        System.out.println("GBA :" + getGBA());
    }
}
