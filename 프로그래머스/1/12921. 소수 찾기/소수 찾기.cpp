#include <string>
#include <vector>
#include <bits/stdc++.h>
using namespace std;

int solution(int n) {
    int answer = 0;
    vector<bool> check(n+1, 0);
  
    for(int i=2; i<=n; i++){
        if(check[i]){
            continue;  
        }

        
        for(int j=i+i; j<=n; j+=i){
            check[j]=1;
        }
    }
    
    for(int i=2; i<=n; i++){
        if(!check[i]){
            answer++;
        }
    }
    return answer;
}