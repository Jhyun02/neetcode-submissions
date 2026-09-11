class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[k];

        for(int i: nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());

        entryList.sort((a,b) -> b.getValue() - a.getValue());

        for(int i=0; i<k; i++){
            ans[i] = entryList.get(i).getKey();
        }



        //System.out.println(entryList);

        return ans;

    }
}
