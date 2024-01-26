#include <vector>
#include <unordered_map> 
using namespace std;

int solution(vector<int> nums) {
    int answer = 0;
    
    int n = nums.size() / 2;
    unordered_map<int, int> mp; 
    
    for (int a : nums) {
        mp[a]++;
    }
    
    if (mp.size() > n) {
        answer = n;
    } else {
        answer = mp.size(); 
    }
    
    return answer;
}