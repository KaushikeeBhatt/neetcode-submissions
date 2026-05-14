class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
                map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int f=target-nums[i];
            if(map.containsKey(f) && map.get(f)!=i){
                return new int[]{i,map.get(f)};
            }
        }
        return new int[]{};
    }
}
