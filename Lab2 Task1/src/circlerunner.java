class circle{
    public double radius;
    public String colour;
    public circle(){
        radius = 5.6;
        colour = "blue";
    }
    public circle(double r, String c){
        radius = r;
        colour = c;
    }
    public double calculatecircumference(){
    return (2*Math.PI*radius);
    }
}
public class circlerunner{
    public static void main(String[]args){
        circle cir = new circle();
        System.out.println(cir.calculatecircumference());
        circle cir2 = new circle(4.9, "green");
        System.out.println(cir2.calculatecircumference());
    }
}