package LeetCode;

/*
Дан целочисленный массив nums, вернуть массив answer такой,
что answer[i] равно произведению всех элементов nums кроме nums[i].

Произведение любого префикса или суффикса nums гарантированно целое помещается в 32-битное число.

Вы должны написать алгоритм, который работает в O(n)времени и без использования операции деления.

Пример 1:
Ввод:  числа = [1,2,3,4]
Вывод:  [24,12,8,6]
*/

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3 ,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        prefix[0] = 1;
        suffix[nums.length - 1] = 1;

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = nums[i - 1] * prefix[i - 1];
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            suffix[i] = nums[i + 1] * suffix[i + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = prefix[i] * suffix[i];
        }

        return nums;
    }
}
