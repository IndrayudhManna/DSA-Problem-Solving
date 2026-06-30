class Solution {
    public int mySqrt(int n) {
        if(n==0) return 0;
        int start = 1, end = n;
        while(start <= end){
            int mid = start + (end - start)/2;

        if(mid == n/mid) return mid;
        else if(mid > n/mid) end = mid -1;
        else start = mid +1;
        }
     return end;
    }
}