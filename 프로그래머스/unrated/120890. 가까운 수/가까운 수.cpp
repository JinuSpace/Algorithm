#include <string>
#include <vector>
#include <algorithm>
using namespace std;

int solution(vector<int> array, int n) {
    int answer = 100;
    sort(array.begin(), array.end());
    
    for(int temp : array){
        if(abs(n - temp) < abs(n - answer)){
            answer = temp;
        }
    }
    return answer;
}