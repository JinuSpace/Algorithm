#include <string>
#include <vector>

using namespace std;

string solution(string myString, string pat) {
    string answer = "";
    for (int i = 0; i < myString.length(); i++) {
        if (myString.substr(i).rfind(pat, 0) == 0) {
            answer = myString.substr(0, i + pat.length());
        }
    }
    
    return answer;
}