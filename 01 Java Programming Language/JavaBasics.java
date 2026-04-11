// public class JavaBasics{
//   public static void main(String[] args){
//     System.out.print("Hello World !");
//   }
// }

// public class JavaBasics{
//   public static void main(String[] args){
// System.out.println("****");
// System.out.println("***");
// System.out.println("**");
// System.out.println("*");
//     System.out.print("****\n***\n**\n*");
//   }
// }

// public class JavaBasics{
//   public static void main(String[] args){
//     byte a =8;
//     System.out.println(a);
//     char b ='A';
//     System.out.println(b);
//     boolean c = true;
//     System.out.println(c);
//     float d = 3.14f; //double
//     System.out.println(d);
//     int e = 100; //long 
//     System.out.println(e);
//     short n = 1000;
//     System.out.println(n);
//   }
// }

/*
public class JavaBasics{
  public static void main(String[] args){
    int a = 10,b=20;
    System.out.println("The sum of a & b is:"+(a+b));
  }
}
*/

// import java.util.Scanner;

// public class JavaBasics{
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the value of a & b:");
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     System.out.println("The sum of a & b is:"+(a+b));
//     sc.close();
//   }
// }

// import java.util.Scanner;

// public class JavaBasics {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the value of a : ");
//     int a = sc.nextInt();
//     System.out.print("Enter the value of b : ");
//     int b = sc.nextInt();
//     System.out.println("The sum of a&b is: " + (a + b));

//     sc.close();
//   }
// }

// import java.util.Scanner;

// public class JavaBasics {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the radius of circle : ");
//     int r = sc.nextInt();
//     double area = 3.14 * r * r;
//     System.out.println("The area of circle is :" + (area));

//     sc.close();
//   }
// }


//Type Conversion
// public class JavaBasics {
//   public static void main(String[] args) {
//     // int a = 25;
//     // long b = a;
//     long a = 25;
//     int b = a; //error
//     System.out.println(b);
//   }
// }


//Type Casting
public class JavaBasics {
  public static void main(String[] args) {
    // long a = 25;
    // int b = (int) a; //type casting
    char ch = 'A';
    System.out.println(ch);
    int b = ch;
    System.out.println(b);
  }
}