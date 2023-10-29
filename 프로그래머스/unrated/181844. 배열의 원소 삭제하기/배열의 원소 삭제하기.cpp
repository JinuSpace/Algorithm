#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> arr, vector<int> delete_list) {
    vector<int> answer;
    
    for (int value : delete_list) {
        arr.erase(remove(arr.begin(), arr.end(), value), arr.end());
    }
    answer = arr;
    
    return answer;
}