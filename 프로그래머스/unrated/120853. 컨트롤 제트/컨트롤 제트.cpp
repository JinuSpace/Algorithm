#include <string>
#include <vector>

using namespace std;

vector<string> split(string input, string delimiter) {
    vector<string> ret;
    long long pos = 0;
    string token = "";
    
    while ((pos = input.find(delimiter)) != string::npos) {
        token = input.substr(0, pos);
        ret.push_back(token);
        input.erase(0, pos + delimiter.length());
    } 
    
        ret.push_back(input); 
    return ret;
}
int solution(string s) {
    int answer = 0;
    vector<string> arr;
    string delimeter = " ";
    int n = 0;
    
    arr =split(s, delimeter);
    
    for(string temp: arr){
        if(temp != "Z"){
            n = stoi(temp);
            answer+= n;
        }else{
            answer-=n;
        }
    }
    
    return answer;
}