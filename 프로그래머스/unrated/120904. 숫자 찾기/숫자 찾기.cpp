#include <string>
#include <vector>
#include <algorithm>
using namespace std;

int solution(int num, int k) {
    int answer = 0;
    int count = 0;
    int temp = 0;   
    while(num > 0){
        count ++;
        int il = num%10;
        if(il == k){
            temp = count;
        }
        num /= 10;
    }
    
    if(temp == 0){
        return -1;
    }else{
        answer = count- temp+1;
    }
    
    return answer;
}