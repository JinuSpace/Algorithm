#include <iostream>
#include <string>
#include <stack>
#include <bits/stdc++.h>

using namespace std;

typedef long long ll;


int dp[1000001];

void solve(int n) {
    
    dp[0] = 0;
    dp[1] = 0;
    dp[2] = 1;
    dp[3] = 1;
    
    for(int i = 4;i<=n;i++){
        dp[i] = dp[i - 1] + 1;
        if(i % 2 == 0){
            dp[i] = min(dp[i], dp[i / 2] + 1);
            
        }
        if(i % 3 == 0){
            dp[i] = min(dp[i], dp[i / 3] + 1);
        }
    }
    
    
    
    
    cout << dp[n] << "\n";
    
}

int main() {
    
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    
    int n;
    
    cin >> n;
    
    
    solve(n);
    return 0;
}
