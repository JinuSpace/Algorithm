#include <bits/stdc++.h>
using namespace std;

int t, n;
string a,b;

typedef long long ll;
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    cin >> t;
    while(t--){
        map<string, int> mp;
        cin >> n;
        for(int i =0;i<n;i++){
            cin>>a >>b ;
            mp[b]++;
        }
        ll ret = 1;
        for(auto c: mp){
            ret *=((ll) c.second+1);
        }
        ret --;
        
        cout << ret << "\n";
    }
    
    
    
    
    
    return 0;
}
