package LeetCode;

import java.util.HashSet;

/*
Дан целочисленный массив nums,
возвращаться true если какое-либо значение встречается не менее двух раз и
возвращает в массиве false если каждый элемент различен.


Пример 1:
Ввод:  числа = [1,2,3,1]
Вывод:  правда
*/


public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i : nums){
            if (!set.add(i)) {
                return true;
            }
        }

        return false;
    }
}
