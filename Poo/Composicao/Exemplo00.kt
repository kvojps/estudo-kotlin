package Poo.Composicao

class Queue<E> {
    private val arrayDeque = ArrayDeque<E>()
    fun put(e: E) = arrayDeque.addLast(e)
    fun poll(): E = arrayDeque.removeFirst()
    fun show(): ArrayDeque<E> = arrayDeque
}

//FIFO = First In First Out
fun main() {
    val queue = Queue<String>()
    queue.put("a")
    queue.put("b")
    queue.put("c")
    queue.put("d")
    queue.poll()
    queue.poll()
    println(queue.show())
}