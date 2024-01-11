#include <string>
#include <vector>
#include <bits/stdc++.h>
using namespace std;

vector<string> decimalTobinary(vector<int> x) {
    vector<string> b;
    for (int i = 0; i < x.size(); i++) {
        string s = "";
        while (x[i] > 0) {
            if (x[i] % 2 == 1) {
                s += '1';
            } else {
                s += '0';
            }
            x[i] /= 2;
        }
        
        

        b.push_back(s);
    }

    return b;
}

vector<string> solution(int n, vector<int> arr1, vector<int> arr2) {
    vector<string> answer;
    vector<string> b1;
    vector<string> b2;
    
    b1 = decimalTobinary(arr1);
    b2 = decimalTobinary(arr2);
    
    for(int i =0;i<n;i++){
        string temp = "";
        
        for(int j = n-1;j>= 0;j--){
            if (b1[i][j] == '1' || b2[i][j] == '1') {
                temp += '#';
            } else {
                temp += ' ';
            }
        }
        answer.push_back(temp);
    }
    
    return answer;
}