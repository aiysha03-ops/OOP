class distance{
    double feet, inches;
    public distance(){
        feet = 0;
        inches = 0;
    }
    public distance(double f, double i){
        feet = f;
        inches = i;
    }
    public void display(){
        System.out.println("Distance:"+feet+" "+"feet and"+" "+inches+"inches");
    }
}
public class distancerunner{
    public static void main(String[]args){
        distance d1 = new distance();
        d1.display();
        distance d2 = new distance(23, 6.5);
        d2.display();
        distance d3 = new distance(5, 4);
        d3.display();
    }
}