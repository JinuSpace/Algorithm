#include <string>
#include <vector>
#include <deque>

using namespace std;
deque<int> temp;
string solution(vector<int> food) {
    string answer = "";
    
    temp.push_back(0);
    
    for(int i = food.size()-1;i>=1;i--){
        int count = food[i]/2;
        
        for(int j = 0;j<count;j++){
            temp.push_front(i);
            temp.push_back(i);
        }
    }
    
     for (const int& element : temp) {
        answer += to_string(element);
    }
    
    
    return answer;
}