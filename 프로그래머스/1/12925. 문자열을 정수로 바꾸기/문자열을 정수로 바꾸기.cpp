#include <string>
#include <vector>

using namespace std;

int solution(string s) {
    int answer = 0;

    bool isNegative = (s[0] == '-');

    for (size_t i = isNegative ? 1 : 0; i < s.length(); ++i) {
        if (isdigit(s[i])) {
            answer = answer * 10 + (s[i] - '0');
        } 
    }
    
    if(isNegative){
        answer= -answer;
    }
    return answer;
}