class Solution {
    val deque=ArrayDeque<Int>()
    fun reverseList(head: ListNode?): ArrayDeque<Int> {
        head?.let {
            var cur = head
            while (cur?.next != null) {
                deque.addFirst(cur.`val`)
                cur = cur.next
            }
            cur?.`val`?.let { it1 -> deque.addFirst(it1) }
            return deque
        }
        return ArrayDeque()
    }
}