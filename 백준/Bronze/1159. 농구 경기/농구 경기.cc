#include <string>
#include <vector>
#include <bits/stdc++.h>
using namespace std;

int num, cnt[26];
string s, ret;
int main() {
	
	cin>> num ;
	
	for(int i = 0;i< num; i++){
		cin >> s;
		cnt[s[0] - 'a']++;
	}
	
	for(int i = 0;i< 26;i++){
		if(cnt[i] >= 5){
		ret+= (i + 'a');
		}
	}
	    
    if(ret.size()){
		cout << ret << "\n";
	}else{
		cout << "PREDAJA" << "\n";
	}
    return 0;
}