#include <string>
#include <vector>
#include <bits/stdc++.h>

using namespace std;

#define ll long long

int gcd(int a, int b){
	if(b == 0){
		return a;
	}
	return gcd(b, a % b);
}




void solve(int n){
	
	while(n--){
		
		int count = 0;
		ll sum = 0;
		vector<int> v;
				
		cin >> count;
		
		for(int i = 0;i<count;i++){
			int input = 0;
			cin >> input;
			v.push_back(input);
		}
		
		for(int i = 0;i<count;i++){
			for(int j = i+1;j<count;j++){
				sum += gcd(v[i], v[j]);
			}
		}
		cout <<sum << "\n";
	}
	
	}

int main() {
    
	int n;
	
	cin >> n;
	
	
 	solve(n);
	
	

    return 0;
}



