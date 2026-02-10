//Pass by reference using arrays
// #include<iostream>
// using namespace std;
// void changeArr(int arr[],int size){
//   cout<<"In function before change "<<endl;
//   for(int i=0;i<size;i++){
//     arr[i]=2*arr[i];
//   }
// }
// int main(){
//   int arr[]={1,2,3};
//   changeArr(arr,3);
//   cout<<"In main function after change "<<endl;
//   for(int i=0;i<3;i++){
//     cout<<arr[i]<<" ";
//   } 
//   cout<<endl;
//   return 0;
// }

//Linear Search
// #include<iostream>
// using namespace std;
// int main(){
//   int arr[]={4,2,7,8,1,2,5};
//   int size=7;
//   int target=8;
//   for(int i=0;i<size;i++){
//     if(arr[i]==target){
//       cout<<"Element found at index"<<" "<<i<<endl;
//     }
//   }
//   return 0;
// }

//Linear Search using pass by reference
// #include<iostream>
// using namespace std;
// int linearSearch(int arr[],int size,int target){
//   for(int i=0;i<size;i++){
//     if(arr[i]==target){
//       return i;
//     }
//   }
// }
// int main(){
//   int arr[]={4,2,7,8,1,2,5};
//   int size=7;
//   int target=8;
  
//   int index=linearSearch(arr,size,target);
//   cout<<"Element found at index"<<" "<<index<<endl;
//   return 0;
// }

//Reverse an array using 2 pointer methods
// #include<iostream>
// using namespace std;
// int main(){
//   int arr[]={1,2,3,4,5};
//   int size=5;
//   for(int i=0;i<size;i++){
//     cout<<arr[size-1-i]<<" ";
//   }
// }