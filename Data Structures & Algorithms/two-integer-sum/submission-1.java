public class Solution {
    public int[] twoSum(int[] arrayValue, int target){
        Map<Integer,Integer> mapValue = new HashMap<>();
        for(int i=0;i<arrayValue.length;i++) {
            mapValue.put(arrayValue[i],i);
        }
        for (int i=0;i<arrayValue.length;i++){
            int requiredNumber = target - arrayValue[i];
           if(mapValue.containsKey(requiredNumber)
                    && mapValue.get(requiredNumber) != i) {
                return new int[]{i, mapValue.get(requiredNumber)};
            }
        }
        return new int[] {};
    }

}

