#include <string>
#include <vector>
#include <bits/stdc++.h>
using namespace std;

int solution(string my_string) {
    int answer = 0;
    int number = 0;
    string s_number = "";
    string what = "+";
    
    for(int i = 0; i < my_string.size(); i++){
        if(isdigit(my_string[i])){
            s_number += my_string[i];
        } else if(my_string[i] == '+'){
            number = stoi(s_number);
            if(what == "+"){
                answer += number;
            } else {
                answer -= number;
            }
            what = "+";
            s_number = "";
        } else if(my_string[i] == '-'){
            number = stoi(s_number);
            if(what == "+"){
                answer += number;
            } else {
                answer -= number;
            }
            what = "-"; 
            s_number = "";
        }
    }
    
    number = stoi(s_number);
    if(what == "+") {
        answer += number;   
    } else if(what == "-"){
        answer -= number; 
    }  
    
    return answer;
}