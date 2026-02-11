// import java.util.Scanner;

// public class Prac {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter two numbers and an operator (+, -, *, /):");
//     double a = sc.nextDouble();
//     double b = sc.nextDouble();
//     char result = sc.next().charAt(0);
//     switch (result) {
//       case '+':
//         System.out.println(a + b);
//         break;
//       case '-':
//         System.out.println(a - b);
//         break;
//       case '*':
//         System.out.println(a * b);
//         break;
//       case '/':
//         System.out.println(a / b);
//         break;
//       default:
//         System.out.println("Invalid operator");
//     }
//     sc.close();
//   };
// }

// import java.util.Scanner;

// public class Prac {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter a number:");
//     int num = sc.nextInt();
//     if (num > 0) {
//       System.out.println(num + " is positive.");
//     } else if (num < 0) {
//       System.out.println(num + " is negative.");
//     } else {
//       System.out.println(num + " is zero.");
//     }
//     sc.close();
//   }
// }

// public class Prac {
//   public static void main(String[] args) {
//    double temp = 103.5;
//    if(temp>100){
//     System.out.println("You have a fever.");
//    }
//    else{
//     System.out.println("You are healthy.");
//    }
//   }
// }


// import java.util.Scanner;

// public class Prac {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int day = sc.nextInt();
//     switch(day){
//       case 1:
//         System.out.println("Monday");
//         break;
//       case 2:
//         System.out.println("Tuesday");
//         break;
//       case 3:
//         System.out.println("Wednesday");
//         break;
//       case 4:
//         System.out.println("Thursday");
//         break;
//       case 5:
//         System.out.println("Friday");
//         break;
//       case 6:
//         System.out.println("Saturday");
//         break;
//       case 7:
//         System.out.println("Sunday");
//         break;
//       default:
//         System.out.println("Invalid input");
//     }
//     sc.close();
//   }
// }

// public class Prac {
//   public static void main(String[] args) {
//     int a=63,b=36;
//     boolean x= (a<b)?true:false;
//     int y= (a>b)?a:b;
//     System.out.println("x = " + x);
//     System.out.println("y = " + y);
//   }
// }

// import java.util.Scanner;
// public class Prac {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter a year:");
//     int year = sc.nextInt();
//     if(year%4==0 && year%100!=0 || year%400==0){
//       System.out.println(year + " is a leap year.");
//     }
//     else{
//       System.out.println(year + " is not a leap year.");
//     }
//     sc.close();
//   }
// }