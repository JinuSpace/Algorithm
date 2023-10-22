#include <string>
#include <vector>

using namespace std;

string toLowerCase(string str) {
    for (char &c : str) {
        c = tolower(c);
    }
    return str;
}

int solution(string myString, string pat) {
    int answer = 0;
    
    myString = toLowerCase(myString);
    pat = toLowerCase(pat);

    if (myString.find(pat) != string::npos) {
        return 1;
    } else {
        return 0;
    }
    
    return answer;
}