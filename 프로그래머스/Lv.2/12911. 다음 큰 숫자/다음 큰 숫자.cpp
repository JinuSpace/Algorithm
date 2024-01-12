#include <string>
#include <vector>

using namespace std;
int countOne(int n){
    int count = 0;
    while(n > 0){
        if(n%2 == 1){
            count++;
        }
        n/=2;
    }
    return count;
}

int solution(int n) {
    int answer = 0;
    int countN = 0;
    int countI = 0;
    countN = countOne(n);
    
    for(int i =n+1;i<1000000;i++){
        countI = countOne(i);
        if(countI == countN){
            answer = i;
            return answer;
        }
    }
    
    return answer;
}