#include <string>
#include <vector>
#include <bits/stdc++.h>

using namespace std;

#define ll long long


int maxValue = 0;


void solve(int n){
	int black[n] ={0,}; 
	cin >> maxValue;
	
	
	for(int i = 0;i<n;i++){
		int read = 0;
		cin >> read;
		
		black[i] = read;
	}
	int current = 0;
	for(int i = 0;i<n-2;i++){
		for(int j =i+1;j<n-1;j++){
			for(int k = j+1;k<n;k++){
				int sum = black[i] + black[j] + black[k];
				if(sum >current && sum <= maxValue){
					current = sum;
				}
			}
			
		}
	}
	cout << current << "\n";
}

int main() {
    
	int n;
	
	cin >> n;
	
	
 	solve(n);
	

    return 0;

}



