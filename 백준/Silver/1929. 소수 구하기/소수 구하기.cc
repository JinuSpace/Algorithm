#include <iostream>
#include <string>
#include <stack>
#include <bits/stdc++.h>

using namespace std;

typedef long long ll;


bool isPrime(int n)
{
    if (n < 2) {
        return false;
    }
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}


void solve(int a, int b) {
    for(int i = a;i <= b;i++){
        if(isPrime(i)){
            cout << i << "\n";
        }
    }
}

int main() {
    
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    
    int a, b;
    
    cin >> a >> b;
    
    
    solve(a,b);
    return 0;
}
