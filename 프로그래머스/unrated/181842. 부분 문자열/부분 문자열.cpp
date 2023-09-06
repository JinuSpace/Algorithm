#include <string>
#include <vector>

using namespace std;

int solution(string str1, string str2) {
    int answer = 0;
    
    for(int i =0;i<=str2.length()-str1.length();i++){
        if(str2.substr(i, str1.length()) == str1){
            answer =1;
        }
    }
    return answer;
}