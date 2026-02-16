// public class JavaBasics {
//   public static void printHelloWorld() {
//     System.out.println("Hello World!");
//   }

//   public static void main(String[] args) {
//     printHelloWorld();
//   }
// }

// public class JavaBasics {
//   public static void printHelloWorld() {
//     System.out.println("Hello World!");
//     return;
//   }

//   public static void main(String[] args) {
//     printHelloWorld();
//   }
// }

//Functions with parameters and return type

// public class JavaBasics {

// public static int Sum(int a,int b){
// return a+b;
// }
//   public static void main(String[] args) {
//  System.out.println(Sum(3,4));
//   }
// }

// import java.util.Scanner;

// public class JavaBasics {

//   public static int Sum() {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the value of a and b : ");
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     int Sum =a+b;
//     return Sum;
//   }

//   public static void main(String[] args) {
//     System.out.println(Sum());
//   }
// }

//parameters - values that we pass to a function when we call it. They are used to provide input to the function and can be of any data type, such as int, String, etc.
//arguments - values that we pass to a function when we call it. They are used to provide input to the function and can be of any data type, such as int, String, etc. The terms "parameters" and "arguments" are often used interchangeably, but technically, parameters refer to the variables defined in the function signature, while arguments refer to the actual values passed to the function when it is called.

// import java.util.Scanner;

// public class JavaBasics {

//   public static void printHelloWorld() {
//     System.out.println("Hello World!");
//     System.out.println("Hello World!");
//     System.out.println("Hello World!");
//   }

//   public static int calculateSum(int num1, int num2) {
//     int sum = num1 + num2;
//     return sum;

//   }

//  public static void swap(int a,int b){
//    int temp = a;
//    a = b;
//    b = temp;
//    System.out.println("a = "+ a);
//    System.out.println("b = "+ b);
//  }

//   public static void main(String[] args) {
//     // swap - value exchange between two variables
//     int a = 5;
//     int b = 10;
//     swap(a, b);
//     System.out.println("a = "+ a);
//     System.out.println("b = "+ b);
//   }
// }

//Call by value - when we pass variable to function, we are passing the value of variable to function. So, if we change the value of variable inside function, it will not change the value of variable outside function. This is because, in call by value, a copy of variable is created and passed to function. So, any changes made to variable inside function will not affect the original variable outside function. -- Copy


//Call by reference - when we pass variable to function, we are passing the reference of variable to function. So, if we change the value of variable inside function, it will change the value of variable outside function. This is because, in call by reference, a reference of variable is created and passed to function. So, any changes made to variable inside function will affect the original variable outside function. -- Original


// import java.util.Scanner;
// public class JavaBasics {

//  public static int Prod(int a , int b){
//   Scanner sc = new Scanner(System.in);
//   System.out.print("Enter the value of a and b : ");
//   int m = sc.nextInt();
//   int n= sc.nextInt();
//   int prod = m*n;
//   return prod;
//  }

//   public static void main(String[] args) {
//     System.out.println(Prod(3,4));
//  }
// }


//Factorial
// public class JavaBasics {

//   public static int Fact(int a){
//    int fact = 1;
   
//    for(int i=1;i<=a;i++){
//     fact = fact*i;
//    }
//    return fact; 
//   }

//    public static void main(String[] args) {
//     System.out.println(Fact(3));
//   }
// }