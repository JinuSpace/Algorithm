#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int input = 0;
int sum = 0;
stack<int> stk;
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    
        
    cin >> input;

    for (int i = 0; i < input; ++i){
            int num = 0;
            cin >> num;
        if (num != 0){
            stk.push(num);
        }else
            stk.pop();
        }


        while (!stk.empty()){
            sum += stk.top();
            stk.pop();
        }

        cout << sum << endl;
    
    
    
    return 0;
}
