package singlyLinkedList

fun <T> palindrome(list:ListNode<T>?):Boolean? = when(list){
    null -> null
    else -> reverse(list) == list
}