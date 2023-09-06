#include <string>
#include <vector>

using namespace std;

vector<int> solution(string my_string) {
    vector<int> answer(52,0);
    int alphabet = 0;
    for(int i =0;i<my_string.size();i++){
        if(my_string[i] >= 'A' && my_string[i] <= 'Z'){
            alphabet = my_string[i]-'A';
            answer[alphabet]++;
        }else{
            alphabet = my_string[i]-'a'+26;
            answer[alphabet]++;
        }
    }
    
    
    return answer;
}