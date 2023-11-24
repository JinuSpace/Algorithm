#include <string>
#include <vector>

using namespace std;

string solution(string bin1, string bin2) {
    string answer = "";
    
    int carry = 0;     

    int maxLength = max(bin1.length(), bin2.length());
    bin1 = string(maxLength - bin1.length(), '0') + bin1;
    bin2 = string(maxLength - bin2.length(), '0') + bin2;

   
    for (int i = maxLength - 1; i >= 0; i--) {
        int digit1 = bin1[i] - '0';
        int digit2 = bin2[i] - '0';

        int sum = digit1 + digit2 + carry;
        answer = to_string(sum % 2) + answer;
        carry = sum / 2;
    }

    if (carry > 0) {
        answer = to_string(carry) + answer;
    }
    
    return answer;
}