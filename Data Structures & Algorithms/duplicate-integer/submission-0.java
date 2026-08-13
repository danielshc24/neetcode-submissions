class Solution {

    public static boolean hasDuplicate(int[] nums) {
       HashSet elementSet = new HashSet<>();
       for(int num : nums) {
        if(elementSet.contains(num)){
            return true;
        }
        else {
            elementSet.add(num);
        }
       }
       return false;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 2, 4};

        boolean val = hasDuplicate(input);

        System.out.println(val);
    }
}
