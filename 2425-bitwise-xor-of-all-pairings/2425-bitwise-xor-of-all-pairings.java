class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        if(n1%2==0 && n2%2==0) return 0;

        int x =0;

        if(n1%2!=0 && n2%2!=0){
            for(int i=0;i<n2;i++) x = x^nums2[i];
            for(int i=0;i<n1;i++) x = x^nums1[i];
        }
        else if(n2%2!=0){
            for(int i=0;i<n1;i++) x = x^nums1[i];
        }
        else{
            for(int i=0;i<n2;i++) x = x^nums2[i];
        }
        return x;
    }
}