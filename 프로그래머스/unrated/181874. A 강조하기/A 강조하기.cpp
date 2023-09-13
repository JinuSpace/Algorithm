#include <string>
#include <vector>
#include <cctype>

using namespace std;

string solution(string myString) {
    string answer = "";
    
    for(char c : myString){
        if(c == 'a'|| c == 'A'){
        answer+= toupper(c);
        }else{
            answer += tolower(c);
        }
    }
    return answer;
}