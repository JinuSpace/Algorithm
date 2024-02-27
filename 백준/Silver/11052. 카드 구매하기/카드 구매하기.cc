#include <string>
#include <vector>
#include <bits/stdc++.h>

using namespace std;


int dp[1001] = {0,};
int arr[1001] = {0,};
void solve(int n){
	
	
		
		
		for(int i = 1;i<=n;i++){
			int input = 0;
		cin >> input;
			arr[i] = input;
		}
		
		for(int i = 1; i<= n;i++){
			for(int j = 1; j<=i;j++){
				dp[i] = max(dp[i], dp[i-j]+ arr[j]);
			}
		}
		
	
	cout << dp[n];
	
	}

int main() {
    
	int n;
	
	cin >> n;
	
	
 	solve(n);
	
	

    return 0;
}



