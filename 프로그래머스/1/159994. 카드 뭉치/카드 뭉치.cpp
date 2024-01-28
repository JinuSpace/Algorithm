#include <string>
#include <vector>

using namespace std;

string solution(vector<string> cards1, vector<string> cards2, vector<string> goal) {
    string answer = "";
    
    for(string s : goal){
        if(s == cards1.front()){
            cards1.erase(cards1.begin(),cards1.begin()+1);
        }else if(s == cards2.front()){
            cards2.erase(cards2.begin(),cards2.begin()+1);
        }else{
            return "No";
        }
    }
    answer = "Yes";
    return answer;
}