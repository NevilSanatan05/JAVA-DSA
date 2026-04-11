// import java.util.Scanner;
// public class Cond{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter your age: ");
//     int age = sc.nextInt();
//     if(age>=18){
//       System.out.println("You can vote.");
//     }
//     else{
//       System.out.println("You cannot vote.");
//     }
//   }
// }

// import java.util.Scanner;
// public class Cond{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter number 1 and 2: ");
//     int num1 = sc.nextInt();
//     int num2 = sc.nextInt();
//     if(num1>num2){
//       System.out.println("Number 1 is greater than Number 2.");
//     }
//     else{
//       System.out.println("Number 2 is greater than Number 1.");
//     }
//   }
// }


// import java.util.Scanner;
// public class Cond{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter a number ");
//     int num1 = sc.nextInt();
//     if(num1%2==0){
//       System.out.println("Number is even.");
//     }
//     else{
//       System.out.println("Number  is odd.");
//     }
//     sc.close();
//   }
// }

// import java.util.Scanner;
// public class Cond{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter your age: ");
//     int age = sc.nextInt();
//     if(age>=18){
//       System.out.println("You can vote.");
//     }
//     else if(age>16 && age<18){
//       System.out.println("You can vote in some states.");
//     } 
//     else{
//       System.out.println("You cannot vote.");
//     }
//   }
// }


// import java.util.Scanner;
// public class Cond{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter three numbers: ");
//     int num1 = sc.nextInt();
//     int num2 = sc.nextInt();
//     int num3 = sc.nextInt();
//     if(num1>num2 && num1>num3){
//       System.out.println("Number 1 is greatest.");
//     }
//     else if(num2>num1 && num2>num3){
//       System.out.println("Number 2 is greatest.");
//     }
//     else{
//       System.out.println("Number 3 is greatest.");
//     }
//     sc.close();
//   }
// }


//Ternary Operator
// public class Cond{
//   public static void main(String[] args) {
//     int num1 = 10;
//     int num2 = 20;
//    System.out.println((num1>num2)? "Number 1 is greater than Number 2.": "Number 2 is greater than Number 1.");
//   }
//}

// import java.util.Scanner;
// public class Cond{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter marks of English, Math and Science: ");
//     int english = sc.nextInt();
//     int math = sc.nextInt();
//     int science = sc.nextInt();
//     int total = english + math + science;
//     double percentage = (total/300.0)*100;
//    System.out.println( (percentage>=35)?"Pass":"Fail");
//    sc.close();
//   }
// }


//Switch Case
import java.util.Scanner;
public class Cond{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number between 1 and 7: ");
    int day = sc.nextInt();
    switch(day){
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
      default:
        System.out.println("Invalid input.");
    }
    sc.close();
  }
}