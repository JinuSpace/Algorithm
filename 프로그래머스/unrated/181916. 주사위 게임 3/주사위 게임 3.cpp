#include <vector>
#include <algorithm>

using namespace std;

int solution(int a, int b, int c, int d) {
    int answer = 0;
    vector<int> list = {a, b, c, d};
    
    sort(list.begin(), list.end());
    
    if (list[0] == list[1] && list[1] == list[2] && list[2] == list[3]) {
        answer = 1111* list[0];
    }else if(list[0] == list[2]){
        answer = (10 * list[0] +list[3])*(10 * list[0] +list[3]);
    }else if(list[1] == list[3]){
        answer = (10 * list[1] + list[0])*(10 * list[1] + list[0]);
    }else if(list[0] == list[1] && list[2] == list[3]){
        answer = (list[0] + list[2]) * abs(list[0] -list[2]);
    }else if(list[0] == list[1]){
        answer = list[2] * list[3];
    }else if(list[1]== list[2]){
        answer = list[0] * list[3];
    }else if(list[2] == list[3]){
        answer = list[0] * list[1];
    }else{
        answer = list[0];
    }
    
    return answer;
}