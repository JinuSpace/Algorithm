#include <string>
#include <vector>
#include <bits/stdc++.h>

using namespace std;

#define ll long long



void solve(int E, int S, int M){
	int num = 1;
	
	while(1){
        
        if((num-E)%15 == 0 && (num-S)%28 == 0 && (num-M)%19 == 0){
            break;
        }
        else num++;
        
    }
    
    cout << num << "\n";
	
}

int main() {
    
	int E, S, M;
	
	cin >> E >> S >> M;
	
	
 	solve(E, S, M);
	

    return 0;

}



