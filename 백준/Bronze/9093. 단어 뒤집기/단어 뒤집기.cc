#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int input = 0;
stack<char> stk;
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    
        
    cin >> input;
    cin.ignore();
    
    for (int i = 0; i < input; ++i){
        string s;
        getline(cin,s);
        s+= ' ';
        for(int j = 0;j<s.size();j++){
            if(s[j] == ' '){
                while(!stk.empty()){
                    cout << stk.top();
                    stk.pop();
                }
                cout << ' ';
            }else{
                stk.push(s[j]);
            }
        }
        cout << "\n";
    }
    
    return 0;
}
