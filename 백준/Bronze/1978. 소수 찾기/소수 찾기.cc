#include <string>
#include <vector>
#include <bits/stdc++.h>

using namespace std;

bool isPrime(int input){
	
	if(input <= 1) {
		return false;
	}
        
		
		for(int i = 2;i<input;i++){
			if(input % i ==0){
				return false;
			}
		}
		
	return true;
}

int solve(int n){
	int answer = 0;
	
	
	
	while(n--){
		int input = 0;
		cin >> input;
		if(isPrime(input)){
			answer++;
		}
		
	}
	return answer;
}

int main() {
    
	int n = 0;
	
	cin >> n;
	
	int answer = solve(n);
	
	cout << answer;

    return 0;
}



