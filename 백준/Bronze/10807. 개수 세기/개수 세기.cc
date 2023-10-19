#include <bits/stdc++.h>
using namespace std;
int main() {
    vector<int> answer;
    int N;
    int find;
    cin >> N;
    
    int count = 0;
    
    for (int i = 0; i < N; i++) {
        int num;
        cin >> num;
        answer.push_back(num);
    }
    
    cin>>find;
        
    for(int i = 0;i<answer.size();i++){
        if(answer[i] == find){
            count++;
        }
    }
    
    cout << count << endl;
    
    
    
    return 0;
}
