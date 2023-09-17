#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int answer = 0;
    bool flag = true;
    
    while(flag){
       
         if(n<10){
            flag = false;
        }
        
    answer +=n%10;
       
        n /= 10;
        
       
    }
    
    return answer;
}