class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int b=denom1*denom2;
        
        int a=numer1*denom2 + numer2*denom1;
        
        int c = 0;
        
        for(int i =1;i<= a; i++){
            if(a%i ==0 && b%i ==0){
                c = i;
            }
        }
        answer[0]= a/c;
        answer[1] = b/c;
        
        
        
        
        
        return answer;
    }
}