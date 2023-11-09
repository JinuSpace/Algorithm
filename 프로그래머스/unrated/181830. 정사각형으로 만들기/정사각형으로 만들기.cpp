#include <string>
#include <vector>

using namespace std;

vector<vector<int>> solution(vector<vector<int>> arr) {
    vector<vector<int>> answer;
    if(arr.size()>arr[0].size()){
        int count = arr.size()-arr[0].size();
        for(int i = 0 ;i<arr.size();i++){
            for(int j =0;j<count;j++){
                arr[i].push_back(0);
            } 
        }
    }else if (arr.size()<arr[0].size()){
        for (int i = arr.size(); i < arr[0].size(); i++) {
            vector<int> zerosRow(arr[0].size(), 0);
            arr.push_back(zerosRow);
        }
    }
    answer = arr;
    return answer;
}