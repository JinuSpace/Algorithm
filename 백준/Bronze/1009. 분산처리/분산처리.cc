#include <iostream>
#include <string>
#include <stack>
#include <bits/stdc++.h>
#define MAX 51
using namespace std;

typedef long long ll;





void solve(int n){
    while(n--){
        int a, b = 0;
        int result = 1;
        
        cin >> a >> b;
        
        for(int i = 0;i<b;i++){
            result = (result * a) % 10;;
        }
        if(result == 0){
            cout << 10 << "\n";
        }else{
            cout << result << "\n";
        }
   
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
