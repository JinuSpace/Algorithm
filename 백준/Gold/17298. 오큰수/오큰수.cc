#include <iostream>
#include <string>
#include <stack>


using namespace std;

typedef long long ll;

void solve(int n) {
    int arr[1000001];
    int answer[1000001];
    stack<int> stk;
    
    for(int i =0;i<n;i++){
        int input = 0;
        cin >> input;
        arr[i] = input;
    }
    
    for(int i = n-1;i >= 0;i--){
        while(!stk.empty() && stk.top() <= arr[i]){
            stk.pop();
        }
        if(stk.empty()){
            answer[i] = -1;
        }else{
            answer[i] = stk.top();
        }
        
        stk.push(arr[i]);
    }
    
    
    for (int i = 0; i < n; i++) {
            cout << answer[i] << ' ';
        }
    
}

int main() {
    int n = 0;
    cin >> n;
    
    solve(n);
    return 0;
}
