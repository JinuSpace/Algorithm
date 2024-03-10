#include <iostream>
#include <string>
#include <stack>
#include <bits/stdc++.h>
#define MAX 51
using namespace std;

typedef long long ll;


vector<string> numbers;
string s;
int cnt[26] = {0,};


void solve(){
    
    for (char i = 'a'; i <= 'z'; i++) {
            cout << (int)s.find(i) << ' ';
        }
    
}

int main() {
    
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    
    
    
    cin >> s;
    
    
    solve();
    return 0;
}
