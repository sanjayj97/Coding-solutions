class Solution {
    public boolean judgeCircle(String moves) {
        int lr = 0;
        int ud = 0;
        for(char c: moves.toCharArray()){
            if(c == 'L')lr++;
            else if(c == 'R')lr--;
            else if(c == 'U')ud++;
            else if(c == 'D')ud--;
        }
        if(lr == 0 && ud == 0)return true;
        return false;
    }
}