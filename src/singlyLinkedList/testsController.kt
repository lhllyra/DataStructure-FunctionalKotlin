package singlyLinkedList


fun main() {
    val list: ListNode<Int> = ListNode(3, ListNode(0, ListNode(5, ListNode(0, ListNode(3, null)))))
    val list2: ListNode<Int>? = insert(list, 9)
    val list3: ListNode<Int>? = insert(list2, 6)
    val swap = swapAdjacent(list, 3)
    print(swap)



}