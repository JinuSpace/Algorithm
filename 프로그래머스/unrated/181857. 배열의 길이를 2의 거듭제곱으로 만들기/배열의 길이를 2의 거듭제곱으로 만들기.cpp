#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> arr) {
    vector<int> answer;
    vector<int> size = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
    
    for(int i =0;i<size.size();i++){
        if(arr.size() == size[i]){
            answer = arr;
            break;
        }else if(arr.size() < size[i]){
            answer = arr;
            for(int j = 0;j < size[i] - arr.size();j++){
                answer.push_back(0);
            }
            break;
        }
    }
    
    
    return answer;
}