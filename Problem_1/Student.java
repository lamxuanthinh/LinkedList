package Lab_02.Problem_1;

public class Student {
    private String name;
    private String yob;
    private Double mathmark;
    private Double physicmark;

    public Student() {
    }

    public Student(String name, String yob, Double mathmark, Double physicmark) {
        this.name = name;
        this.yob = yob;
        this.mathmark = mathmark;
        this.physicmark = physicmark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYob() {
        return yob;
    }

    public void setYob(String yob) {
        this.yob = yob;
    }

    public Double getMathmark() {
        return mathmark;
    }

    public void setMathmark(Double mathmark) {
        this.mathmark = mathmark;
    }

    public Double getPhysicmark() {
        return physicmark;
    }

    public void setPhysicmark(Double physicmark) {
        this.physicmark = physicmark;
    }

    public double getGba() {
        return (mathmark + physicmark) / 2;
    }
    public String printStudentInFlie(){
        return name + "," + yob + "," + mathmark + "," + physicmark;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", yob='" + yob + '\'' +
                ", mathmark=" + mathmark +
                ", physicmark=" + physicmark +
                '}';
    }
}
