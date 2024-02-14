#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int reverse(int n){
    stack<int> stk;
    int ret = 0;
    
    while(n>0){
        stk.push(n%10);
        n/=10;
    }
    
    int ten = 1;
        while (!stk.empty()) {
            ret += stk.top() * ten;
            stk.pop();
            ten *= 10;
        }
    
    
    return ret;
}


void solve(int a, int b){
    int answer = reverse(a)+ reverse(b);
   
    cout << reverse(answer);
    
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    int a, b;
    cin >> a >> b;
    
    
    solve(a,b);
    
    
    return 0;
}
