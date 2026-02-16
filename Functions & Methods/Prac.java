// public class Prac{

//   public static int Fact(int a){
//    int fact = 1;

//    for(int i=1;i<=a;i++){
//     fact = fact*i;
//    }
//    return fact; 
//   }
// public static int binCoeff(int n, int r) {
//     int factN = Fact(n);
//     int factR = Fact(r);
//     int factNR = Fact(n-r);
//     int binCoeff = factN/(factR*factNR);
//     return binCoeff;

// }
//    public static void main(String[] args) {
//     System.out.println(binCoeff(5,2));  
//   }
// }

// public class Prac {

//     public static boolean Pri(int a) {
//         if (a <= 1) {
//             return false;
//         }

//         for (int i = 2; i <= Math.sqrt(a); i++) {
//             if (a % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         int num = 5;

//         if (Pri(num)) {
//             System.out.println("Prime number");
//         } else {
//             System.out.println("Not a prime number");
//         }
//     }
// }


//Print all prime numbers between 1 to n
// public class Prac {

//     public static boolean Pri(int a) {
//         if (a <= 1) {
//             return false;
//         }

//         for (int i = 2; i <= Math.sqrt(a); i++) {
//             if (a % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         int n = 20;

//         System.out.println("Prime numbers between 1 and " + n + ":");
//         for (int i = 1; i <= n; i++) {
//             if (Pri(i)) {
//                 System.out.print(i + " ");
//             }
//         }
//     }
// } 

//Binary to Decimal
// public class Prac {

//     public static int BinToDec(int bin) {
//         int dec = 0;
//         int pow = 1;

//         while (bin > 0) {
//             int lastDigit = bin % 10;
//             dec += lastDigit * pow;
//             pow *= 2;
//             bin /= 10;
//         }

//         return dec;
//     }

//     public static void main(String[] args) {
//         int bin = 1010;
//         System.out.println("Decimal equivalent of " + bin + " is: " + BinToDec(bin));
//     }
// }


//decimal to Binary
// public class Prac {
  
//     public static void DecToBin(int dec) {
//         int original = dec;   // store original value
//         StringBuilder bin = new StringBuilder();

//         while (dec > 0) {
//             int rem = dec % 2;
//             bin.append(rem);
//             dec /= 2;
//         }

//         System.out.println("Binary equivalent of " + original + " is: " + bin.reverse());
//     }

//     public static void main(String[] args) {
//         int dec = 10;
//         DecToBin(dec);
//     }
// }


// public class Prac{
//     public static boolean isEven(int a){
//     return a%2==0;
//     }
//     public static void main(String[] args) {
//        int num = 3;
//        if(isEven(num)){
//         System.out.println("Even number");
//        }
//        else{
//         System.out.println("Odd number");
//        }
//     }
// }


// public class Prac {
//     public static int Pal(int a) {
//         int original = a;
//         int rev = 0;
//         if(original <0){
//             return -1;
//         }
//         while(a>0){
//             int lastDigit = a%10;
//             rev = rev*10+lastDigit;
//             a=a/10;
//         }
//         return rev;
//     }

//     public static void main(String[] args) {
//        System.out.println(Pal(-53728));
//     }
// }


public class Prac {
    public static int Sum(int a) {

      int original = a;
      int sum = 0;
      int lastdigit = original%10;
      while(a>0){
        sum = sum +lastdigit;
        a=a/10;
        lastdigit = a%10;   
      }
      return sum;
    }

    public static void main(String[] args) {
       System.out.println(Sum(1234));
    }
}