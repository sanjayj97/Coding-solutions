class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<= 1){
            return s;
        }
        int start =0;
        int end = 0;
        for(int i = 0; i < s.length(); i++){
            int odd = expandFromCentre(s, i, i);
            int even = expandFromCentre(s, i, i+1);

            int max = (odd > even)? odd : even;
            if(max > end - start + 1){
                start = i - (max - 1)/2;
                end = i + max/2;
            }
        }
        return s.substring(start, end+1);
    }
    private int expandFromCentre(String s, int l, int r){
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
}