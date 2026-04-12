import java.util.Scanner;

// public class Prac {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the value of a & b : ");

// Input from users
// int a = sc.nextInt();
// int b = sc.nextInt();

// Data Types
// byte a = 8;
// int b = 10;
// char c = 'A';
// boolean d = true;
// float e = 3.14f;
// short n = 1000;
// int a = 10 , b = 20;

// Type Conversion
// int a = 10;
// float b = a; // Implicit Type Conversion

// Type Casting
// long a = 25;
// int b = (int)a; // Explicit Type Casting

// Operators
// Post and Pre Increment/Decrement
// int a = 10;
// int b = ++a;
// int b = a++;
// int b = --a;
// int b = a--;

// Logical Operators
// int a =10;
// int b = 20;
// System.out.println(a==b && b==a);
// System.out.println(a==b || b==a);
// System.out.println(!(a==b || b==a));

// Assignment Operators
// int a = 10;
// a += 5;
// System.out.println(a);

// Conditional Statements

// Ternary Operator
// int age = sc.nextInt();
// System.out.println((age>=18)? "You are an adult." :"You are not an adult");

// If Statements
// int age = sc.nextInt();
// if(age>=18){
// System.out.println("You are an adult.");
// }

// If else Statements
// if (age >= 18) {
// System.out.println("You are an adult");
// }
// else if(age>=13 && age<18){
// System.out.println("You are a teenager");
// }
// else {
// System.out.println("You are not an adult");
// }

// Switch Statements
// System.out.print("Enter a number between 1 and 7 : ");
// int day = sc.nextInt();
// switch (day) {
// case 1:
// System.out.println("Monday");
// break;
// case 2:
// System.out.println("Tuesday");
// break;
// case 3:
// System.out.println("Wednesday");
// break;
// case 4:
// System.out.println("Thursday");
// break;
// case 5:
// System.out.println("Friday");
// break;
// case 6:
// System.out.println("Saturday");
// break;
// default:
// System.out.println("Invalid input");
// }

// Loops

// For Loop
// for(int i=1;i<=10;i++){
// System.out.println(i);
// }

// While Loop
// int i = 1;
// while(i<=5){
// System.out.println(i);
// i++;
// }

// Do While Loop
// int i = 1;
// do {
// System.out.println(i);
// i++;
// } while (i <= 5);

// Multiples of 10 using for loop
// for (int i = 1; i <= 10; i++) {
// System.out.println("10 * " + i + " = " + (10 * i));
// }

// Break
// for (int i = 1; i <= 10; i++) {
// if (i == 4) {
// break;
// }
// System.out.println(i);
// }

// continue
// for(int i =1;i<=10;i++){
// if(i==4){
// continue;
// }
// System.out.println(i);
// }

// Patterns

// Star Pattern
// for(int i=1;i<=4;i++){
// for(int j=1;j<=4;j++){
// System.out.print("*");
// }
// System.out.println("");
// }

// Inverted Star Pattern
// for(int i=1;i<=4;i++){
// for(int j = 1;j<=4-i+1;j++){
// System.out.print("*");
// }
// System.out.println();
// }

// Character Pattern
// char ch = 'A';
// for(int i=1;i<=4;i++){
// for(int j=1;j<=i;j++){
// System.out.println(ch);
// ch++;
// }
// System.out.println();
// }

// sc.close();
// }

// }
// ______________________________________________________________________________________________________________________________________________

// Functions and Methods

//Syntax
//public class Prac {
// public static void printHelloWorld(){
// System.out.println("Hello World");
// }
//  public static void main(String[] args) {
// printHelloWorld();
//  }
//}

//Functions with parameters and return type
// public class Prac {
//   public static int Sum(int a, int b) {
//     return a + b;
//   }

//   public static void main(String[] args) {
//     System.out.println(Sum(3, 4));
//   }
// }

import java.util.Scanner;

public class Prac {

  public static int Sum() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of a and b are : ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = a + b;
    return sum;
   
  }

  public static void main(String[] args) {
    System.out.println(Sum());
   
  }
}