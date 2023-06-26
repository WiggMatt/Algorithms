package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

/*
Дан массив целых чисел nums и целое число target, вернуть индексы двух чисел так, чтобы они были равны в сумме  target.
Вы можете предположить, что каждый вход будет иметь ровно одно решение,
и вы не можете использовать один и тот же элемент дважды.
Вы можете вернуть ответ в любом порядке.

Пример 1:
Ввод:  числа = [2,7,11,15], цель = 9
  Выход:  [0,1]
  Объяснение:  поскольку nums[0] + nums[1] == 9, мы возвращаем [0, 1].
*/

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 3};
        System.out.println(Arrays.toString(twoSum(nums, 6)));
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = null;

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result = new int[]{map.get(target - nums[i]), i};
                break;
            }
            map.put(nums[i], i);
        }

        return result;
    }
}
