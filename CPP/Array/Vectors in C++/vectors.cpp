// #include<iostream>
// #include<vector>
// using namespace std;
// int main(){
//   // vector<int> vec={1,2,3};
//   vector<int> vec(5,0);
//   cout<<vec[0]<<endl;
//   cout<<vec[1]<<endl;
//   cout<<vec[2]<<endl;
//   cout<<vec[3]<<endl;
//   cout<<vec[4]<<endl;

//   return 0;
// }

// for-each loop
// #include <iostream>
// #include <vector>
// using namespace std;
// int main()
// {
//   vector<int> vec(5, 0);
//   for (int i : vec)
//   {
//     cout << i << endl;
//   }

//   return 0;
// }

// #include <iostream>
// #include <vector>
// using namespace std;
// int main()
// {
//   vector<char> vec={'a','b','c','d','e'};
//   for(char val:vec){
//     cout<<val<<endl;
//   }

//   return 0;
// }

// Vector Functions
// size,push_back,pop_back,front,back,at)
//  #include <iostream>
//  #include <vector>
//  using namespace std;
//  int main()
//  {
//    vector<char> vec={'a','b','c','d','e'};
//    cout<<"size = "<<vec.size()<<endl;
//    for(char val:vec){
//      cout<<val<<endl;
//    }

//   return 0;
// }

// #include <iostream>
// #include <vector>
// using namespace std;
// int main()
// {
//   vector<int> vec;
//   cout<<"size = "<<vec.size()<<endl;
//   vec.push_back(10);
//   cout<<"sizr after push_back = "<<vec.size()<<endl;
//   for(char val:vec){
//     cout<<val<<endl;
//   }

//   return 0;
// }

// #include <iostream>
// #include <vector>
// using namespace std;
// int main()
// {
//   vector<int> vec = {1, 2, 3, 4, 5};
//   cout << "size = " << vec.size() << endl;
//   vec.pop_back();
//   cout << "size after pop_back = " << vec.size() << endl;
//   for (int val : vec)
//   {
//     cout << val << endl;
//   }

//   return 0;
// }

// Static vs Dynamic Allocation
// Static Allocation - memory is allocated at compile time , inside stack
// Dynamic Allocation - memory is allocated at run time , inside heap
#include <iostream>
#include <vector>
using namespace std;
int main()
{
  vector<int> vec;
  vec.push_back(0);
  vec.push_back(1);
  vec.push_back(2);
  vec.push_back(3);
  vec.push_back(4);
  
  cout << vec.size() << endl;
  cout << vec.capacity() << endl;

  return 0;
}