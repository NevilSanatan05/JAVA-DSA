// import java.util.Scanner;

// public class InputDemo{
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     double r = sc.nextDouble();   // fixed
//     double a = 3.142 * r * r;
//     System.out.println(a);
//     sc.close();
//   }
// }

// import java.util.Scanner;
// public class InputDemo{
//   public static void main(String[] args) {
//     int l,b;
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter length of rectangle :");
//     l = sc.nextInt();
//     System.out.print("Enter breadth of rectangle : ");
//     b = sc.nextInt();
//     int area = l * b;
//     System.out.println("The Area of rectangle is:   " + area);
//     sc.close();
//   }
// }

// import java.util.Scanner;
// public class InputDemo{
//   public static void main(String[] args) {
//     int side,area;
//     Scanner sc=new Scanner(System.in);
//     System.out.print("Enter the side of a square : ");
//     side = sc.nextInt();
//     area=side*side;
//     System.out.println("The Area of a square is : " + area);
//     sc.close();
//   }
// }

import java.util.Scanner;

public class InputDemo {
  public static void main(String[] args) {
    int a, b;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the two numbers : ");
    a = sc.nextInt();
    b = sc.nextInt();
    int sum = a + b;
    System.out.println("The Sum of two numbers is : " + sum);
    sc.close();
  }
}