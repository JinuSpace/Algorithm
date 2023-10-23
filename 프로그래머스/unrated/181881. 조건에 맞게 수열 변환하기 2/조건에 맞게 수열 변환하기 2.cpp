#include <string>
#include <vector>

using namespace std;

int solution(vector<int> arr) {
    int answer = 0;
    int count = 0;
    vector<int> temp;
    while(1){
        temp =arr;
        for(int i = 0;i<temp.size();i++){
            if(temp[i] >=50 && temp[i] %2 ==0){
                temp[i]/=2;
            }else if (temp[i] <50 && temp[i] %2 ==1){
                temp[i]= temp[i]*2+1;
            }
        }
        
        
        if(temp == arr){
            return count;
        }
        count++;
        arr = temp;
        
    }
    return answer;
}