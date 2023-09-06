#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> arr, vector<vector<int>> queries) {
    vector<int> answer = arr;
    
    for(int i =0;i<queries.size();i++){
        int a = queries[i][0];
        int b = queries[i][1];
        
        swap(answer[a], answer[b]);
    }
    
    
    return answer;
}