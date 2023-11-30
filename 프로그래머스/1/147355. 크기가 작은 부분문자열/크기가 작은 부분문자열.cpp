#include <string>
#include <vector>
#include <bits/stdc++.h>
using namespace std;

int solution(string t, string p) {
    int answer = 0;
    long long standard = 0;
    standard = stoll(p);
    
    
    for(int i = 0;i<t.size()-p.size()+1;i++){
        long long temp = stoll(t.substr(i,p.size()));
        if(temp <= standard){
            answer++;
        }
    }
    
    return answer;
}