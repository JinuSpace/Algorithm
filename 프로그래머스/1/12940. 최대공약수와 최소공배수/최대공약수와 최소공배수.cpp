#include <string>
#include <vector>
#include <bits/stdc++.h>
using namespace std;

int gcd(int a, int b){
    int maxNumber = 0;
    maxNumber = max(a,b);
    for(int i = maxNumber;i>=1;i--){
        if(a % i == 0 && b % i == 0){
            return i;
        }
    }
    
    return 0;
}

int lcm(int a, int b){
    return a * b / gcd(a, b);
}

vector<int> solution(int n, int m) {
    vector<int> answer;
    
    answer.push_back(gcd(n,m));
    answer.push_back(lcm(n,m));
    return answer;
}