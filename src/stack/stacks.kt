package stack
import singlyLinkedList.*

fun <T> push(stack:ListNode<T>?, value:T):ListNode<T>? = when (stack) {
    null -> ListNode<T>(value, null)
    else -> ListNode<T>(stack.data ,push(stack.next, value))
}

fun <T> peek(stack: ListNode<T>?):T? = when{ //returns the data on the top of the stack
    stack == null -> stack
    stack.next == null -> stack.data
    else -> peek(stack.next)
}

fun <T> getPop(stack: ListNode<T>?):ListNode<T>? = when {  //gets the element which was popped
    stack == null -> stack
    stack.next == null -> stack
    else -> getPop(stack.next)
}

fun <T> pop(stack:ListNode<T>?):ListNode<T>? = when{ //returns whats left of the stack after the pop
    stack == null -> stack
    stack.next == null -> null
    else -> ListNode<T>(stack.data, pop(stack.next))
}

fun <T> flipStack(stack: ListNode<T>?):ListNode<T>? = when(stack){ //returns the stack flipped upsideDown
    null -> stack
    else -> ListNode<T>(getPop(stack)?.data, flipStack(pop(stack)))
}