#include <string>
#include <vector>
#include <bits/stdc++.h>
using namespace std;

string solution(string s) {
    string answer = "";
    int idx = 0;

    
    for(int i =0;i<s.size();i++){
        if(s[i] == ' '){
            idx = 0;
            answer += s[i];
        }else if(idx == 0 && !isdigit(s[i])){
            idx++;
            answer += toupper(s[i]);
        }else {
            answer += tolower(s[i]);
            idx++;
        }
    }
    
    
    return answer;
}