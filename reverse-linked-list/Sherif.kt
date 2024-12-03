class ListNode(var `val`: Int) {
  var next: ListNode? = null
}
class Solution {
    fun reverseList(head: ListNode?): ListNode? {
    if (head?.next==null)  return head
     var current = head
    val arrOfNodes = mutableListOf<Int>()
    while (current!=null){
        arrOfNodes.add(current.`val`)
        current = current.next
    }
    var i=0
    var j=arrOfNodes.size-1
    while (i < j) {
        val temp = arrOfNodes[i]
        arrOfNodes[i] = arrOfNodes[j]
        arrOfNodes[j] = temp
        if (arrOfNodes.size == 2) break
        i++ // 1
        j--
    }
    val newHead = ListNode(arrOfNodes[0])
    var newCurrent = newHead
    for(x in 1 until arrOfNodes.size){
        newCurrent.next = ListNode(arrOfNodes[x])
        newCurrent = newCurrent.next!!
    }
    return newHead
    }
}