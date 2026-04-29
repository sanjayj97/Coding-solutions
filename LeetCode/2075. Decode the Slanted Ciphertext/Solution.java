class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int n = encodedText.length();
        if (rows == 1)return encodedText;
        int cols = n / rows;

        StringBuilder res = new StringBuilder(n);

        for(int i = 0;  i < cols ; i++){
            int r = 0, c = i;
            while(r < rows && c < cols){
                res.append(encodedText.charAt(r * cols + c));
                r++;
                c++;
            }
        }

        int f = res.length() - 1;
        while( f >= 0 && res.charAt(f) == ' '){
            f--;
        }
        return res.substring(0, f+1);
    }
}