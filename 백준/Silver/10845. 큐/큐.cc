#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int n = 0;
string command = "";

queue<int> que;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    
        
    cin >> n;
    
    while(n--){
        cin >> command;
        
        if(command == "push"){
            int value;
            cin >> value;
            
            que.push(value);
        }else if(command == "pop"){
            if(!que.empty()){
                cout << que.front() <<"\n";
                que.pop();
            }else{
                cout << -1 << "\n";
            }
            
        }else if(command == "size"){
            cout << que.size() << "\n";
        }
        else if(command == "empty"){
            cout << (que.empty() ? 1 : 0) << "\n";
        }
        else if(command == "front"){
            if(!que.empty()){
                cout << que.front() <<"\n";
            }else{
                cout << -1 << "\n";
            }
        }
        else if(command == "back"){
            if(!que.empty()){
                cout << que.back() <<"\n";
            }else{
                cout << -1 << "\n";
            }
        }
        
    }
        
    
    return 0;
}
