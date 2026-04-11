
// //Strings are immutable
// import java.util.Scanner;

// public class Basic {

//   char arr[] = { 'a', 'b', 'c', 'd' };
//   String str = "abcd";
//   String str2 = new String("xyz@#123");

//   public static void printLetters(String str) {
//     for (int i = 0; i < str.length(); i++) {
//       System.out.print(str.charAt(i) + " ");
//     }
//     System.out.println();
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     // String name;
//     // name = sc.nextLine();
//     // System.out.println(name);
//     // System.out.println(name.length());

//     // Concatenation
//     String firstName = "Nevil";
//     String lastName = "Barick";
//     System.out.println(firstName + " ".concat(lastName));
//     // System.out.println(firstName.charAt(1));

//     printLetters(lastName);
//   }
// }

//Comparing
// public class Basic {
//   public static void main(String[] args) {
//     String s1 = "Tony";
//     String s2 = "Tony";
//     String s3 = new String("Tony");

//     // if (s1 == s2) {
//     //   System.out.println("Strings are equal");
//     // } else {
//     //   System.out.println("Strings are not equal");
//     // }

//     // if (s1 == s3) {
//     //   System.out.println("Strings are equal");
//     // } else {
//     //   System.out.println("Strings are not Equal");
//     // }

//     if(s1.equals(s3)){
// System.out.println("Strings are equal");
//     }
//     else{
//       System.out.println("Strings are not equal");
//     }
//   }
// }


//String Functions - SubString
public class Basic {
  public static String substring(String str,int si,int ei) {
    String substr = "";
    for(int i=si;i<ei;i++){
      substr += str.charAt(i);
    }
    return substr;
  }
 public static void main(String[] args) {
  String str = "HelloWorld";
  System.out.println(substring(str,0,5));
 }
}