class Solution {
    private int reverse(int n){
        int r = 0;
        while(n > 0){
            r = r * 10 + (n % 10);
            n /= 10;
        }
        return r;
    }
    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 100000, i = 0;
        for(int n : nums){
            if(map.containsKey(n)){
                int v = map.get(n);
                res = (res < (i - v))? res : i - v;
            }
            map.put(reverse(n), i);
            i++;
        }
        return (res == 100000)? -1 : res;
    }
}