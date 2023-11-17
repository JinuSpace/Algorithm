#include <string>
#include <vector>

using namespace std;

int solution(int balls, int share) {
    long answer = 1L;
    int cnt = 1;

    while(cnt <= share) {
        answer *= balls--;
        answer /= cnt++;
    }
    
    return answer;
}