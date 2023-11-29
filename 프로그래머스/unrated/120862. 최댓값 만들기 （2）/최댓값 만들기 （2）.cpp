#include <string>
#include <vector>
#include <bits/stdc++.h>
using namespace std;

int solution(vector<int> numbers) {
    int answer = 0;
    int temp = 0;
    int end = numbers.size()-1;
    
    sort(numbers.begin(), numbers.end());
    
    answer = max({numbers[end]* numbers[end-1], numbers[0] * numbers[end], numbers[0] * numbers[1]});
    
    
    return answer;
}