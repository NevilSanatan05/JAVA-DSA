public class Constructor {
public static void main(String[] args) {
Student s1 = new Student();
// System.out.println(s1.name);
Student s2 = new Student("shradha");
Student s3 = new Student(123);
}
}

class Student{
String name ;
int roll;


//Non-Paramterized Constructor
Student(){
System.out.println("Constructor is called..");
}


//Parameterized Constructor
Student(String name){
 this.name = name;
}
Student(int roll){
  this.roll = roll;
}

}


// Types of constructors - 1) Non-parameterized
// 2) Parameterized
// 3)Copy Constructor


