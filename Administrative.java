package University;

public class Administrative extends Employee {
String admistrationName;

public Administrative(String name, String gender, String collage, int age, int salaries, String admistrationName) {
    super(name, gender, collage, age, salaries);
    this.admistrationName = admistrationName;
}
public String getAdmistrationName() {
    return admistrationName;
}

public void setAdmistrationName(String admistrationName) {
    this.admistrationName = admistrationName;
}
public void Printdata(){
    System.out.print(super.toString());
    System.out.println(toString());
    }


}

