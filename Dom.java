// Вывести список на экран в перевернутом виде (без массивов и ArrayList)
// Пример:
// 1 -> 2->3->4
// Вывод:
// 4->3->2->1, потом: https://leetcode.com/problems/valid-parentheses/
package Domaha3;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;
public class Dom {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        System.out.println(ll);
        while (ll.size() > 0) {
            System.out.print(ll.pollLast() + "  ");
        }
    }
}
