#include <string>
#include <vector>
#include <algorithm>
#include <map>
using namespace std;

int solution(vector<int> rank, vector<bool> attendance) {
    int answer = 0;
    vector<pair<int, int>> students;

    for (int i = 0; i < rank.size(); i++) {
        if (attendance[i]) {
            students.push_back({rank[i], i});
        }
    }

    sort(students.begin(), students.end());

    vector<int> selected;
    for(auto s : students){
        if(attendance[s.second]){
            selected.push_back(s.second);
            if(selected.size() == 3){
                break;
            }
        }
    }
    answer = 10000 * selected[0] + 100 * selected[1] + selected[2];
    
    return answer;
}