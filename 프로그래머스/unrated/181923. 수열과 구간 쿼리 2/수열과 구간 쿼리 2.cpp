#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> arr, vector<vector<int>> queries) {
    vector<int> answer;
    
    for(int i =0;i<queries.size();i++){
        int s = queries[i][0];
        int e = queries[i][1];
        int k = queries[i][2];
   
        int minNum = -1;
            for (int j = s; j <= e; j++) {
            if (arr[j] > k) {
                if (minNum == -1 || arr[j] < minNum) {
                    minNum = arr[j];
                }
            }
        }
        
        answer.push_back(minNum);
    }
    
    
    return answer;
}