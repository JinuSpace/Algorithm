#include <string>
#include <vector>
#include <algorithm>
using namespace std;

vector<int> solution(vector<int> arr) {
    vector<int> answer;
    int minIdx = min_element(arr.begin(), arr.end()) - arr.begin();

    for (int i = 0; i < arr.size(); i++){
        if (i == minIdx) 
            continue;
        answer.push_back(arr[i]);
    }
    
    if(answer.size() == 0){
        answer.push_back(-1);
    }
    
    return answer;
}