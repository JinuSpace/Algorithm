class Solution {
    public boolean isPalindrome(int x) {
      if (x < 0) {
            return false;
        }

        String str = Integer.toString(x);
        
        int length = str.length();
        
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        
        return true;
    }
}