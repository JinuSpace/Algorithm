#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> arr, vector<int> query) {
    vector<int> answer;
    vector<int> slice;
    
    for(int i = 0;i<query.size();i++){
        if(i % 2 == 0)
            answer.assign(arr.begin(), arr.begin() + query[i] + 1);
        else
            answer.assign(arr.begin() + query[i], arr.end());
        arr = answer;
    }
    
    
    return answer;
}