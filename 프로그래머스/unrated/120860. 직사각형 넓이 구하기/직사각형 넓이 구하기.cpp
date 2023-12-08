#include <string>
#include <vector>

using namespace std;

int solution(vector<vector<int>> dots) {
    int answer = 0;
    
    int standard_x = dots[0][0];
    int standard_y = dots[0][1];
    int x = 0;
    int y = 0;
    for(int i = 1;i<dots.size();i++){
        if(dots[i][0] == standard_x){
            y = abs(dots[i][1] - standard_y);
        }
        
        if(dots[i][1] == standard_y){
            x = abs(dots[i][0] - standard_x);
        }
    }
    
    answer = x*y;
    return answer;
}