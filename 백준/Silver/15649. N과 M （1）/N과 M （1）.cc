#include <iostream>
#include <string>
#include <stack>
#include <bits/stdc++.h>
#define MAX 51
using namespace std;

typedef long long ll;

int N,M;
int arr[MAX];
bool visited[MAX];

void dfs(int k) { 
    if(k==M) { 
        for(auto i =0;i<M;i++)
            cout << arr[i] << " "; 
        cout << "\n";
    }else { 
        for(auto i=1; i<=N;i++) {
            if(!visited[i]) { 
                visited[i]=true; 
                arr[k]=i; 
                dfs(k+1); 
                visited[i]=false; 
            }
        }
    }
}

int main() {
    cin >> N >> M;
    dfs(0);
}

