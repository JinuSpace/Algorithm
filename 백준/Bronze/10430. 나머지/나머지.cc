#include <iostream>
#include <string>
#include <stack>
#include <bits/stdc++.h>

using namespace std;

typedef long long ll;

void solve(int A, int B, int C) {
    cout << (A+B)%C << "\n";
    cout << ((A%C) + (B%C))%C << "\n";
    cout << (A*B)%C << "\n";
    cout << ((A%C) * (B%C))%C<< "\n";
    
    
}

int main() {
    int A, B, C;
    
    cin >> A >> B >> C;
    
    solve(A,B, C);
    return 0;
}
