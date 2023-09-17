class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        
        int number = n/2;
        
        if(n%2 == 1 ){
            number = n/2+1;
        }
        
        answer= new int[number];
        
        for(int i = 0; i <number;i++){
            
            answer[i]= 2*i+1;
        }
        
        return answer;
    }
}