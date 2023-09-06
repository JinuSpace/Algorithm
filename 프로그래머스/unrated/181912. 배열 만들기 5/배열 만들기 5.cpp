#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<string> intStrs, int k, int s, int l) {
    vector<int> answer;
    
    for(int i =0;i<intStrs.size();i++){
        string temp = intStrs[i].substr(s, l);
        int a = stoi(temp);
        
        if(a>k){
            answer.push_back(a);
        }
        
    }
    
    return answer;
}