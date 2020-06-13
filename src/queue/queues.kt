package queue
import singlyLinkedList.*

/*Here we have an implementation of queues using a singly linked list node, which is a most natural
* use; given the basic characteristics of the two. In a queue, the nodes need to be connected to each
* other in an orderly fashion and do so in only one direction. The main difference is that, in the pre-
* sent data structure, there are much severe restrictions as to how we manipulate the data contained
* in it. This is popularly known as the FIFO logic, or "First in, first out", mimicking the real life
* function of a queue. There will be no implementations of methods to insert or remove data to a given
* index, nor removal from the "tail" or insertion to the "head" of the queue, as to respect the FIFO paradigm.
* */

fun <T> enqueue(queue:ListNode<T>?, data:T?):ListNode<T>? = when(queue){
    null -> ListNode(data, null)
    else -> ListNode(data, queue)
}

fun <T> dequeue(queue:ListNode<T>?):ListNode<T>? = when{
    queue == null -> queue
    queue.next == null -> null
    else -> ListNode(queue.data, dequeue(queue.next))
}

private fun <T> getDequeue(queue:ListNode<T>?):ListNode<T>? = when{
    queue == null -> queue
    queue.next == null -> ListNode<T>(queue.data, null)
    else -> getDequeue(queue.next)
}

fun <T> reverse(queue: ListNode<T>?):ListNode<T>? = when (queue) {
    null -> null
    else -> ListNode(getDequeue(queue)!!.data, reverse(dequeue(queue)))
}

fun <T> peek(queue: ListNode<T>?):T? = when {
    queue == null -> queue
    queue.next == null -> queue.data
    else -> peek(queue.next)
}

fun <T> isEmpty(queue:ListNode<T>?):Boolean = when (queue) {
    null -> true
    else -> false
}


