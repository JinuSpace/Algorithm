#include <string>
#include <vector>

using namespace std;

string solution(string s) {
    string answer = "";
    int center = 0;
    center =s.size()/2;
    if(s.size() % 2 == 0){
        answer+= s[center-1];
        answer+= s[center];
    }else{
        answer+= s[center];
    }
    return answer;
}