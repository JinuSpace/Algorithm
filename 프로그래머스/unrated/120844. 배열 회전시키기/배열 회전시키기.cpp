#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> numbers, string direction) {
    vector<int> answer;
    
    int n = numbers.size();
    if (direction == "left") {
        int first_element = numbers[0];
        for (int i = 0; i < n - 1; i++) {
            numbers[i] = numbers[i + 1];
        }
        numbers[n - 1] = first_element;
    } else if (direction == "right") {
        int last_element = numbers[n - 1];
        for (int i = n - 1; i > 0; i--) {
            numbers[i] = numbers[i - 1];
        }
        numbers[0] = last_element;
    }
    
    answer = numbers;
    return answer;
}