#include <string>
#include <vector>
#include <bits/stdc++.h>

using namespace std;



void solve(int n){
	
	int answer = 0;
	
	for (int i = 5; i <= n; i *= 5) {
		answer += n / i;
	}
	
	cout << answer;
}

int main() {
    
	int n;
	
	cin >> n;
	
 	solve(n);
	
	

    return 0;
}



