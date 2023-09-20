#include <string>
#include <vector>

using namespace std;

int solution(int num) {
    int answer = 0;
    long long collatz = num;
    
    if(collatz == 1){
        return 0;
    }
    
    while(collatz != 1){
    
        if(collatz %2 == 0){
            collatz /= 2;
    
        }else{
            collatz= collatz*3+1;   
        }
        
        answer ++;
        
        if(answer >= 499){
            return -1;
        }
    }
    return answer;
}