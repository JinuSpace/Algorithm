#include <string>
#include <vector>

using namespace std;

vector<vector<int>> solution(vector<int> num_list, int n) {
    vector<vector<int>> answer;
    int idx = 0;
    for(int i = 1;i<=num_list.size()/n;i++){
            vector<int> temp;
        for(int j = 1;j<=n;j++){
            temp.push_back(num_list[idx]);
            idx++;
        }
        answer.push_back(temp);
    }
    return answer;
}