package University;

public class Student extends Person {
int id;
double gba;
String coursesStudies;

public Student(String name, String gender, String collage, int age, int id, double gba, String coursesStudies) {
    super(name, gender, collage, age);
    this.id = id;
    this.gba = gba;
    this.coursesStudies = coursesStudies;
}
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public double getGba() {
    return gba;
}
public void setGba(int gba) {
    this.gba = gba;
}
public String getCoursesStudies() {
    return coursesStudies;
}
public void setCoursesStudies(String coursesStudies) {
    this.coursesStudies = coursesStudies;
}
public void Printdata(){
System.out.print(super.toString());
System.out.println(toString());
}
@Override
public String toString() {
    return "Student [id=" + id + ", gba=" + gba + ", coursesStudies=" + coursesStudies + "]";
}
}
