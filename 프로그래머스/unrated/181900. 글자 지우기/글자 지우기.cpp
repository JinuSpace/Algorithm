#include <string>
#include <vector>
#include <algorithm>

using namespace std;

string solution(string my_string, vector<int> indices) {
    string answer = "";
    
    sort(indices.begin(), indices.end(), greater<int>());

    for (int idx : indices) {
        my_string.erase(idx, 1);
    }
    answer = my_string;
    
    return answer;
}