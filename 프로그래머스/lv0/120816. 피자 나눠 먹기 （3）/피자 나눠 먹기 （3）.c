#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

#define SLICE_MIN 2
#define SLICE_MAX 10

int solution(int slice, int n) {
    int answer = 0;
    int sur = 0;
    
    answer=n/slice;
    if(n%slice != 0){
        answer ++;
    }
    
        
    
        
    
    return answer;
}