package Collection.queue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Stack;

/**
 * deque是个双向队列
 * 既实现了栈 也实现了队列的操作
 */
public class DequeTest
{
	public static void main(String[] args)
	{
		/**
		 * LinkedList和ArrayDeque提供了Deque接口的具体实现
		 */
		Deque<String> deque = new ArrayDeque<>();

		// 栈操作  push是加到双向队列的头部
		deque.push("one");
		deque.push("two");
		System.out.println("Stack top: " + deque.peek()); // 输出 "two"
		System.out.println("Popped: " + deque.pop()); // 输出 "two"
		System.out.println("After pop: " + deque); // 输出 [one]

		// 队列操作  offer 是加到双向队列尾部
		deque.offer("three");
		deque.offer("four");
		System.out.println(deque);
		System.out.println("Queue head: " + deque.peek()); // 输出 "one"
		System.out.println("Polled: " + deque.poll()); // 输出 "one"
		System.out.println("After poll: " + deque); // 输出 [three, four]

	}
}
