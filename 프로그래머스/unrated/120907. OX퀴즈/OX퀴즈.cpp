#include <string>
#include <vector>
#include <bits/stdc++.h>
using namespace std;
bool isCorrect(string equation) {
    istringstream iss(equation);
    int x, y, z;
    char op;
    char equal;
    
    iss >> x >> op >> y >> equal >> z;
    
    if (op == '+') {
        return x + y == z;
    } else {
        return x - y == z;
    }    
}

vector<string> solution(vector<string> quiz) {
    vector<string> answer;
    
    for (auto equation : quiz) {
        if (isCorrect(equation)) {
            answer.push_back("O");
        } else {
            answer.push_back("X");
        }
    }
    return answer;
}