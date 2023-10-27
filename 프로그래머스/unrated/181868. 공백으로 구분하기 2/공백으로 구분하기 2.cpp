#include <string>
#include <vector>
#include <sstream>
using namespace std;

vector<string> solution(string my_string) {
    vector<string> answer;
    string temp;
    
    stringstream stream;
	stream.str(my_string);
	while(stream >> temp){
		answer.push_back(temp);
	}
    
    return answer;
}