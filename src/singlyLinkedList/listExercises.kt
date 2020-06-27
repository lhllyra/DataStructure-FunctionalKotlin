package singlyLinkedList

fun <T> removeFirstInstance(list:ListNode<T>?, value: T):ListNode<T>? = when {
    list == null -> null
    list.data != value -> ListNode<T>(list.data, removeFirstInstance(list.next, value))
    else -> list.next
}


fun <T> removeAllInstances(list:ListNode<T>?, value: T):ListNode<T>? = when {
    list == null -> null
    list.data != value -> ListNode<T>(list.data, removeAllInstances(list.next, value))
    else -> removeAllInstances(list.next , value)
}


fun <T> palindrome(list:ListNode<T>?):Boolean? = when(list){
    null -> null
    else -> reverse(list) == list
}


fun <T> getMiddle(list:ListNode<T>?):T? = when{
    list == null -> null
    listSize(list) % 2 == 0 -> {
         getValueAtIndex(list, listSize(list)/2)
    }

    else -> {
        getValueAtIndex(list, listSize(list)/2)
    }
}


fun <T> swapAdjacent(list: ListNode<T>?, index:Int):ListNode<T>? = when{
    list == null -> null
    list.next == null -> list
    index != 0 -> ListNode(list.data, swapAdjacent(list.next, index-1))
    else -> {
        ListNode(list.next.data, ListNode(list.data, list.next.next))
    }
}