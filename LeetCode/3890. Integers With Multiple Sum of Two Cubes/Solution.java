class Solution {
    public List<Integer> findGoodIntegers(int n) {
        Map<Integer, Integer> count = new HashMap<>();
        int l = (int) Math.cbrt(n) + 1;
        for(int a = 1; a <= l; a++){
            for(int b = a; b <= l; b++){
                int sum = a*a*a + b*b*b;

                if (sum > n) break;

                count.put(sum, count.getOrDefault(sum, 0) + 1);
            }
        }
        List<Integer> res = new ArrayList<>();

        for(int k : count.keySet()){
            if(count.get(k) >= 2){
                res.add(k);
            }
        }
        Collections.sort(res);
        return res;
    }
}