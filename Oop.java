package University;

public class Oop implements Courses {
    String courseName;
    String majorDepartment;
    String minorDepartment;
    int credits;


    
    public Oop(String courseName, String majorDepartment, String minorDepartment, int credits) {
        this.courseName = courseName;
        this.majorDepartment = majorDepartment;
        this.minorDepartment = minorDepartment;
        this.credits = credits;
    }



    public Oop() {
    }



    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }



    public void setMajorDepartment(String majorDepartment) {
        this.majorDepartment = majorDepartment;
    }



    public void setMinorDepartment(String minorDepartment) {
        this.minorDepartment = minorDepartment;
    }



    public void setCredits(int credits) {
        this.credits = credits;
    }



    @Override
    public String getcourseName() {

        return "OOP";
    }



    @Override
    public int getcredits() {

        return 2;
    }



    @Override
    public String getmajorDepartment() {

        return "computer scince";
    }



    @Override
    public String getminorDepartment() {

        return "Statistics";
    }



    @Override
    public String toString() {
        return "Oop [courseName=" + courseName + ", majorDepartment=" + majorDepartment + ", minorDepartment="
                + minorDepartment + ", credits=" + credits + "]";
    }
    
}

    