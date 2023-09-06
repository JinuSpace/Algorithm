#include <string>
#include <vector>

using namespace std;

int solution(vector<int> num_list) {
    int answer = 0;
    
    int sum = 0;
    int product =1;
    
    for(int i = 0; i< num_list.size();i++){
        sum+= num_list[i];
        
        product *= num_list[i];
        
    }
    
    if((sum*sum)>product){
       answer = 1;
    }
    
    return answer;
}