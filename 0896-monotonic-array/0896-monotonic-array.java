class Solution {
    public boolean isMonotonic(int[] A) {
        boolean inc = true, dec = true;
        for (int i = 1; i < A.length; ++i) {
            inc &= A[i - 1] <= A[i]; //&= checks two condition like &&
            dec &= A[i - 1] >= A[i];
        }
        return inc || dec; // return true if any one is true
    }}