package practice.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 01题 两数之和
 */
public class lc_01_twoSum {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 8, 6, 4, 7};
        int target = 9;
        int[] ints = twoSumBetter(nums, target);
        System.out.println(Arrays.toString(ints));

    }

    /**
     * n^2
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] numArray = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int val = target - nums[i];
            for (int j = nums.length - 1; j > 0; j--) {
                if (val == nums[j] && i != j) {
                    numArray[0] = i;
                    numArray[1] = j;
                }
            }
        }
        return numArray;
    }


    /**
     * n^2
     *
     * @param numsgit
     * @param target
     * @return
     */
    public static int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int val = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (val == nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }


    /**
     * 优化解法 时间复杂度：n*log(n)
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSumBetter(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int val = target - nums[i];
            if (numMap.containsKey(val)) {
                return new int[]{numMap.get(val), i};
            }
            numMap.put(nums[i], i);
        }
        return null;
    }
}
