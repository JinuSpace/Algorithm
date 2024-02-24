#include <iostream>
#include <string>
#include <stack>
#include <bits/stdc++.h>

using namespace std;

typedef long long ll;


int dp[1001];

void solve(int n) {
    
    
    dp[1] = 1;
    dp[2] = 2;

    
    for(int i = 3; i <= n; i++){
            dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
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
