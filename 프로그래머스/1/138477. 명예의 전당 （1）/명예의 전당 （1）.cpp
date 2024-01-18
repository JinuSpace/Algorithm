#include <string>
#include <vector>
#include <bits/stdc++.h>
using namespace std;

vector<int> solution(int k, vector<int> score) {
    vector<int> answer;
    vector<int> award;

    for(auto a : score)
    {
        award.push_back(a);
        sort(award.begin(),award.end());
      
        if (award.size() > k){
            award.erase(award.begin());
        } 
        answer.push_back(award[0]);
    }
    
    return answer;
}