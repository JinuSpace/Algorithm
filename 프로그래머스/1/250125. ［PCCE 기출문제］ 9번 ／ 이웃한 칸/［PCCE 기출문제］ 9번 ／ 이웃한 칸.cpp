#include <string>
#include <vector>

using namespace std;

int solution(vector<vector<string>> board, int h, int w) {
    int answer = 0;
    
    int x[] = {0, 1, 0, -1};
    int y[] = {1, 0, -1, 0};
    int range = board.size();
    
    for(int i = 0;i<4;i++){
        int h_check = h+y[i];
        int w_check = w+x[i];
        if(h_check >=0 && h_check < range && w_check >=0 && w_check < range){
            if(board[h][w] == board[h_check][w_check]){
                answer++;
            }
        }
    }
    
    
    return answer;
}