class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int sub = 0;
        
        for(int i =0; i<n/10;++i){
            ++sub;
        }
        
        answer = 12000*n + 2000*k-2000*sub; 
        
        
        
        return answer;
    }
}