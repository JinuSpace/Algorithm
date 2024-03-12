#include <iostream>
#include <string>
#include <stack>
#include <bits/stdc++.h>
#define MAX 51
using namespace std;

typedef long long ll;

int n;
int sum = 0;
void solve(){
    
    while(n--){
        char c;
        
        cin >> c;
        sum += c- 'A'+1;
    }
    
    cout << sum << "\n";
    
}

int main() {
    
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    
    
    
    cin >> n;
    
    
    solve();
    return 0;
}
