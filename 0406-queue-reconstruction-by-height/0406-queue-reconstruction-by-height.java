class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (p1, p2) -> p1[0] - p2[0]);
        var uniqueK = new TreeSet<Integer>();
        for(int[] p : people)
            uniqueK.add(p[1]);
        var result = new ArrayList<int[]>();
        for(int eh : uniqueK){
            
            for(int[] cp : people){
                if(cp[1] != eh) continue;

                int count = 0, idx = 0;
                for(; idx < result.size(); idx++){
                    if(result.get(idx)[0] >= cp[0]){
                        count++;
                    }
                    if(count > eh)
                        break;
                }
                
                result.add(idx, cp);
            }
        }
        int[][] ans = new int[people.length][2];
        for(int i = 0; i < result.size(); i++){
            ans[i] = result.get(i);
        }
        
        return ans;
    }
}

