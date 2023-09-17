#include <vector>
#include <unordered_map>
using namespace std;

int solution(vector<int> arr) {
    unordered_map<int, int> count_map;
    for (int num : arr) {
        if (count_map.count(num)) {
            count_map[num]++;
        }
        else {
            count_map[num] = 1;
        }
    }
    
    int max_count = 0;
    vector<int> mode_list;
    for (const auto& pair : count_map) {
        int count = pair.second;
        if (count > max_count) {
            max_count = count;
            mode_list = { pair.first };
        }
        else if (count == max_count) {
            mode_list.push_back(pair.first);
        }
    }
    
    if (mode_list.size() > 1) {
        return -1;
    }
    else {
        return mode_list[0];
    }
}



