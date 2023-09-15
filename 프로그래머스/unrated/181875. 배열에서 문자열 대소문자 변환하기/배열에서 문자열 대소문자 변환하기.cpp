#include <string>
#include <vector>
#include <cctype>
using namespace std;

vector<string> solution(vector<string> strArr) {
    vector<string> answer;
    for(int i = 0; i < strArr.size(); i++) {
        if(i % 2 == 1) {
            for (char &c : strArr[i]) { 
                c = toupper(c); 
            }
        } else {
            for (char &c : strArr[i]) {
                c = tolower(c);
            }
        }
        answer.push_back(strArr[i]);
    }
    
    return answer;
}