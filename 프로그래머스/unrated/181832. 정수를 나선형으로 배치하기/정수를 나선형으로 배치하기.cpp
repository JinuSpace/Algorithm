#include <string>
#include <vector>

using namespace std;

vector<vector<int>> solution(int n) {
    vector<vector<int>> answer(n, vector<int>(n, 0));
    
    vector<int> dx = {1,0,-1,0};
    vector<int> dy = {0,1,0,-1};
    int x=0;
    int y=0;
    int mode = 0;
    
    for (int i=1; i<=n*n; i++){
        answer[y][x] = i;
        int x_next = x+dx[mode];
        int y_next = y+dy[mode];
        bool a = (x_next<0 || x_next>=n);
        bool b = (y_next<0 || y_next>=n);
        bool c = (answer[y_next][x_next] != 0);
        
        if (a || b || c){
            mode = (mode + 1)%4;
        };
        
        x += dx[mode];
        y += dy[mode];
    }
    return answer;
}