package singlyLinkedList


fun main(){
    val list:ListNode<String> = ListNode("o", ListNode("v",ListNode("o", null)))
    val bool = palindrome(list)
    print(bool)

}
