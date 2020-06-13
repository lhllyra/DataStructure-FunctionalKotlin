package queue
import singlyLinkedList.*


fun main() {


    val queue1: ListNode<Int>? = ListNode(-1, null)
    println(queue1)
    val queue2: ListNode<Int>? = enqueue(queue1, 0)
    println(queue2)
    val queue3: ListNode<Int>? = dequeue(queue2)
    println(queue3)
    val queue4 : ListNode<Int>? = ListNode(3, ListNode(4, ListNode(5,ListNode(6,null))))
    println(queue4)
    val queue5: ListNode<Int>? = reverse(queue4)
    println(queue5)
    val n = peek(queue5)
    println(n)

}
