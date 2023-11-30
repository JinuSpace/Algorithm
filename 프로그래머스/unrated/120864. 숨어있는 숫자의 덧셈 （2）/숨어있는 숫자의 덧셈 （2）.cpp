#include <string>
#include <vector>
#include <bits/stdc++.h>
using namespace std;

int solution(string my_string) {
    int answer = 0;
    string number = "";         
    for(int i = 0;i<my_string.size();i++){
        if(isdigit(my_string[i])){
            number+= my_string[i];
        
        }else{
            if(number.size() != 0){
                answer+= stoi(number);
            }
            
            number = "";
        }
    }
    if(number.size() != 0){
        answer+= stoi(number);
    }
    
    return answer;
}