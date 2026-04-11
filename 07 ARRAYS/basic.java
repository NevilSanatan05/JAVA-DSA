// import java.util.Scanner;
// public class basic{
//   public static void main(String[] args) {
//     int marks[] = new int [100];
//     Scanner sc = new Scanner(System.in);
//     marks[0] = sc.nextInt();
//     marks[1] = sc.nextInt();
//     marks[2] = sc.nextInt();
//     System.out.println("phy : " + marks[0]);
//     System.out.println("chem : " + marks[1]); 
//     System.out.println("math : " + marks[2]);

//   }
// }


//Passing arrays as arguments to a function
// public class basic{
//   public static void update(int marks[], int nonChangeable){
//     nonChangeable = nonChangeable + 1;
//     for(int i=0;i<marks.length;i++){
//       marks[i] = marks[i] + 1;
//     }
//   }
//   public static void main(String[] args) {
//     int marks[] = {97, 98, 99};
//     int nonChangeable = 10;
//     update(marks, nonChangeable);
//     System.out.println("nonChangeable : " + nonChangeable);
//     for(int i=0;i<marks.length;i++){
//       System.out.println(marks[i]);
//     }
   
//   }
// }