#include <string>
#include <vector>

using namespace std;

int solution(int n) {
    int answer = 0;
    
    for(int i =1;i<=n;i++){
            if(n%2 == 0){
                if(i%2 == 0){
                    answer = answer +i*i;
                }
                
            }else{
                if(i%2 ==1){
                    answer +=i;
                }
                
            }
        }
    
    
    
    return answer;
}