//Max subarrays - Brute 
// public class subarrays {
//   public static void subArray(int numbers[]) {
//     int ts = 0;
//     int currSum = 0;
//     int maxSum = Integer.MIN_VALUE;
//     for (int i = 0; i < numbers.length; i++) {
//       int start = i;

//       for (int j = i; j < numbers.length; j++) {
//         int end = j;
//         currSum = 0;

//         for (int k = start; k <= end; k++) {
//           // System.out.print(numbers[k] + " ");
//           currSum += numbers[k];
//         }
//         System.out.println(currSum);
//         if (maxSum < currSum) {
//           maxSum = currSum;
//         }
//         ts++;

//       }

//     }
//     // System.out.println("Total subarrays = " + ts);
//     System.out.println("max sum = "+ maxSum);
//   }

//   public static void main(String[] args) {
//     int numbers[] = { 2, 4, 6, 8, 10 };
//     subArray(numbers);
//   }
// }

//Max subarrays - Prefic Sum
// public class subarrays {
//   public static void subArray(int numbers[]) {

//     int currSum = 0;
//     int maxSum = Integer.MIN_VALUE;
//     int prefix[] = new int[numbers.length];
//     for (int i = 1; i < prefix.length; i++) {
//       prefix[i] = prefix[i - 1] + numbers[i];
//     }

//     for (int i = 0; i < numbers.length; i++) {
//       int start = i;
//       for (int j = i; j < numbers.length; j++) {
//         int end = j;
//         currSum = start == 0 ? prefix[end] : prefix[start - 1];
//         if (maxSum < currSum) {
//           maxSum = currSum;
//         }
//       }

//     }

//     // System.out.println("Total subarrays = " + ts);
//     System.out.println("max sum = " + maxSum);

//   }

//   public static void main(String[] args) {
//     int numbers[] = { 2, 4, 6, 8, 10 };
//     subArray(numbers);
//   }
// }


//Kadane'sAlgorithm
public class subarrays {
  // public static void subArray(int numbers[]) {

  //   int currSum = 0;
  //   int maxSum = Integer.MIN_VALUE;
  //   int prefix[] = new int[numbers.length];
  //   for (int i = 1; i < prefix.length; i++) {
  //     prefix[i] = prefix[i - 1] + numbers[i];
  //   }

  //   for (int i = 0; i < numbers.length; i++) {
  //     int start = i;
  //     for (int j = i; j < numbers.length; j++) {
  //       int end = j;
  //       currSum = start == 0 ? prefix[end] : prefix[start - 1];
  //       if (maxSum < currSum) {
  //         maxSum = currSum;
  //       }
  //     }

  //   }

    // System.out.println("Total subarrays = " + ts);
  //   System.out.println("max sum = " + maxSum);

  // }

  public static void kadanes(int numbers []){
      int ms = Integer.MIN_VALUE;
      int cs = 0;
      for(int i=0;i<numbers.length;i++){
        cs = cs+ numbers[i];
        if(cs<0){
          cs = 0;
        }
        ms = Math.max(cs,ms);
      }
      System.out.println("Our max subarray sum is :" + ms);
  }

  public static void main(String[] args) {
    int numbers[] = { -2,-3,4,-1,-2,1,5,-3 };
    kadanes(numbers);
  }
}
