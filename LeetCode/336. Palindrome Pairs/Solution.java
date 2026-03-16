class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> res = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            map.put(words[i], i);
        }

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int len = word.length();

            for (int j = 0; j <= len; j++) {

                // prefix
                if (isPalindrome(word, 0, j - 1)) {
                    String suffix = word.substring(j);
                    String rev = new StringBuilder(suffix).reverse().toString();

                    Integer idx = map.get(rev);
                    if (idx != null && idx != i) {
                        res.add(Arrays.asList(idx, i));
                    }
                }

                // suffix
                if (j != len && isPalindrome(word, j, len - 1)) {
                    String prefix = word.substring(0, j);
                    String rev = new StringBuilder(prefix).reverse().toString();

                    Integer idx = map.get(rev);
                    if (idx != null && idx != i) {
                        res.add(Arrays.asList(i, idx));
                    }
                }
            }
        }

        return res;
    }

    private boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) return false;
        }
        return true;
    }
}