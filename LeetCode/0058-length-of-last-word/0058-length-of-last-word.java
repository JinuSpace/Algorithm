class Solution {
    public static int lengthOfLastWord(String s) {
        String trimmed = s.trim();
        int idx = trimmed.lastIndexOf(" ");
        return trimmed.substring(idx + 1).length();
    }
}