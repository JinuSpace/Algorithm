#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(string my_string, string target) {
    int answer = 0;
    
    for(int i =0; i<my_string.size();i++){
        if(my_string.substr(i, target.size()) == target){
            answer = 1;
            break;
        }
    }
    
    return answer;
}