#include <string>
#include <vector>

using namespace std;

int fac(int n){
    if(n == 1){
        return 1;
    }
    
    return n * fac(n-1);     
}


int solution(int balls, int share) {
    int answer = 0;
    
    answer = fac(balls) / (fac(balls - share) * fac(share));
    
    
    return answer;
}