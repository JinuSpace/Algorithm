#include <string>
#include <vector>
#include <unordered_set>

using namespace std;

vector<int> solution(vector<int> arr, int k) {
    vector<int> answer;
    unordered_set<int> temp;
    
    for (int num : arr) {
        if (temp.find(num) == temp.end()) { 
            answer.push_back(num); 
            temp.insert(num); 
            if (answer.size() == k) 
                break;
        }
    }

    
    while (answer.size() < k) {
        answer.push_back(-1);
    }
    return answer;
}