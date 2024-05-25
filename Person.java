package University;

public class Person {
String name;
String gender;
String collage;
int age;


public Person() {
}
public Person(String name, String gender, String collage, int age) {
    this.name = name;
    this.gender = gender;
    this.collage = collage;
    this.age = age;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getGender() {
    return gender;
}
public void setGender(String gender) {
    this.gender = gender;
}
public String getCollage() {
    return collage;
}
public void setCollage(String collage) {
    this.collage = collage;
}
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}

public  void Printdata(){
    toString();
};
@Override
public String toString() {
    return " [name=" + name + ", gender=" + gender + ", collage=" + collage + ", age=" + age + "]";
}


}

