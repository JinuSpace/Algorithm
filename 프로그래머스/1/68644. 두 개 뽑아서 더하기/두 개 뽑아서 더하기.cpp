#include <string>
#include <vector>
#include <set>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> numbers) {
    
    set<int> answer_set;

    int size = numbers.size();

    for (int i = 0; i < size - 1; ++i) {
        for (int j = i + 1; j < size; ++j) {
            answer_set.insert(numbers[i] + numbers[j]);
        }
    }

    vector<int> answer(answer_set.begin(), answer_set.end());
    
    return answer;
}