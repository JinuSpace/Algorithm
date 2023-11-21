#include <string>
#include <vector>

using namespace std;

string solution(string my_string) {
    string answer = "";
    vector<char> temp;
    for(int i = 0;i<my_string.size();i++){
        bool isExist = false;
        for(char c : answer){
            if (c == my_string[i]){
                isExist = true;
            }
        }
        if(!isExist){
            answer+= my_string[i];
        }
    }
    return answer;
}