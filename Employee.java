package University;

public class Employee extends Person  {
int salaries;

public Employee(String name, String gender, String collage, int age, int salaries) {
    super(name, gender, collage, age);
    this.salaries = salaries;
}

public int getSalaries() {
    return salaries;
}

public void setSalaries(int salaries) {
    this.salaries = salaries;
}
public void Printdata(){
    System.out.print(toString());
    System.out.println(super.toString());
    }

@Override
public String toString() {
    return "Employee [salaries=" + salaries + "]";
}
    



}
