#include<string>
#include <iostream>
#include <bits/stdc++.h>
using namespace std;

bool solution(string s)
{
    bool answer = true;
    
    stack<char> stk;
    
    for(char c : s){
        if(c == '('){
            stk.push('(');
            }
        else
        {
            if(!stk.empty() && stk.top() == '('){
               stk.pop();
            }
            else{
                stk.push(')');  
            }
        }
    }
    
    if(stk.empty())
        return true;
    else
        return false;

    // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    cout << "Hello Cpp" << endl;

    return answer;
}