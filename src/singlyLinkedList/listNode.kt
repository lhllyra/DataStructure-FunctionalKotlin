package singlyLinkedList


/*Here is the implementation of a singly linked list node, and the basic operations of a singly linked list.*/


data class ListNode<T>(val data: T?, val next:ListNode<T>?)

    fun <T> insert(list: ListNode<T>?, data: T?):ListNode<T> {
        return if (data == null) {
            print("why are you trying to insert null? please stop")
             ListNode(list?.data, null)
        }
        else {
            when (list?.data) {
                null -> ListNode(data, null)
                else -> {
                    if (list.next == null) {
                        ListNode(list.data, ListNode(data, null))
                    } else {
                        ListNode(list.data, insert(list.next, data))
                    }
                }
            }
        }

    }


    fun <T> insertToHead(list: ListNode<T>?, data:T?):ListNode<T> = when (list) {
        null -> ListNode<T>(data, null)
        else -> { ListNode<T>(data, list) }
    }


    fun <T> insertToIndex(list: ListNode<T>?, data: T, index: Int ):ListNode<T>? = when{
        index < 0 -> null
        list == null || index == 0 -> insertToHead(list, data)
        else -> {
            ListNode<T>(list.data, insertToIndex(list.next, data,index-1))
        }
    }


    fun <T> remove(list: ListNode<T>?):ListNode<T>? = when {
        list?.data == null -> list
        else -> { list.next }
    }


    fun <T> removeFromTail(list:ListNode<T>?):ListNode<T>? = when {
        list?.data == null -> list
        list.next == null -> null
        else -> { ListNode(list.data, removeFromTail(list.next)) }
    }


    fun <T> removeFromIndex(list:ListNode<T>?, index: Int):ListNode<T>? = when{
        list == null || index < 0 -> list
        index == 0 -> remove(list)
        else -> ListNode<T>(list.data, removeFromIndex(list.next, index -1))
    }


    fun <T> removeFirstInstance(list:ListNode<T>?, value: T):ListNode<T>? = when {
        list == null -> null
        list.data != value -> ListNode<T>(list.data, removeFirstInstance(list.next, value))
        else -> list.next
    }


    fun <T>getFirstInstance(list:ListNode<T>?, value: T):ListNode<T>? = when {  //gets the first instance of the given data
        list == null -> null
        list.data != value -> getFirstInstance(list.next, value)
        else -> ListNode<T>(list.data, null)
    }


    fun <T> getNodeAtIndex(list:ListNode<T>?, index: Int): ListNode<T>? = when { //gets the node present at the given index
        list == null || index < 0 -> list
        index == 0 -> ListNode<T>(list.data, null)
        else -> getNodeAtIndex(list.next, index -1)
    }


    fun <T> getValueAtIndex(list:ListNode<T>?, index:Int):T? = when{ //gets the value present at the given index
        list == null || index < 0 -> null
        index == 0 -> list.data
        else -> getValueAtIndex(list.next, index - 1)
    }


    fun <T> getNodeFromTail(list: ListNode<T>?):ListNode<T>? = when{ //gets the node from the tail of the list
        list == null -> list
        list.next == null -> list
        else -> getNodeFromTail(list.next)
    }


    fun <T> listSize(list: ListNode<T>?):Int = when(list?.data){
            null -> 0
            else -> { 1 + listSize(list.next) }
        }


    fun <T> contains(list:ListNode<T>?, value:T):Boolean = when {
        list == null -> false
        list.data != value -> contains(list.next, value)
        else ->  true
    }


    fun <T> reverse(list:ListNode<T>?):ListNode<T>? = when(list){
        null -> null
        else -> ListNode(getNodeFromTail(list)!!.data, reverse(removeFromTail(list)))
    }


