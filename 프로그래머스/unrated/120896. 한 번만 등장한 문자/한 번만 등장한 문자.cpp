#include <string>
#include <vector>
#include <unordered_map>
#include <set>
using namespace std;

string solution(string s) {
    string answer = "";
    
    unordered_map<char, int> charCount;

  
    set<char> uniqueChars;

    
    for (char c : s) {
        charCount[c]++;
    }

    
    for (auto entry : charCount) {
        if (entry.second == 1) {
            uniqueChars.insert(entry.first);
        }
    }

    
    string result(uniqueChars.begin(), uniqueChars.end());
    answer = result;
    return answer;
}