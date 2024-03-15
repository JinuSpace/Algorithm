#include <bits/stdc++.h>

using namespace std;

#define ll long long

int main() {
    int X;
    cin >> X;
 
    int ans = 0;
    while (X>0) {
        if (X % 2 == 1) {
            ans++;
        }
        X /= 2;
    }
 
    cout << ans;
 
}



