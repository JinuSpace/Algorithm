#include <string>
#include <vector>
#include <bits/stdc++.h>
using namespace std;

string solution(string s) {
    string answer = "";
    
    stringstream ss(s);
    int number;
    int min;
    int max;
    vector<int> numbers;
    
    while(ss >> number){
        numbers.push_back(number);
    }
    
    min =  *min_element(numbers.begin(), numbers.end());
    max =  *max_element(numbers.begin(), numbers.end());
    
    answer = to_string(min) + " " + to_string(max);
    
    return answer;
}