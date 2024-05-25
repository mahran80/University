package University;

import java.util.ArrayList;
import java.util.Scanner;

public class Data  {
int dataNumber;

    @Override
    public String toString() {
        return "Data{" +
                "dataNumber=" + dataNumber +
                ", dataName='" + dataName + '\'' +
                ", personlList=" + personlList +
                '}';
    }

    String dataName;
ArrayList<Person> personlList;




public Data() {
}
public Data(int dataNumber, String dataName ) {
    this.dataNumber = dataNumber;
    this.dataName = dataName;
    personlList = new ArrayList<Person>();
}
public int getDataNumber() {
    return dataNumber;
}
public void setDataNumber(int dataNumber) {
    this.dataNumber = dataNumber;
}
public String getDataName() {
    return dataName;
}
public void setDataName(String dataName) {
    this.dataName = dataName;
}
public ArrayList<Person> getPersonlList() {
    return personlList;
}
public void setPersonlList(ArrayList<Person> personlList) {
    this.personlList = personlList;
}
public void add_Person(Person person) {

    personlList.add(person);
}
public void remove_Person (int index) {
personlList.remove(index);
}
public void personData() {
for(int i=0; i<personlList.size(); i++) {
System.out.println(personlList.get(i).getName()+" "+personlList.get(i).getAge()+""+personlList.get(i).getGender()+""+personlList.get(i).getCollage());
}
}

public void Printpersondata() {
    for(int i=0; i<personlList.size(); i++){
        if (personlList.get(i) instanceof Student)
    ((Student) personlList.get(i)).Printdata();
        if (personlList.get(i) instanceof Employee)
    ((Employee) personlList.get(i)).Printdata();
    if (personlList.get(i) instanceof Administrative)
    ((Administrative) personlList.get(i)).Printdata();
    if (personlList.get(i) instanceof Staff)
    ((Staff) personlList.get(i)).Printdata();
    
}
}

        public void choice(){
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter choice");

            System.out.println("1 Add\n " +
                    "2 Remove\n " +
                    "3 Print");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("the values name , gender , college, age, salary");
                    String name = sc.next();
                    String gender = sc.next();
                    String col = sc.next();
                    int age = sc.nextInt();
                    int sal = sc.nextInt();
                    Person person = new Person(name, gender,col,age);
                    add_Person(person);
                    break;
                case 2:
                    int index = sc.nextInt();
                    remove_Person(index);
                    break;
                 case 3:
                    Printpersondata();
                     break;
                
                 

            }


        }

}