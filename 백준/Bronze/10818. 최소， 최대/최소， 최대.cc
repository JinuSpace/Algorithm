#include <bits/stdc++.h>
using namespace std;
int main() {
    int N;
       std::cin >> N;

       int min_value = numeric_limits<int>::max();
       int max_value = numeric_limits<int>::min();

       for (int i = 0; i < N; i++) {
           int num;
           cin >> num;

           if (num < min_value) {
               min_value = num;
           }
           if (num > max_value) {
               max_value = num;
           }
       }

       cout << min_value << " " << max_value << endl;
    
    return 0;
}
