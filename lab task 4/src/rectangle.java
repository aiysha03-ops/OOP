public class rectangle{
    double length;
    double width;
    public void abc(){
        double area = length * width;
        double perimeter = 2 * (length + width);
        System.out.println("Length:"+" "+length+" "+"Width:"+" "+width+" "+"Area:"+" "+area+"Perimeter:"+" "+perimeter);
    }
    public static void main(String[]args){
        rectangle r1 = new rectangle();
        r1.length = 3;
        r1.width = 9;
        r1.abc();
        rectangle r2 = new rectangle();
        r2.length = 20;
        r2.width = 36;
        r2.abc();

    }
}