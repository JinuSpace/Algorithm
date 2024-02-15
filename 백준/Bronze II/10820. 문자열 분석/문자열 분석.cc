#include <bits/stdc++.h>
using namespace std;
typedef long long ll;




void solve(string s){
    int small = 0;
    int big = 0;
    int number = 0;
    int blank = 0;
    
    for(int i = 0;i<s.size();i++){
        if(isdigit(s[i])){
            number++;
        }else if(s[i] == ' '){
            blank++;
        }else{
            if(s[i] >= 'a' && s[i] <= 'z'){
                small++;
            }else{
                big++;
            }
        }
    }
    
    
    cout << small << " " << big << " " << number << " " << blank << "\n";
    
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    string s = "";
    
    while(getline(cin, s)){
        solve(s);
    }
    
    
    
    return 0;
}
