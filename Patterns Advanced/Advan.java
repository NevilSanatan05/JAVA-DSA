// public class Advan {
//   public static void hollow_rectangle(int totRows , int totCols){
//     for(int i=1;i<=totRows;i++){
//       for(int j=1;j<=totCols;j++){
//         if(i==1||i==totRows||j==1||j==totCols){
//           System.out.print("*");
//         }
//         else{
//           System.out.print(" ");
//         }
//       }
//       System.out.println();
//     }
//   }
//   public static void main(String[] args) {
//     hollow_rectangle(4, 5);
//   }
// } 


//Inverted and rotated half pyramid
// public class Advan {
// public static void inverted_rotated_half_pyramid(int totRows){
//   for(int i=1;i<=totRows;i++){
//     for(int j=1;j<=totRows-i;j++){
//       System.out.print(" ");

//     }
//     for(int k=1;k<=i;k++){
//       System.out.print("*");
//     }
//     System.out.println("");
//   }
// }
//   public static void main(String[] args) {
//     inverted_rotated_half_pyramid(4); 
//   }
// }


//Inverted half pyramid with numbers
// public class Advan {
//   public static void inverted_half_pyramid(int totRows) {
//     for (int i = 1; i <= totRows; i++) {
//       for (int j = 1; j <= totRows - i + 1; j++) {
//         System.out.print(j + " ");
//       }
//       System.out.println("");
//     }
//   }

//   public static void main(String[] args) {
//     inverted_half_pyramid(4);
//   }
// }