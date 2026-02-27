//Linear Search
// public class search {
//   public static int linearSearch(int numbers[], int key) {
//     for(int i=0; i<numbers.length; i++) {
//       if(numbers[i] == key) {
//         return i;
//       }
//     }
//     return -1;
//   }
//   public static void main(String[] args) {
//     int numbers[] = {2,4,6,8,10,12,14,16};
//     int key = 1;
//     int index = linearSearch(numbers, key);
//     if(index == -1){
//       System.out.println("Key not found in the array");
//     } else {
//       System.out.println("Key found at index: " + index);
//     }
//   }
// }


// public class search{
//   public static int linearSearch(String menu[], String key) {
//     for(int i=0;i<menu.length; i++) {
//       if(menu[i] == key){
//         return i;
//       }
//     }    return -1;
//   }
    
   
//   public static void main(String[] args) {
//     String menu[] = {"Pizza", "Burger", "Pasta", "Fries"};
//     String key = "Pasta";
//     int index = linearSearch(menu, key);
//     if(index == -1) {
//       System.out.println("Menu not found in the menu");
//     } else {
//       System.out.println("Menu found at index: " + index);
//     }
//   }
// }

public class search{
  public static int large(int numbers[]){
    int largest = Integer.MIN_VALUE;
    for(int i=0;i<numbers.length;i++){
      if(numbers[i]>largest){
        largest = numbers[i];
      }
    }
      return largest;
  }
  public static void main(String[] args) {
    int numbers[] = {1,2,6,3,5};
    int larger = large(numbers);
   System.out.println("Largest number is " + larger);
  }
}