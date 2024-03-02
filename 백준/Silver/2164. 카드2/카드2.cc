#include <iostream>
#include <string>
#include <stack>
#include <bits/stdc++.h>

using namespace std;

typedef long long ll;

deque<int> dq;




void solve(int n){
    
    for(int i = 1;i<=n;i++){
        dq.push_back(i);
    }
    
    while(dq.size() != 1){
        dq.pop_front();
        dq.push_back(dq.front());
        dq.pop_front();
    }
    
    cout << dq[0] << "\n";
        

   
}


int main() {
    
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    
    int n;
    
    cin >> n;
    
    
    solve(n);
    return 0;
}
