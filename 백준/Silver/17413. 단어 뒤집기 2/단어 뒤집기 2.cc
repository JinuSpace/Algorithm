#include <bits/stdc++.h>
using namespace std;
typedef long long ll;



void stackprint(stack<char>& stk)
{
    while(!stk.empty()){
                cout<<stk.top();
                stk.pop();
            }
}


void solve(string s){
    
    stack<char> stk;
        
        
        for(int i=0;i<s.size();i++)
        {
            if(s[i]=='<')
            {
                stackprint(stk);
                while(1)
                {
                   cout<<s[i];
                    if(s[i]=='>')
                        break;
                    i++;
                }
            }
            else if(s[i]==' ')
            {
               stackprint(stk);
                cout<<" ";
            }
            else
            {
                stk.push(s[i]);
            }
        }
        stackprint(stk);
    
    
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    string s = "";
        
    getline(cin,s);
    
    solve(s);
    
    
    return 0;
}
