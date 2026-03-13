//String is Palindrome ?

// public class Question {
//   public static boolean isPalindrome(String str){
//     for(int i=0;i<str.length()/2;i++){
//       int n = str.length();
//       if(str.charAt(i)!= str.charAt(n-1-i)){
//         return false;
//       }
//     }
//     return true;
//   }

//   public static void main(String[] args) {
//     String str = "racecar";
//     System.out.println(isPalindrome(str));
//   }
// }

// Given a route containing 4 directions (E, W, N, S)
// Find the shortest path to reach the destination

// public class Question {

//     public static double getShortestPath(String path) {
//         int x = 0, y = 0;

//         // Traverse the path
//         for (int i = 0; i < path.length(); i++) {
//             char dir = path.charAt(i);

//             if (dir == 'S') {
//                 y--;
//             } 
//             else if (dir == 'N') {
//                 y++;
//             } 
//             else if (dir == 'W') {
//                 x--;
//             } 
//             else if (dir == 'E') {
//                 x++;
//             }
//         }

//         // Apply distance formula
//         int X2 = x * x;
//         int Y2 = y * y;

//         double shortestPath = Math.sqrt(X2 + Y2);
//         return shortestPath;
//     }

//     public static void main(String[] args) {

//         String path = "NS";

//         double result = getShortestPath(path);

//         System.out.println("Path : " + path);
//         System.out.println("Shortest Distance : " + result);
//     }
// }
