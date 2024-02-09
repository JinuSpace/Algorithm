#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

string s = "";
int n = 0;
char command = NULL;
char add = NULL;

stack<char> answer;
stack<char> temp;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    
        
    cin >> s >> n;
    
    for(char c : s){
        answer.push(c);
    }
    
    while(n--){
        cin >> command;
        
        if(command == 'L'){
            if(!answer.empty()){
                temp.push(answer.top());
                answer.pop();
            }
        }else if(command == 'D'){
            if(!temp.empty()){
                answer.push(temp.top());
                temp.pop();
            }
        }else if(command == 'B'){
            if(!answer.empty()){
                answer.pop();
            }
        }else{
            cin >> add;
            answer.push(add);
        }
        
    }

    while (!answer.empty()) {
            temp.push(answer.top());
            answer.pop();
        }

    
        while (!temp.empty()) {
            cout << temp.top();
            temp.pop();
        }
    
    cout << "\n";
    
        
    
    return 0;
}
