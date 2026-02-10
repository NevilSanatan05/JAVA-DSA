// Sum of sub-array
//  #include<iostream>
//  #include<vector>
//  using namespace std;
//  int main(){
//    int n=5;
//    int arr[]={1,2,3,4,5};
//    for(int st=0;st<n;st++){
//      for(int end=st;end<n;end++){
//        for(int i=st;i<=end;i++){
//          cout<<arr[i];
//        }
//        cout<<" ";
//      }
//      cout<<endl;
//    }
//    return 0;
//  }


// #include <iostream>
// #include <vector>
// #include <climits>
// using namespace std;
// int main()
// {

//   int n = 5;
//   int arr[] = {1, 2, 3, 4, 5};
//   int maxSum = INT_MIN;
//  int currSum=0;
//  for(int st=0;st<n;st++){
//   currSum+=st;
//   maxSum=max(currSum,maxSum);
// if(currSum<0){
//   currSum=0;
// } 
// cout<<"Sum of is "<<maxSum<<endl;
// } 
 

//   return 0;
// }