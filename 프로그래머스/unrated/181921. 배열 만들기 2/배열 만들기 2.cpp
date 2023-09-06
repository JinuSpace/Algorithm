#include <string>
#include <vector>

using namespace std;
bool contain05(int num){
        while(num > 0){
            int temp = num%10;
            if(temp != 0 &&temp != 5){
                return false;
            }
         num /= 10;   
        }
        return true;
    }
vector<int> solution(int l, int r) {
    vector<int> answer;
    string convert = "";
    int ok = 0;

    
    
    
    for(int i = l;i<=r;i++){
        
            if(contain05(i)){
                answer.push_back(i);
            }
            
    }        
    
    
    if(answer.empty()){
        answer.push_back(-1);
    }
    
    return answer;
}