/*
	Name : Dhruv Patel
	Date : 30/05/24
	Aim : 
 		DEQUE --> Double Ended Queue (Using Array):
		There are two types of DEQUE 
		1. Input Restrictive Queue : 
			You can remove element from both side (front and rear)
			You can add element only from rear side
		2. Output Restrictive Queue : 
			You can add element from both side (front and rear)
			You can remove element only from front side
   		Methods :
     			insertFront(int x) --> inserting the x element at the Front pointor
     			insertRear(int x) --> inserting the x element at the Rear pointor
     			removeFront() --> removing the element at the Front pointor
     			removeRear() --> reoving the element from the Rear pointor
     			display() --> printing the elements of the queue
*/
// import statements
import java.util.*;

class DEQUE {
	static int Queue[];
	static int size;
	// Front and Rear pointors declaration
	static int F = -1;
	static int R = -1;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the queue");
		size = sc.nextInt();
		Queue = new int[size];
		boolean b = true;
		while (b) {
			System.out.println("Enter 1 for add element from rear");
			System.out.println("Enter 2 for add element from front");
			System.out.println("Enter 3 for remove element from front");
			System.out.println("Enter 4 for remove element from rear");
			System.out.println("Enter 5 for display queue");
			System.out.println("Enter 6 for display the front of queue");
			System.out.println("Enter 7 for display the rear of queue");
			System.out.println("Enter 8 for exit");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
				case 1: {
					System.out.println("Enter the element you want to add from rear");
					int x = sc.nextInt();
					DEQUE.insertRear(x);
					break;
				}
				case 2: {
					System.out.println("Enter the element you want to add from front");
					int x = sc.nextInt();
					DEQUE.insertFront(x);
					break;
				}
				case 3: {
					DEQUE.removeFront();
					break;
				}
				case 4: {
					DEQUE.removeRear();
					break;
				}
				case 5: {
					DEQUE.display();
					break;
				}
				case 6: {
					System.out.println("Front = " + F);
					break;
				}
				case 7: {
					System.out.println("Rear = " + R);
					break;
				}
				case 8: {
					b = false;
					break;
				}
				default: {
					System.out.println("You enterd incorrect choice");
					break;
				}
			}
		}
	}

	// printing the all elements of the queue
	public static void display() {
		// checks UnderFlowError
		if (F == -1) {
			System.out.println("Queue is empty");
		} else {
			for (int i = F; i != R; i = (i + 1) % size) {
				System.out.print(Queue[i] + " ");
			}
			System.out.println(Queue[R]);
		}
	}

	// insertRear(int x) --> Inserting the x element from the Rear pointor
	public static void insertRear(int x) {
		// checks OverFlowError
		if (F == (R + 1) % size) {
			System.out.println("Queue is Full");
		} else {
			if (F == -1) {
				F = 0;
			}
			R = (R + 1) % size;
			Queue[R] = x;
			System.out.println(x + " is added successfully");
		}
	}

	// insertFront(int x) --> Inserting the x element from the Front Pointor
	public static void insertFront(int x) {
		// checks OverFlowError
		if (F == (R + 1) % size) {
			System.out.println("Queue is Full");
		} else {
			if (F == -1) {
				F = 0;
			}
			F = (R + 1) % size;
			Queue[F] = x;
			System.out.println(x + " is added successfully");
		}
	}

	// removeFront() --> remove the element on the front pointor
	public static void removeFront() {
		// checks UnderFlowError
		if (F == -1) {
			System.out.println("Queue is empty");
		} else {
			int y = Queue[F];
			if (F == R) {
				F = -1;
				R = -1;
			} else {
				F = (F + 1) % size;
			}
			System.out.println(y + " is removed successfully");
		}
	}

	// removeRear() --> remove the element on the rear pointor
	public static void removeRear() {
		// checks UnderFlowError
		if (F == -1) {
			System.out.println("Queue is empty");
		} else {
			int y = Queue[F];
			if (F == R) {
				F = -1;
				R = -1;
			} else {
				R = (F + 1) % size;
			}
			System.out.println(y + " is removed successfully");
		}
	}
}
