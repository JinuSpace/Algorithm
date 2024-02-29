#include <string>
#include <vector>
#include <bits/stdc++.h>

using namespace std;

#define ll long long

int arr[10001];
int dp[10001];



void solve(int n){
	
	for(int i = 1;i<=n;i++){
		cin >> arr[i];
	}
	
	for(int i = 1; i<=n;i++){
		dp[i] = arr[i]; 
		for (int j = 1; j <= i; j++) {
			dp[i] = min(dp[i], dp[i - j] + dp[j]);
		}
			
	}
		cout << dp[n] << "\n";
	}

int main() {
    
	int n;
	
	cin >> n;
	
	
 	solve(n);
	
	

    return 0;
}



