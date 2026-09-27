class time {
    public int hours;
    public int minutes;
    public int seconds;

    public time() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    public time(int hr, int min, int sec) {
        hours = hr;
        minutes = min;
        seconds = sec;

        if (hours < 0 || hours > 24) {
            hours = 0;
        }
        if (minutes < 0 || minutes > 60) {
            minutes = 0;
        }
        if (seconds < 0 || seconds > 60) {
            seconds = 0;
        }
    }

    public void display() {
        System.out.println("Time is -> " + hours + ":" + minutes + ":" + seconds);
    }
}
public class timerunner{
    public static void main(String[]args){
        time t1 = new time();
        t1.display();
        time t2 = new time(18, 45, 30);
        t2.display();
        time t3 = new time(06, 70, 10);
        t3.display();
    }
}