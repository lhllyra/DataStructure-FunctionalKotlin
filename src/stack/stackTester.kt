package stack
import singlyLinkedList.*

fun main(){

    val stack:ListNode<Int>? = null
    val stack2:ListNode<Int>? = push(stack, 5)
    val stack3:ListNode<Int>? = push(stack2, 0)
    val stack4:ListNode<Int>? = push(stack3, 3)
    val stack5:ListNode<Int>? = push(stack4, 8)
    val stack6 = flipStack(stack5)
    print(stack6)

}
