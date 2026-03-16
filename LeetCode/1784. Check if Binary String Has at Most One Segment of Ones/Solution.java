class Solution {
    public boolean checkOnesSegment(String s) {
        boolean f = false;
        for(char c: s.toCharArray()){
            if( c == '0'){
                f = true;
            }
            if(c == '1' && f){
                return false;
            }
        }
        return true;
    }
}