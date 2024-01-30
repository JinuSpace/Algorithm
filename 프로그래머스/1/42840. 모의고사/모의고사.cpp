#include <string>
#include <vector>
#include <algorithm>
using namespace std;

vector<int> solution(vector<int> answers) {
    vector<int> answer;
    int maxScore = 0;
    
    int arr1 [] = {1, 2, 3, 4, 5};
    int arr2 [] = {2, 1, 2, 3, 2, 4, 2, 5};
    int arr3 [] = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    
    int cnt [3] = {0,};
    
    for(int i =0;i<answers.size();i++){
        if(arr1[i%5] == answers[i]) cnt[0]++;
        if(arr2[i%8] == answers[i]) cnt[1]++;
        if(arr3[i%10] == answers[i]) cnt[2]++;       
    }
   maxScore = max({cnt[0],cnt[1],cnt[2]});
    

    for(int i = 0;i<3;i++){
        if(cnt[i] == maxScore){
            answer.push_back(i+1);
        }
    }
    
    return answer;
}