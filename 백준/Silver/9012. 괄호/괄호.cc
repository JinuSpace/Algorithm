#include <string>
#include <vector>
#include <bits/stdc++.h>

using namespace std;

int main() {
    int input;
    cin >> input;
    cin.ignore();

    for(int i = 0; i < input; i++) {
        string s;
        getline(cin, s);
        bool isOk = true;
        stack<char> stk;

        for(int j = 0; j < s.size(); j++) {
            if(s[j] == '(') {
                stk.push(s[j]);
            } else {
                if(!stk.empty() && stk.top() == '(') {
                    stk.pop();
                } else {
                    isOk = false;
                    break;
                }
            }
        }

        if(!stk.empty() || !isOk) {
            cout << "NO" << endl;
        } else {
            cout << "YES" << endl;
        }
    }

    return 0;
}



