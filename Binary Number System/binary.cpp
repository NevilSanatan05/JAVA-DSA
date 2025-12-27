//Decimal to Binary Conversion
// #include <iostream>
// using namespace std;
// int decToBinary(int n)
// {
//   int ans = 0, pow = 1;
//   while (n > 0)
//   {
//     int rem = n % 2;
//     n = n / 2;
//     ans += rem * pow;
//     pow *= 10;
//   }
//   return ans;
// }
// int main()
// {

//   for (int i = 0; i <= 10; i++)
//   {
//   cout<<decToBinary(i)<<endl;
//   }
  
//   return 0;
// }


//Binary to Decimal Conversion
// #include <iostream>
// using namespace std;
// int binaryToDecimal(int n)
// {
//   int ans = 0, pow = 1;
//   while (n > 0)
//   {
//     int rem = n % 10;
//     n = n / 10;
//     ans += rem * pow;
//     pow *= 2;
//   }
//   return ans;
// }
// int main()
// {

//   cout << binaryToDecimal(1010) << endl;
//   return 0;   
// }