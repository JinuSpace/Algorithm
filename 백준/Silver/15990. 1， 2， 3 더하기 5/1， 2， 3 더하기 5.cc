#include <iostream>
#include <string>
#include <stack>
#include <bits/stdc++.h>

using namespace std;

typedef long long ll;

ll dp[1000001][4];

ll dpCal(int input){
    
    ll MOD = 1000000009;
    
    for(int i = 4;i<=input;i++){
        dp[i][1] = (dp[i-1][2] + dp[i-1][3]) % MOD;
        dp[i][2] = (dp[i-2][1] + dp[i-2][3]) % MOD;
        dp[i][3] = (dp[i-3][1] + dp[i-3][2]) % MOD;
    }
    

    
    
    return (dp[input][1] + dp[input][2] + dp[input][3]) % MOD;
}


void solve(int n){
    
    dp[1][1] = 1;
    dp[2][2] = 1;
    dp[3][1] = 1;
    dp[3][2] = 1;
    dp[3][3] = 1;
    
   
    while(n--){
        int input = 0;
        ll ret = 0L;
        cin >> input;
        
        ret = dpCal(input);
        
        cout << ret << "\n";
        
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
