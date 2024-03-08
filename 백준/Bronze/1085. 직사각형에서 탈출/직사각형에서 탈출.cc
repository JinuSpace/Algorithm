#include <iostream>
#include <string>
#include <stack>
#include <bits/stdc++.h>
#define MAX 51
using namespace std;

typedef long long ll;


int x, y, w, h;

void solve(){
    
    int answer1 = min(abs(h-y),abs(w-x));
    int answer2 =min(abs(y), abs(x));
    int answer = min(answer1, answer2);
    cout << answer;
    
}


int main() {
    
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    
    
    
    cin >> x >> y >> w >> h;
    
    
    solve();
    return 0;
}
