public class time {
    int hours;
    int minutes;
    int seconds;
    public void displaytime(){
        System.out.println("Hours:"+" "+hours+" "+"Minutes:"+" "+minutes+" "+"Seconds:"+" "+seconds);
    }

public static void main(String[] args) {
    time t1 = new time();
    t1.hours = 2;
    t1.minutes = 14;
    t1.seconds = 34;
    t1.displaytime();
    time t2 = new time();
    t2.hours = 10;
    t2.minutes = 45;
    t2.seconds = 29;
    t2.displaytime();
}
}