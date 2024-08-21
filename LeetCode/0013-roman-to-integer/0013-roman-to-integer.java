class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentVal = valueOfRomanChar(s.charAt(i));
            
            // 다음 문자가 있고, 현재 문자가 다음 문자보다 작은 경우
            if (i + 1 < s.length() && currentVal < valueOfRomanChar(s.charAt(i + 1))) {
                sum -= currentVal;
            } else {
                sum += currentVal;
            }
        }
        return sum;
    }

    private int valueOfRomanChar(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}