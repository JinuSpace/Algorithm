#include <string>
#include <vector>
#include <iostream>
#include <cstring>

using namespace std;

string solution(string my_string, string letter) {
    string answer = "";
    
    
    string temp = "";
    
    
    
    for(int i = 0;i < my_string.size();i++){
        
        temp = my_string[i]; 
        int check = temp.compare(letter);
        
        if(check !=0 ){
            answer +=my_string[i];
        }
    }
    
    return answer;
}