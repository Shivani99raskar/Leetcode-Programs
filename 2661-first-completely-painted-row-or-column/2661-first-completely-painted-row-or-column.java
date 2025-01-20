class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        HashMap<Integer,int[]>map=new HashMap<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                map.put(mat[i][j],new int[]{i,j});
            }
        }
        int rows=mat.length;
        int cols=mat[0].length;

        int row[]=new int[rows];
        int col[]=new int[cols];
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int r=map.get(num)[0];
            int c=map.get(num)[1];
            row[r]++;
            col[c]++;
            if(row[r]==cols||col[c]==rows){
                return i;
            }

        }
        return -1;
    }
}