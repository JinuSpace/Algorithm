#include <string>
#include <vector>
#include <bits/stdc++.h>

using namespace std;

#define ll long long



void solve(int h, int m){
	int time = 0;
	int total = 0;
	cin >> time;
	total = time + m;
	
	if(total >= 60){
		h = h + (total /60);
		total = total %60;
		if(h >= 24){
			h = h-24;
		}
		cout << h << " " << total << "\n";
	}else{
		cout << h << " " << total << "\n";
	}
	
}

int main() {
    
	int h, m;
	
	cin >> h >> m;
	
	
 	solve(h, m);
	

    return 0;

}



