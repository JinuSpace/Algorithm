#include <iostream>
#include<string>
#include <bits/stdc++.h>
using namespace std;

stack<char> stk;

int solution(string s)
{
    int answer = -1;
   
    
    for(int i = 0;i<s.size();i++){
        if(!stk.empty() &&s[i] == stk.top()){
            stk.pop();
        }else{
            stk.push(s[i]);
        }
    }
    
    if(stk.empty()){
        answer = 1;
    }else{
        answer = 0;
    }
    
    return answer;
}