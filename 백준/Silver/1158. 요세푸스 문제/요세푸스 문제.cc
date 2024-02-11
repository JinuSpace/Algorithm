#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int n = 0;
int k = 0;


queue<int> que;


void solve(){
    cout << "<";

    while(que.size() >1){
        for (int i = 1; i < k; i++) {
            int tmp = que.front();
            que.pop();
            que.push(tmp);
        }
        cout << que.front() << ", ";
        que.pop();
    }
    cout << que.front() << ">\n";
    
    
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    
        
    cin >> n >> k;
    
    for(int i = 1;i<= n;i++){
        que.push(i);
    }
    
    solve();
    
    
    return 0;
}
