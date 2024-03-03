#include <iostream>
#include <string>
#include <stack>
#include <bits/stdc++.h>
#define MAX 51
using namespace std;

typedef long long ll;

int maxCandy = 0;
char candy[MAX][MAX];

int n;

void check() {
    for(int i = 0; i < n; i++) {
        int count = 1;
        for(int j = 0; j < n; j++) {
            if(candy[i][j] == candy[i][j + 1]) {
                count++;
            }
            else {
                if(maxCandy < count) maxCandy = count;
                count = 1;
            }
        }
    }
    
    for(int j = 0; j < n; j++) {
        int count = 1;
        for(int i = 0; i < n; i++) {
            if(candy[i][j] == candy[i + 1][j]) {
                count++;
            }
            else {
                if(maxCandy < count) maxCandy = count;
                count = 1;
            }
        }
    }
}



void solve(){
    for(int i = 0;i<n;i++){
        for(int j = 0;j<n;j++){
            cin >> candy[i][j];
           
            
        }
    }
    for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - 1; j++) {
                swap(candy[i][j], candy[i][j + 1]);
                check();
                swap(candy[i][j], candy[i][j + 1]);
            }
        }

        for(int j = 0; j < n; j++) {
            for(int i = 0; i < n - 1; i++) {
                swap(candy[i][j], candy[i + 1][j]);
                check();
                swap(candy[i][j], candy[i + 1][j]);
            }
        }

        cout << maxCandy << '\n';
}


int main() {
    
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    
    
    
    cin >> n;
    
    
    solve();
    return 0;
}
