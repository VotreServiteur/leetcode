package removeDuplicatesFromSortedArrayII;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int i = 0;
        int last = nums[0];
        while(i < nums.length){
            if(nums[i] >= last){
                nums[++k] = nums[++i];
                while(nums[i] == last){
                    i++;
                }
                nums[++k] = nums[i];
                last = nums[i++];
            }
        }
        nums[k++] = last;

        return k;
    }
}