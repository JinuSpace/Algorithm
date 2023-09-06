#include <string>
#include <vector>

using namespace std;

bool cal1(bool a, bool b){
    if(a == false && b == false){
        return false;
    }else{
        return true;
    }
}

bool cal2(bool a, bool b){
    if(a == true && b == true){
        return true;
    }else{
        return false;
    }
}

bool solution(bool x1, bool x2, bool x3, bool x4) {
    bool answer = true;
    
    bool a = true;
    bool b = true;
    
    a = cal1(x1,x2);
    b = cal1(x3,x4);
    
    answer = cal2(a,b);
    
    return answer;
}