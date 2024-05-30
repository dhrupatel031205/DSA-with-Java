
/*
	Name : Dhruv Patel
	Date : 30/05/24
	Aim : 
	Cicular Queue
		Pointors:-
			Front : first element of the queue
			Rear : last element of the queue
		Methods:-
			enQueue(element) : for add element in the queue from rear pointor
			deQueue() : for remove element from the queue from front pointor
			display() : display queue It will display Queue from front to rear
*/
// import statements
import java.util.*;

class CicularQueue {
	static int size;
	static int Q[];
	// pointors declaration
	static int F = -1;
	static int R = -1;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of queue");
		size = sc.nextInt();
		Q = new int[size];
		boolean b = true;
		int choice = 0;
		while (b) {
			System.out.println("Enter 1 for add element");
			System.out.println("Enter 2 for remove element");
			System.out.println("Enter 3 for display");
			System.out.println("Enter 4 for show front");
			System.out.println("Enter 5 for show rear");
			System.out.println("Enter 6 for Exit");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch (choice) {
				case 1: {
					System.out.println("Enter the element you want to add");
					int x = sc.nextInt();
					CicularQueue.enQueue(x);
					break;
				}
				case 2: {
					CicularQueue.deQueue();
					break;
				}
				case 3: {
					CicularQueue.display();
					break;
				}
				case 4: {
					System.out.println("Front " + F);
					break;
				}
				case 5: {
					System.out.println("Rear " + R);
					break;
				}
				case 6: {
					b = false;
					break;
				}
				default: {
					System.out.println("You enterd wrong choice");
					break;
				}
			}
		}
	}

	// enQueue(int x) --> inserting the x element from the Rear pointor
	public static void enQueue(int x) {
		// checks OverFlowError
		if (F == (R + 1) % size) {
			System.out.println("Queue is Full");
		} else {
			if (F == -1) {
				F = 0;
			}
			R = (R + 1) % size;
			Q[R] = x;
			System.out.println(x + " is added successfully");
		}
	}

	// deQueue() --> removing the element from the Front pointor
	public static void deQueue() {
		// checks UnderFlowError 
		if (F == -1) {
			System.out.println("Queue is empty");
		} else {
			int y = Q[F];
			if (F == R) {
				F = -1;
				R = -1;
			} else {
				F = (F + 1) % size;
			}
			System.out.println(y + " is removed successfully");
		}
	}

	// display() --> printing the all elements in the queue
	public static void display() {
		// checks UnderFlowError 
		if (F == -1) {
			System.out.println("Queue is empty");
		} else {
			for (int i = F; i != R; i = (i + 1) % size) {
				System.out.print(Q[i] + " ");
			}
			System.out.println(Q[R]);
		}
	}
}