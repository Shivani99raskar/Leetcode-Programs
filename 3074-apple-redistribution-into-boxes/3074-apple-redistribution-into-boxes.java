class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int answer=0;
        int sum=Arrays.stream(apple).sum();
        Arrays.sort(capacity);
        
        int i=capacity.length-1;
        
        while(i>=0)
        {
          sum=sum-capacity[i] ;
            answer++;
            if(sum<=0)
                break;
            i--;
        }
        return answer;
    }
}