public class car{
    String name;
    String colour;
    int yearmodel;
    double fuellevel;
    int speedmeter;
    public void cardisplay(){
        System.out.println("Car name:"+" "+name+" "+"Colour:"+" "+colour+" "+"Year model:"+" "+yearmodel+" "+"Fuel level"+" "+fuellevel+" "+"Speed meter"+" "+speedmeter);
    }
public static void main(String[]args){
        car c1 = new car();
        c1.name = "Toyota";
        c1.colour = "Red";
        c1.yearmodel = 2020;
        c1.fuellevel = 50;
        c1.speedmeter = 150;
        c1.cardisplay();
        car c2 = new car();
        c2.name = "Honda";
        c2.colour = "Silver";
        c2.yearmodel = 2023;
        c2.fuellevel = 65;
        c2.speedmeter = 200;
        c2.cardisplay();
}
}