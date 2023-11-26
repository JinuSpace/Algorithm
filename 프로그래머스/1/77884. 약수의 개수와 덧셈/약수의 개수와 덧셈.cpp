#include <string>
#include <vector>

using namespace std;

int countMeasure(int n){
    int count = 0;
    for(int i = 2;i<=n;i++){
        if(n%i == 0){
            count++;
        }
    }
    return count + 1;
}

int solution(int left, int right) {
    int answer = 0;
    int temp = 0;
    for(int i = left;i<=right;i++){
        temp = countMeasure(i);
        if(temp %2 == 0){
            answer += i;
        }else{
            answer -= i;
        }
    }
    return answer;
}