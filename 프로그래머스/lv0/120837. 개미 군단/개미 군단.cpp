#include <string>
#include <vector>

using namespace std;

int solution(int hp) {
    int answer = 0;
    int a = 0;
    if(hp >0){
        if(hp>=5){
            answer += hp/5;
            hp -=answer*5; 
        }
        if(hp>=3){
        answer += hp/3;
        a= hp/3;
        hp -= a*3; 
    }
    }
    answer += hp;
    
    
    
    return answer;
}