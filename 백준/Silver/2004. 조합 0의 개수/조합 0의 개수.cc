#include <string>
#include <vector>
#include <bits/stdc++.h>

using namespace std;

long long func(int n, int x){
	int num = 0;

	for (long long i = x; n / i >= 1; i *= x) {
		num += n / i;
	}

	return num;
}

void solve(int n, int m){
	
	long long five = 0;
	long long two = 0;
	

	five = func(n, 5) - func(n - m, 5) - func(m, 5);
	two = func(n, 2) - func(n - m, 2) - func(m, 2);

	cout << min(five, two) << endl;
}

int main() {
    
	int n, m;
	
	cin >> n >> m;
	
 	solve(n, m);
	
	

    return 0;
}



