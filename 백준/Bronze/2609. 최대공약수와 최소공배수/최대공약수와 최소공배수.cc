#include <iostream>
#include <string>
#include <stack>
#include <bits/stdc++.h>

using namespace std;

typedef long long ll;

int lcm(int a, int b)
{
    return a * b / gcd(a, b);
}

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


void solve(int a, int b) {
   
   cout << gcd(a, b)<< "\n";
   cout << lcm(a, b)<< "\n";
    
    
}

int main() {
    int a, b;
    
    cin >> a >> b;
    
    solve(a, b);
    return 0;
}
