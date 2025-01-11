class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for(int n : nums){
            if(map.containsKey(n)){
                map.put(n, map.get(n)+1);
            }else{
                map.put(n,1);
            }
        }
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                result = key;
            }
        }
        return result;
    }
}