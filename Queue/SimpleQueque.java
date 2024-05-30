/*
	Simple Queue using Array
		Pointors:-
			Front : first element of the queue
			Rear : last element of the queue
		Methods:-
			enQueue(element) : for add element in the queue from rear pointor
			deQueue() : for remove element from the queue from front pointor
			display() : display queue It will display Queue from front to rear
		Remarks:-
			when Front and Rear at -1 than Queue is empty
			when Front and Rear are at same position there is only one element in the queue
			when Front and Rear are at size-1 position than we perform enQueue we get "Queue is full"
			when Front is at 0 and Rear is at size-1 position than we perform deQueue we get "Queue is empty"
*/
import java.util.*;

class Queue {
	static int size;
	static int Q[];
	// pointors declaration
	static int R = -1;
	static int F = -1;

	public static void main(String arr[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Queue");
		size = sc.nextInt();
		Q = new int[size];
		Queue q = new Queue();
		int choice = 0;
		boolean b = true;
		while (b) {
			System.out.println("Enter 1 for Insert element");
			System.out.println("Enter 2 for Delete element");
			System.out.println("Enter 3 for display queue");
			System.out.println("Enter 4 for see front");
			System.out.println("Enter 5 for see rear");
			System.out.println("Enter 6 for Exit");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch (choice) {
				case 1: {
					System.out.println("Enter the element you want to insert");
					int x = sc.nextInt();
					q.enQueue(x);
					break;
				}
				case 2: {
					q.deQueue();
					break;
				}
				case 3: {
					q.display();
					break;
				}
				case 4: {
					System.out.println(F);
					break;
				}
				case 5: {
					System.out.println(R);
					break;
				}
				case 6: {
					b = false;
					break;
				}
				default: {
					System.out.println("You entered wroung choice");
				}
			}
		}
	}

	// enQueue(int x) method --> for add the x element from the Rear Pointor
	public static void enQueue(int x) {
		// checking the OverFlowError
		if (R == size - 1) {
			System.out.println("Queue is full");
		} else {
			if (F == -1) {
				F++;
			}
			R++;
			Q[R] = x;
			System.out.println(x + " is added");
		}
	}

	// deQueue() --> remove the element from the Front Pointor
	public static void deQueue() {
		// checking the UnderFlowError 
		if (F == -1) {
			System.out.println("Queue is empty");
		} else {
			if (F == R) {
				F = -1;
				R = -1;
			} else {
				F++;
				System.out.println(Q[F - 1] + " is removed successfully");
			}
		}
	}

	// display() --> printing all the elements in the Queue
	public static void display() {
		if (F == -1) {
			System.out.println("Queue is empty");
		} else {
			for (int i = F; i <= R; i++) {
				System.out.print(Q[i] + " ");
			}
			System.out.println();
		}
	}
}
