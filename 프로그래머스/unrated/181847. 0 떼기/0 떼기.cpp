#include <string>
#include <vector>

using namespace std;

string solution(string n_str) {
    string answer = "";
    bool left = true;
    for(int i =0;i<n_str.size();i++){
        if(n_str[i] == '0' && left){
            continue;
        }else{
            answer+=n_str[i];
            left =false;
        }
        
    }
    return answer;
}