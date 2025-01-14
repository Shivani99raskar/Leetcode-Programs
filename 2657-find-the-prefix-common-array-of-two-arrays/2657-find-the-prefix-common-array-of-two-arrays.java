class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] res = new int[n];
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        for(int i=0; i<n; i++){
            a.add(A[i]);
            b.add(B[i]);
            Set<Integer> inter = new HashSet<>(a);
            inter.retainAll(b);
            res[i] = inter.size();
        }
        return res;
    }
}