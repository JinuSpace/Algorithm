#include <string>
#include <vector>
#include <cmath>

using namespace std;

long long solution(long long n) {
    long long answer = 0;
    long long sqrt_n = sqrt(n);
    
    if (sqrt_n * sqrt_n == n) {
        answer = (sqrt_n + 1) * (sqrt_n + 1);
    } else {
        answer = -1;
    }
        
    
    return answer;
}