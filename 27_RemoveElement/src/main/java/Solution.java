public class Solution {
    public int removeElement(int[] nums, int val) {
        int slow = -1;
        int fast = -1;

        while (++fast < nums.length)
            if (nums[fast] != val)
                nums[++slow] = nums[fast];

        return ++slow;
    }
}