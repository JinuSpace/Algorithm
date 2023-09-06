#include <string>
#include <vector>

using namespace std;

int solution(string my_string, string is_suffix) {
    int answer = 0;
    
    vector<string> temp;
    
    for(int i =0;i<my_string.size();i++){
        if(is_suffix== my_string.substr(i,my_string.size()+1)){
            answer =1;
        }
        
    }
    
    return answer;
}