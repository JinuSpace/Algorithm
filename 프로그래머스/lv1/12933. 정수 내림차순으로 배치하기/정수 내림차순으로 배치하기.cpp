#include <string>
#include <vector>
#include <algorithm>

using namespace std;

long long solution(long long n) {
    long long answer = 0;
    vector<int> numbers;
    
    while(n>0){
        int temp=n%10;
        numbers.push_back(temp);
        n/=10;
    }
    sort(numbers.begin(),numbers.end());
    
    for(int i = numbers.size() - 1; i >= 0; i--){
        answer*=10;
        answer+=numbers[i];        
    }
    
    return answer;
}