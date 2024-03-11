#include <iostream>
#include <string>
#include <stack>
#include <bits/stdc++.h>
#define MAX 51
using namespace std;

typedef long long ll;

int N;
int sum  = 0;

void solve(){
    int count = N;
    while(N--){
        int read;
        cin >> read;
        sum += read;

    }
    sum = sum -count+1;
    cout << sum << "\n";
}

int main() {
    
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    
    
    
    cin >> N;
    
    
    solve();
    return 0;
}
