#include <string>
#include <vector>

using namespace std;

int solution(int a, int b, int c) {
    int answer = 0;
    
    int aa = a*a;
    int bb = b*b;
    int cc = c*c;
    
    int aaa = aa*a;
    int bbb = bb*b;
    int ccc = cc*c;
    
    
    if(a != b && b != c && a != c){
        answer = a+ b+c;
    }else if(a == b && b == c){
        answer = (a+b+c) * (aa+bb+cc) * (aaa+bbb+ccc);
    }else{
        answer = (a+b+c) * (aa+bb+cc);
    }
    
    return answer;
}