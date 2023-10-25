#include <string>
#include <vector>
#include <sstream>
using namespace std;

int solution(string binomial) {
    int answer = 0;
    string a, op, b;
    
    istringstream iss(binomial);
    
    iss >> a >> op >> b;

    int num1 = stoi(a);
    int num2 = stoi(b);

 
    if (op == "+") {
        return num1 + num2;
    } else if (op == "-") {
        return num1 - num2;
    } else if (op == "*") {
        return num1 * num2;
    }
    return answer;
}