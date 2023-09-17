#include <string>
#include <vector>

using namespace std;

int gcd(int a, int b){
if(a == 0) return b;
return gcd(b % a, a);
}
int lcm(int a, int b){
return (a * b) / gcd(a, b);
}

int solution(int n) {
    int answer = 0;
    int min =0;
    if(n%6 == 0){
        answer = n/6;
       
    }else{
        min = lcm(n,6);
        
        answer = min/6;
        
    }
    
    
    
    
    return answer;
}