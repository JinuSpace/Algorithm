#include <string>
#include <vector>

using namespace std;

int solution(string myString, string pat) {
    int answer = 0;
    string temp;
    
    for (char c : myString) {
        if (c == 'A') {
            temp += 'B';
        } else if (c == 'B') {
            temp += 'A';
        } else {
            temp += c;
        }
    }

    if (temp.find(pat) != string::npos) {
        return 1;
    }
    
    return answer;
}