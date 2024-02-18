#include <iostream>
#include <string>
#include <stack>
#include <bits/stdc++.h>

using namespace std;

typedef long long ll;



int gcd(int a, int b)
{
    int c;
    while (b != 0)
    {
        c = a % b;
        a = b;
        b = c;
    }
    return a;
}

int lcm(int a, int b)
{
    return a * b / gcd(a, b);
}


void solve(int n) {
    while(n--){
        int a, b;
        cin >> a >> b;
        
        cout << lcm(a, b)<< "\n";
        
    }
}

int main() {
    
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    int n = 0;
    
    cin >> n;
    
    
    solve(n);
    return 0;
}
