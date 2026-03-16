import java.math.BigInteger;
class Solution {
    public int smallestBalancedIndex(int[] nums) {
        if (nums == null || nums.length == 0) return -1;
        int n = nums.length;
        BigInteger total = BigInteger.ZERO;
        BigInteger totalAbs = BigInteger.ZERO;
        for (int v : nums) {
            BigInteger bv = BigInteger.valueOf(v);
            total = total.add(bv);
            totalAbs = totalAbs.add(bv.abs());
        }
        BigInteger product = BigInteger.ONE;
        BigInteger sum = BigInteger.ZERO;
        int res = -1;
        boolean productTooLarge = false;
        int suffixZeroCount = 0;
        for (int i = n - 1; i >= 0; i--) {
            BigInteger leftsum = total.subtract(BigInteger.valueOf(nums[i])).subtract(sum);
            if (suffixZeroCount > 0) {
                if (leftsum.equals(BigInteger.ZERO)) res = i;
            } else {
                if (!productTooLarge) {
                    if (leftsum.equals(product)) res = i;
                }
            }
            if (nums[i] == 0) {
                suffixZeroCount++;
            } else {
                if (!productTooLarge && suffixZeroCount == 0) {
                    product = product.multiply(BigInteger.valueOf(nums[i]));
                    if (product.abs().compareTo(totalAbs) > 0) {
                        productTooLarge = true;
                        product = null;
                    }
                }
            }
            sum = sum.add(BigInteger.valueOf(nums[i]));
        }
        return res;
    }
}