/*
	Singly Linked List
	simple useful methods :-
		1. addFirst(int x) --> Add the x element at first of the list
		2. addLast(int x) --> Add the x element at the last of the list
		3. deleteFirst() --> Delete the first element of the list
		4. deleteLast() --> Delete the last element of the list
		5. addBefore(int x, int y) --> Add the x element before the y index of the list
		6. addAfter(int x, int y) --> Add the x element after the y index of the list
		7. deletePerticular(int x) --> Delete the x element of the list
		8. deletePerticularIndex(int index) --> Delete the element of the perticular index of the list
		9. display() --> display the whole List
		10. displayRecursive(Node temp) --> display the list reverse from temp to the Head(using recursive)
*/
import java.util.*;

class LinkedList {
	// class Node which creates the node
	class Node {
		// Node has two properties
		// 1. data --> it will saves the data of current node
		// 2. next --> it will saves the address of next node
		int data;
		Node next;
		Node(int d) {
			data = d;
			next = null;
		}
	}

	// Head --> It will point the first node of the list
	Node Head = null;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		LinkedList al = new LinkedList();
		// different cases for singly linked list
		while (b) {
			System.out.println("Enter 1 for add element at first");
			System.out.println("Enter 2 for add element at last");
			System.out.println("Enter 3 for add element before");
			System.out.println("Enter 4 for add element after");
			System.out.println("Enter 5 for delete element at first");
			System.out.println("Enter 6 for delete element Last");
			System.out.println("Enter 7 for delete element you want to delete");
			System.out.println("Enter 8 for delete perticular element by index");
			System.out.println("Enter 9 for display");
			System.out.println("Enter 10 for display recursive Queue");
			System.out.println("Enter 11 for exit");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
				case 1: {
					System.out.println("Enter the element you want to add first");
					int x = sc.nextInt();
					al.insertFirst(x);
					break;
				}
				case 2: {
					System.out.println("Enter the element you want to add first");
					int x = sc.nextInt();
					al.insertLast(x);
					break;
				}
				case 3: {
					System.out.println("Enter the element you want to add ");
					int x = sc.nextInt();
					System.out.println("Enter List's element want to add before");
					int y = sc.nextInt();
					al.insertBefore(y, x);
					break;
				}
				case 4: {
					System.out.println("Enter the element you want to add ");
					int x = sc.nextInt();
					System.out.println("Enter List's element want to add last");
					int y = sc.nextInt();
					al.insertAfter(y, x);
					break;
				}
				case 5: {
					al.deleteFirst();
					break;
				}
				case 6: {
					al.deleteLast();
					break;
				}
				case 7: {
					System.out.println("Enter the element you want to delete");
					int element = sc.nextInt();
					al.deletePerticular(element);
					break;
				}
				case 8: {
					System.out.println("Enter the element's index you want to delete");
					int index = sc.nextInt();
					al.deletePerticularIndex(index);
					break;
				}
				case 9: {
					al.display();
					break;
				}
				case 10: {
					al.displayRecursive(al.Head);
					System.out.println();
					break;
				}
				case 11: {
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

	// delete the perticular x element
	void deletePerticular(int x) {
		int flag = 0;
		Node dummy = Head;
		// verify x exists in the list or not
		while (dummy != null) {
			if (dummy.data == x) {
				flag = 1;
			}
			dummy = dummy.next;
		}
		if (flag == 0) {
			System.out.println("List is  not have this perticulat element");
		} else {
		// logic for remove the x 
			if (Head.data == x) {
				Node temp = Head;
				Head = Head.next;
				temp.next = null;
			} else {
				Node temp = Head;
				while (temp.next.data != x) {
					temp = temp.next;
				}
				Node del = temp.next;
				temp.next = del.next;
				del.next = null;
			}
		}
	}

	// inserting the x element at the Head pointor
	void insertFirst(int x) {
		Node n1 = new Node(x);
		if (Head == null) {
			Head = n1;
		} else {
			n1.next = Head;
			Head = n1;
		}
	}

	// inserting x element at the last of the list
	void insertLast(int x) {
		Node n1 = new Node(x);
		// temp pointor for travarse the list for find the last element and save the Head
		Node temp = Head;
		if (Head == null) {
			Head = n1;
		} else {
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = n1;
		}
	}

	// inserting the x element before the y index of the list
	void insertBefore(int x, int y) {
		Node dummy = Head;
		int flag = 0;
		Node temp = Head;
		// It will check that data exists in the list or not
		while (temp != null) {
			if (temp.data == x) {
				flag = 1;
			}
			temp = temp.next;
		}
		if (flag == 0) {
			System.out.println("Element is not exist in the list");
		} else {
			// logic for add the data
			Node n1 = new Node(y);
			if (Head.data == x) {
				n1.next = Head;
				Head = n1;
			} else {
				while (dummy.next.data != x) {
					dummy = dummy.next;
				}
				n1.next = dummy.next;
				dummy.next = n1;
			}
		}
	}

	// Add the x element after the y index of the list
	void insertAfter(int x, int y) {
		Node dummy = Head;
		int flag = 0;
		// It will check that data exists in the list or not
		Node temp = Head;
		while (temp != null) {
			if (temp.data == x) {
				flag = 1;
			}
			temp = temp.next;
		}
		if (flag == 0) {
			System.out.println("Element is not exist in the list");
		} else {
			// add node at the perticular index
			Node n1 = new Node(y);
			while (dummy.data != x) {
				dummy = dummy.next;
			}
			n1.next = dummy.next;
			dummy.next = n1;
		}
	}

	// delete the Head pointor
	void deleteFirst() {
		if (Head == null) {
			System.out.println("List is empty");
		} else {
			Node temp = Head;
			Head = Head.next;
			temp.next = null;
		}
	}

	// delete the last element of the list
	void deleteLast() {
		if (Head == null) {
			System.out.println("List is empty");
		} else if (Head.next == null) {
			Head = null;
		} else {
			Node temp = Head;
			while (temp.next.next != null) {
				temp = temp.next;
			}
			temp.next = null;
		}
	}

	// display the list
	void display() {
		Node temp = Head;
		if (Head == null) {
			System.out.println("List is empty");
		} else {
			while (temp.next != null) {
				System.out.print(temp.data + " --> ");
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
	}

	// display the reverse list using recursion
	void displayRecursive(Node temp) {
		if (temp == null) {
			return;
		} else {
			if (temp != null) {
				displayRecursive(temp.next);
				System.out.print(temp.data + " --> ");
			}
		}
	}

	// delete the perticular index
	void deletePerticularIndex(int index) {
		Node temp = Head;
		Node dummy = Head;
		int count = 0;
		int b = 0;
		while (dummy != null) {
			count++;
			if (index == count) {
				b = 1;
			}
			dummy = dummy.next;
		}
		if (b == 0) {
			System.out.println("Index is not exist in the list");
		} else {
			int c = 0;
			while (temp.next.next != null) {
				c++;
				temp = temp.next;
				if (c == count - 1) {
					Node del = temp.next;
					temp.next = del.next;
					del.next = null;
				}
			}
		}
	}
}
