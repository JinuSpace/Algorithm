#include <string>
#include <vector>

using namespace std;

int solution(vector<int> arr1, vector<int> arr2) {
    int answer = 0;
    int sum1 = 0;
    int sum2 =0;
    if(arr1.size()!= arr2.size()){
        if(arr1.size()>arr2.size()){
            answer= 1;
        }else{
           answer = -1; 
        }
    }else{
        for(int temp:arr1){
            sum1+= temp;
        }
        for(int temp:arr2){
            sum2 += temp;
        }
        if(sum1>sum2){
            answer = 1;
        }else if(sum1<sum2){
            answer = -1;
        }
    }
    
    return answer;
}