#include <string>
#include <vector>
#include <bits/stdc++.h>
using namespace std;

int solution(vector<int> sides) {
    int answer = 0;
    int minNumber = 0;
    
    sort(sides.begin(), sides.end());
    answer = sides[0] * 2 - 1;
    
    
    return answer;
}