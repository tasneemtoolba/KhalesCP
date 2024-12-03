class Solution {
    val map : MutableMap<ListNode,Int> = mutableMapOf()
    fun hasCycle(head: ListNode?): Boolean {
        var answer=false
        head?.let {
            var cur=head
            while (cur?.next!=null){
                if(map[cur] == null){
                    map.put(cur,1)
                }else{
                    answer= true
                    break
                }
                cur=cur.next
            }
        }
        return answer
    }
}