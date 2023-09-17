#include <string>
#include <vector>

using namespace std;

int solution(int n) {
    int answer = 0;
    int temp = n;
    
    for(int i =1;i<=n;i++){
        if(temp % i==0){
        answer ++;
        }
    }
    
    
    return answer;
}