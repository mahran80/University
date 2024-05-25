package University;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {

//     Scanner sc = new Scanner(System.in);
// int i = sc.nextInt(); 
// String testname=sc.next();

    
    Data datamember = new Data(1,"ahmed");
    Staff staffmember = new Staff("ahmed","man","scince",20,5000,"technical");
    Student studentmember = new Student("ahmed","man","scince",20,5000,3.5,"oop");
    Employee employeemember = new Employee("ahmed","man","scince",50,5000);
    Administrative administrativemember = new Administrative("ahmed","man","scince",50,5000,"alex");
//
//    System.out.println(datamember);
//datamember.update(i, testname);
//    System.out.println(datamember);
    datamember.Printpersondata();
    datamember.add_Person(administrativemember);
    datamember.add_Person(employeemember);
    datamember.add_Person(staffmember);
    datamember.add_Person(studentmember);
    datamember.Printpersondata();
  datamember.remove_Person(2);
      datamember.Printpersondata();

      datamember.choice();
    datamember.Printpersondata();


    System.out.println("---------------------------------------------------------");






studentmember.Printdata();
employeemember.Printdata();
administrativemember.Printdata();
staffmember.Printdata();

datamember.add_Person(studentmember);

datamember.Printpersondata();

datamember.add_Person(employeemember);
datamember.Printpersondata();

datamember.add_Person(administrativemember);
datamember.Printpersondata();

datamember.add_Person(staffmember);
datamember.Printpersondata();

datamember.remove_Person(2);

System.out.println("polymorph");
Employee employee1 = new Employee("ahmed","man" ,"scince" ,30 , 500);
System.out.println(employee1);
employee1 = new Staff("ahmed","man" ,"scince" , 30, 5000, "Technical");
System.out.println(employee1);
Oop oopdet = new Oop();
oopdet.getcourseName();
}
}
