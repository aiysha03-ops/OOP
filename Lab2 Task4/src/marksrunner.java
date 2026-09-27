class marks{
    public int mark1;
    public int mark2;
    public int mark3;
    public marks(){
        mark1 = 23;
        mark2 = 45;
        mark3 = 65;
    }
    public marks(int x, int y, int z){
        mark1 = x;
        mark2 = y;
        mark3 = z;
    }
    public int calculatesum(){
        return (mark1+mark2+mark3);
    }
}
public class marksrunner{
    public static void main(String[]args){
        marks m1 = new marks();
        System.out.println("Sum of three marks:"+m1.calculatesum());
        marks m2 = new marks(43, 98, 62);
        System.out.println("Sum of three marks:"+m2.calculatesum());
    }
}
