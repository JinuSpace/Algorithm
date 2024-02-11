#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int n = 0;
int k = 0;




deque<int> dq;


void solve(){
    
    while(n--){
        string command = "";
        cin >> command;
        
        if(command == "push_front"){
            int input;
            cin >> input;
            dq.push_front(input);
        }else if(command == "push_back"){
            int input;
            cin >> input;
            dq.push_back(input);
        }else if(command == "pop_front"){
            if(!dq.empty()){
                cout << dq.front() << "\n";
                dq.pop_front();
            }else{
                cout << "-1\n";
            }
            
        }else if(command == "pop_back"){
            if(!dq.empty()){
                cout << dq.back() << "\n";
                dq.pop_back();
            }else{
                cout << "-1\n";
            }
        }else if(command == "size"){
            cout << dq.size() << "\n";
        }else if(command == "empty"){
            if(!dq.empty()){
                cout << "0\n";
            }else{
                cout << "1\n";
            }
        }else if(command == "front"){
            if(!dq.empty()){
               cout << dq.front() << "\n";
            }else{
                cout << "-1\n";
            }
        }else if(command == "back"){
            if(!dq.empty()){
                cout << dq.back() << "\n";
            }else{
                cout << "-1\n";
            }
        }
        
    }
    
    
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    
        
    cin >> n ;
    
    solve();
    
    
    return 0;
}
