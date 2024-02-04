#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int input = 0;
stack<int> stk;
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    
        
    cin >> input;

    for (int i = 0; i < input; ++i){
        string s;
        cin >> s;
        
        if(s == "top"){
            if(!stk.empty()){
                cout << stk.top() << "\n";
            }else{
                cout << -1 << "\n";
            }
        }else if(s == "size"){
            cout << stk.size() << "\n";
        }else if(s == "empty"){
            if(!stk.empty()){
                cout << 0 << "\n";
            }else{
                cout << 1 << "\n";
            }
        }else if(s == "pop"){
            if(stk.empty()){
                cout << -1 << "\n";
            }else{
            cout << stk.top() << "\n";
            stk.pop();
            }
        }else{
            int n;
            cin >> n;
            stk.push(n);
        }
    }
    
    
    
    return 0;
}
