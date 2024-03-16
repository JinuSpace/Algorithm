#include <iostream>
#include <string>
#include <stack>
#include <bits/stdc++.h>
#define MAX 51
using namespace std;

typedef long long ll;

string s;
static char dot = '.';
int c = 0;
string answer;
int main() {
    
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    
    cin >> s;
    
    s = regex_replace(s, regex("XXXX"), "AAAA");
       s = regex_replace(s, regex("XX"), "BB");
       
    if(s.find("X") != -1){
        cout<<"-1\n";
    }else{
        cout<< s << "\n";
    }
   }
