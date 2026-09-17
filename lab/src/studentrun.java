class student {
    public String studentname;
    public String coursename;
    public int enrollmentyear;
    public String department;
    public String semester;
    public double cgpa;
    public String feestatus;

    public void displaystudentinfo() {
        System.out.println("Name:" + " " + studentname+" " + "Course name:"+" " + " " + coursename +" "+ "Enrollment year:" + " " + enrollmentyear + " "+"Department:" + " " + department +" "+ "Semester:" + " " + semester + " "+"CGPA:" + " " + cgpa + " "+"Fee Status:" + " " + feestatus);
    }
}
    public class studentrun{
        public static void main(String[]args){
            student s1 = new student();
            s1.studentname = "Ahmad";
            s1.coursename = "ICT";
            s1.enrollmentyear = 2024;
            s1.department = "BS Data Science";
            s1.semester = "5th";
            s1.cgpa = 3.65;
            s1.feestatus = "Paid";
            s1.displaystudentinfo();
            student s2 = new student();
            s2.studentname = "Soha";
            s2.coursename = "Multivariable calculus";
            s2.enrollmentyear = 2026;
            s2.department = "BS Mathematics";
            s2.semester = "2nd";
            s2.cgpa = 2.91;
            s2.feestatus = "Pending";
            s2.displaystudentinfo();

        }
    }
