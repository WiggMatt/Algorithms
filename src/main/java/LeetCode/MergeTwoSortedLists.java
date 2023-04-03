package LeetCode;

/*
  Условие задачи.
  Вам даны главы двух отсортированных связанных списков list1а также list2.
  Объедините два списка в один отсортированный список. Список должен быть составлен путем соединения узлов первых двух списков.
  Возвращает заголовок объединенного связанного списка.

  Input: list1 = [1,2,4], list2 = [1,3,4]
  Output: [1,1,2,3,4,4]

  Ограничения:
    Количество узлов в обоих списках находится в диапазоне [0, 50].
    -100 <= Node.val <= 100
    Оба list1 а также list2 сортируются в порядке неубывания.
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class MergeTwoSortedLists (ListNode l1, l2) {
    if (l1 == null) {
        return l2;
    }
    if (l2 == null) {
        return l1;
    }

    if (l1.val < l2.val) {
        l1.next = MergeTwoSortedLists(l1.next, l2);
        return l1;
    } else {
        l2.next = MergeTwoSortedLists(l1, l2.next);
        return l2;
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode() {
    }
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
