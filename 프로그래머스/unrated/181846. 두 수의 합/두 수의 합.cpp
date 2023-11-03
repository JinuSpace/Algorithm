#include <string>
#include <vector>
#include <cstdint> 
#include <algorithm>
using namespace std;

string solution(string a, string b) {
    string answer = "";
    int add = 0;
    reverse(a.begin(), a.end());
    reverse(b.begin(), b.end());
    
    if (a.size() < b.size()){
        a.resize(b.size(), '0');
    } else {
        b.resize(a.size(), '0');
    }    
   
    
    int p = 0;
    for (int i=0; i<a.size(); i++){
        int cur = (a[i] - '0') + (b[i] - '0') + p;
        answer += to_string(cur%10);
        p = cur/10;
    }
    if (p != 0){
        answer += to_string(p);
    }
    
    reverse (answer.begin(), answer.end());
    
    

    return answer;
}