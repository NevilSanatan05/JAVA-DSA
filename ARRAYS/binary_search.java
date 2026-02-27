// public class binary_search {
//   public static int arr(int numbers[], int key) {
//     int start = 0, end = numbers.length - 1;
//     while (start <= end) {
//       int mid = (start + end) / 2;

//       if (numbers[mid] == key) {
//         return mid;
//       }
//       if (numbers[mid] < key) {
//         start = mid + 1;
//       } else {
//         end = mid - 1;
//       }
//     }
//     return -1;
//   }

//   public static void main(String[] args) {
//     int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };
//     int key = 10;
//     System.out.println("Index for key is : " + arr(numbers, key));
//   }
// }

//Reverse an array
// public class binary_search {
//   public static void reverse(int numbers[]) {
//     int first = 0, last = numbers.length - 1;
//     while (first < last) {
//       // swap
//       int temp = numbers[last];
//       numbers[last] = numbers[first];
//       numbers[first] = temp;
//       first++;
//       last--;

//     }

//   }

//   public static void main(String[] args) {
//     int numbers[] = { 2, 4, 6, 8, 10 };
//     reverse(numbers);

//     // print
//     for (int i = 0; i < numbers.length; i++) {
//       System.out.println(numbers[i] + " ");
//     }
//     System.out.println();
//   }
// }

