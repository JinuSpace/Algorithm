#include <string>
#include <vector>
#include <algorithm>


using namespace std;

string solution(string my_string, vector<vector<int>> queries) {
    string answer = "";
    
    for(int i =0;i<queries.size();i++){
        reverse(my_string.begin()+queries[i][0],my_string.begin()+queries[i][1]+1);    
    }
    
    answer = my_string;
    
    
    
    return answer;
}