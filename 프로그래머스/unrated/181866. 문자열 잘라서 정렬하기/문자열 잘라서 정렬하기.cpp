#include <string>
#include <vector>
#include <sstream>
#include <algorithm>

using namespace std;

vector<string> solution(string myString) {
    vector<string> answer;
    string temp;
    for(int i=0;i<myString.size();i++){
		if(myString[i] == 'x'){ 
		myString[i] = ' ';
            }
	}
    
    stringstream stream;
	stream.str(myString);
	while(stream >> temp){
		answer.push_back(temp);
	}
    
    sort(answer.begin(), answer.end());
    
    return answer;
}