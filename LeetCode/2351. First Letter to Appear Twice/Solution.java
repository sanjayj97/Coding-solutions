class Solution {
    public char repeatedCharacter(String s) {
        int[] count = new int[26];
        Arrays.fill(count, 0);
        for(char c: s.toCharArray()){
            count[c - 'a']++;
            if (count[c-'a'] > 1){
                return c;
            }
        }
        return ' ';
    }
}