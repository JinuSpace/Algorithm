#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> num_list) {
    vector<int> answer;
    
    for(int i =0;i<num_list.size();i++){
        answer.push_back(num_list[i]);
    }
    
    int last_index = num_list.size() - 1;
    
    if(num_list[last_index] >num_list[last_index-1]){
        answer.push_back(num_list[last_index] - num_list[last_index-1]);
    }else{
        answer.push_back(num_list[last_index]*2);
    }
    
    
    return answer;
}