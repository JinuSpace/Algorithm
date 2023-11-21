#include <string>
#include <vector>

using namespace std;
string numb[10]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

long long solution(string numbers) {
    long long answer = 0;
    string temp ="";
    while(numbers.size()!=0){
        for(int i=0;i<10;i++){
            if(numbers.find(numb[i])==0){
                temp+= to_string(i);
                numbers.erase(0,numb[i].size());
                break;
            }
        }
    }
    answer = stol(temp);
    return answer;
}