#include <string>
#include <vector>

using namespace std;
int a ,b;
string delZero(string s){
    string ret = "";
    for(char c : s){
        if(c != '0'){
            ret+=c;
        }else{
            b++;
        }
    }
    
    
    return ret;
}

string sizeToBinary(string s){
    string ret = "";
    int n = s.size();
    
    while(n > 0){
        if(n %2 == 1){
            ret += "1";
        }else{
            ret += "0";
        }
        n /= 2;
    }
    a++;
    
    return ret;
}

vector<int> solution(string s) {
    vector<int> answer;
    
    while(s != "1"){
        s = delZero(s);
        s = sizeToBinary(s);
    }
    
    answer.push_back(a);
    answer.push_back(b);

    
    return answer;
}