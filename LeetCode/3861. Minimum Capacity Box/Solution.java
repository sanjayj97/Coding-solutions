class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int min = -1;
        for (int i = 0; i < capacity.length; i++) {
            int rem = capacity[i] - itemSize;
            if (rem == 0) {
                return i;
            }
            capacity[i] = rem;
        }
        for (int i = 0; i < capacity.length; i++) {
            if (capacity[i] > 0) {
                if (min == -1 || capacity[i] < capacity[min]) {
                    min = i;
                }
            }
        }
        return min;
    }
}