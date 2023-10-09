#include <bits/stdc++.h>
using namespace std;
int main() {
    
    string s1 = "";
    string s2 = "";
    string answer = "";
    cin >> s1 >> s2;
    
    
    for(int i =0;i<s1.size();i++){
        if(!isdigit(s1[i])){
            answer+=s1[i];
        }
    }
    
    if(answer.find(s2)== string::npos){
        cout << 0;
    }else
        cout << 1;
    
    return 0;
}
