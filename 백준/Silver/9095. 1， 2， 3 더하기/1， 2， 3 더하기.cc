#include <iostream>
#include <string>
#include <stack>
#include <bits/stdc++.h>

using namespace std;

typedef long long ll;


int dp[12] = {0,};

void solve(int n){
    
    int input = 0;
    
        
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for(int i = 4;i<11;i++){
           dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        
        }
            
            while(n--){
                cin >> input;
                cout << dp[input] << "\n";
            }
        
    
   
}


int main() {
    
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    
    int n;
    
    cin >> n;
    
    
    solve(n);
    return 0;
}
