#include <string>
#include <vector>

using namespace std;

int solution(int a, int b) {
    int answer = 0;
    
    string A = to_string(a);
    string B = to_string(b);
    
    string AB = A+B;
    
    int ab = stoi(AB);
    
    if(ab>= 2*a*b){
        answer = ab;
    }else{
        answer = 2*a*b;
    }
    
    return answer;
}