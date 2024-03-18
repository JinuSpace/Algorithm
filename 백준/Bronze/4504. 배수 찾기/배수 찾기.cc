#include <iostream>
#include <string>
#include <stack>
#include <bits/stdc++.h>

using namespace std;

typedef long long ll;


int n;
int main() {
   
    cin >> n;
    
    while(true){
        int read;
        cin >> read;
        
        if(read == 0){
            break;
        }
        
        if(read % n != 0){
            cout << read << " is NOT a multiple of " << n << ".\n";
        }else{
            cout << read << " is a multiple of " << n << ".\n";
        }
    }
}

