#include <string>
#include <vector>
#include <bits/stdc++.h>

using namespace std;

int fac(int n){
	if(n < 1){
		return 1;
	}
	
	return n * fac(n-1);
}

void solve(int n){
	int answer = fac(n);
	
	cout << answer;
	
	
}

int main() {
    
	int n;
	
	cin >> n;
	
 	solve(n);
	
	

    return 0;
}



