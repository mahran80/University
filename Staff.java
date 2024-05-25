package University;

public class Staff extends Employee {
String craftName;

public Staff(String name, String gender, String collage, int age, int salaries,  String craftName) {
    super(name, gender, collage, age, salaries);
    this.craftName = craftName;
}

public String getCraftName() {
    return craftName;
}

public void setCraftName(String craftName) {
    this.craftName = craftName;
}
public void Printdata(){
    System.out.println(super.toString());
    System.out.println(toString());
    }

@Override
public String toString() {
    return "Staff [craftName=" + craftName + "]";
}

}
