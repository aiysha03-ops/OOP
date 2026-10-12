class Marks {
    private double mark1;
    private double mark2;
    private double mark3;
    public Marks() {
    }
    public Marks(double m1, double m2, double m3) {
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }
    public double getMark1() {
        return mark1;
    }
    public double getMark2() {
        return mark2;
    }
    public double getMark3() {
        return mark3;
    }
    public void setMark1(double m1) {
        mark1 = m1;
    }
    public void setMark2(double m2) {
        mark2 = m2;
    }
    public void setMark3(double m3) {
        mark3 = m3;
    }
}
public class Runner {
    public static void main(String[] args) {
        Marks s1 = new Marks();
        s1.setMark1(85.5);
        s1.setMark2(90.0);
        s1.setMark3(78.25);
        System.out.println("Student 1 Marks");
        System.out.println("Mark 1: " + s1.getMark1());
        System.out.println("Mark 2: " + s1.getMark2());
        System.out.println("Mark 3: " + s1.getMark3());

        Marks s2 = new Marks(92.0, 88.5, 95.0);
        System.out.println("\nStudent 2 Marks");
        System.out.println("Mark 1: " + s2.getMark1());
        System.out.println("Mark 2: " + s2.getMark2());
        System.out.println("Mark 3: " + s2.getMark3());
    }
}