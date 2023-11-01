#include <string>
#include <vector>
#include <algorithm>
#include <unordered_map>
using namespace std;

int solution(vector<string> strArr) {
    int answer = 0;
    unordered_map<int, int> lengthCount;
    
    for (string str : strArr) {
        lengthCount[str.length()]++;
    }
    
    for (auto value : lengthCount) {
        answer = max(answer, value.second);
    }
    
    return answer;
}