package LeetCode;

/*
Дан целочисленный массив nums, найди подмассив с наибольшей суммой и вернуть ее сумму.

Пример 1:
Ввод:  числа = [-2,1,-3,4,-1,2,1,-5,4]
Выход:  6
Объяснение:  Подмассив [4,-1,2,1] имеет наибольшую сумму 6.
*/


public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2,-1,3,-1,5,-4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i : nums) {
            currentSum = Math.max(currentSum + i, i);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
