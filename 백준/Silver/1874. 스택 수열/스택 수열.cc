#include <string>
#include <vector>
#include <bits/stdc++.h>

using namespace std;

stack<int> stk;

int main() {
    string s;
    int i = 1;
    int n;
    cin >> n;

    while (n--){
        int num;
        cin >> num;

        if (i <= num){
            while (i <= num){
                stk.push(i);
                s += '+';
                i++;
            }
            stk.pop();
            s += '-';
        }else{
            if (stk.top() < num){
                cout << "NO\n";
                return 0;
            }
            else{
                stk.pop();
                s += '-';
            }
        }
    }
    for (int j = 0; j < s.length(); j++)
    {
        cout << s[j] << "\n";
    }
    return 0;

    return 0;
}



