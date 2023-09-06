#include <string>
#include <vector>

using namespace std;

int solution(int a, int b) {
    int answer = 0;
    
    string A = to_string(a);
    string B = to_string(b);
    
    string AB = A+B;
    string BA = B+A;
        
    
    if(AB> BA){
        answer = stoi(AB);
    }else{
        answer = stoi(BA);
    }
    
    return answer;
}