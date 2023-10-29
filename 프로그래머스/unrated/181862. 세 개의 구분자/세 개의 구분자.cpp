#include <string>
#include <vector>
#include <sstream>
using namespace std;

vector<string> solution(string myStr) {
    vector<string> answer;
    string temp;
    string str;
    for(char c : myStr){
        if(c == 'a'|| c == 'b' || c == 'c'){
            temp+= ' ';
        }else{
            temp+= c;
        }
    }

    stringstream stream; 
    stream.str(temp);
    while(stream >> str){
		answer.push_back(str);
	}
    
    if(answer.size() == 0){
        answer.push_back("EMPTY");
    }
    
    
    return answer;
}