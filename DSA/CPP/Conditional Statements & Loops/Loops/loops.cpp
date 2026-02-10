// For Loop

// #include<iostream>
// using namespace std;
// int main(){
//   int count=10;
//   for (int i = 0; i < count; i++)
//   {
//     cout<<i<<endl;
//   }

//   return 0;
// }

// While Loop
//  #include<iostream>
//  using namespace std;
//  int main(){
//   int count = 10;
//   int i=0;
//   while(i<=count){
//    cout<<i<<endl;
//    i++;
//   }
//    return 0;
//  }

// Do While Loop
//  #include<iostream>
//  using namespace std;
//  int main(){
//    int count = 10;
//    int i=0;
//    do{
//     cout<<i<<endl;
//     i++;
//    }while(i<=count);
//    return 0;
//  }

// Sum of first n natural numbers using loops:

//  #include<iostream>
//  using namespace std;
//  int main(){
//    int n,count=1,sum=0;
//    cout<<"Enter the number n : ";
//    cin>>n;
//    while(count<=n){
//      sum=sum+count;
//      count++;
//    }
//    cout<<"The Sum of n natural numbers is : "<<sum<<endl;
//    return 0;
//  }

// #include <iostream>
// using namespace std;
// int main()
// {
//   int n, count = 1, sum = 0;
//   cout << "Enter the number n : ";
//   cin >> n;
//   for (int count = 0; count <= n; count++)
//   {
//     sum = sum + count;
//     if(count==4){
//       break;
//     }
//   }
//   cout << "The Sum of n natural numbers is : " << sum << endl;
//   return 0;
// }

// Sum of all Odd numbers from 1 to N
//  #include <iostream>
//  using namespace std;
//  int main(){
//    int n,sum=0;
//    cout << "Enter the number n : ";
//    cin >> n;
//    for (int count = 1; count <= n; count+=2)
//    {
//      sum = sum + count;
//    }
//    cout << "The Sum of n natural numbers is : " << sum << endl;
//    return 0;
//  }

// Check Prime Number or Not
// #include <iostream>
// using namespace std;
// int main()
// {
//   int n;
//   bool isPrime = true;
//   cout << "Enter the number n : ";
//   cin >> n;
//   for (int count = 2; count < n - 1; count++)
//   {
//     if (n % count == 0)
//     {
//      isPrime = false;
//       break;
//     }
//   }
//   if (isPrime == true){
//     cout << n << " is a Prime Number" << endl;
//     return 0;
//   }
//   else{
//     cout << n << " is not a Prime Number" << endl;
//   }

//     return 0;
//   }

// Nested Loops
// #include <iostream>
// using namespace std;

// int main() {
//     int count = 5;

//     for (int i = 0; i < count; i++) {
//         for (int j = 0; j < i; j++) {
//             cout << "* ";
//         }
//         cout << endl; // move to next line
//     }

//     return 0;
// }

