// public class for_loop {
//   public static void main(String[] args) {
//     for(int i =0;i<=10;i++){
//       System.out.println(i);
//     }
//   }
// }


// public class for_loop {
//   public static void main(String[] args) {
//    for(int i =0;i<=3;i++){
//      System.out.println("****");
//    }
//   }
// }

//Reverse of a number
public class for_loop {
  public static void main(String[] args) {
    int n = 134;
    int rev = 0;
    for(int i = n;i>0;i/=10){
      int rem = i%10;
      rev = rev*10+rem;
    }
    System.out.println(rev);
  }
}
