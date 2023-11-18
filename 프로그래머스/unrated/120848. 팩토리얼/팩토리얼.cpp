#include <string>
#include <vector>

using namespace std;

    

int solution(int n) {
    int answer = 0;
    int fac = 1;
    for(int i = 1;i<=10;i++){
        fac *= i;
        answer++;
        if(fac ==n){
            
            break;
        }else if(fac>n){
            answer -=1;
            break;
        }
    }
    
    return answer;
}