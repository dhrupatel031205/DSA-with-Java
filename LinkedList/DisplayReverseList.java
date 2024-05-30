
/*
    Name : Dhruv Patel
    Date : 30/05/24
    Aim : Singly Linked List
    Basic Methods :-
        1. addFirst(int x) --> Add the x element at first of the list
	2. addLast(int x) --> Add the x element at the last of the list
	3. deleteFirst() --> Delete the first element of the list
	4. deleteLast() --> Delete the last element of the list
	5. display() --> display the whole List
    Extra Method :-			
	6. displayRecursive(Node temp) --> display the list reverse from temp to the Head(using recursive)
*/
import java.util.*;

class LinkedList {
    // class Node for make the Node
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Head pointor --> point the first node of the list
    static Node Head = null;

    // insertFirst(int x) method
    void insertFirst(int x) {
        Node n1 = new Node(x);
        if (Head == null) {
            Head = n1;
        } else {
            n1.next = Head;
            Head = n1;
        }
    }

    // insertLast(int x) method
    void insertLast(int x) {
        Node n1 = new Node(x);
        // temp pointor for traverse the list and go to the last node
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

    // deleteFirst() method
    void deleteFirst() {
        if (Head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = Head;
            Head = Head.next;
            temp.next = null;
        }
    }

    // deleteLast() method
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

    // display() method
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
}

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean b = true;
        LinkedList al = new LinkedList();
        while (b) {
            System.out.println("Enter 1 for add element at first");
            System.out.println("Enter 2 for add element at last");
            System.out.println("Enter 3 for delete element at first");
            System.out.println("Enter 4 for delete element Last");
            System.out.println("Enter 5 for display");
            System.out.println("Enter 6 for display reverse using recursive");
            System.out.println("Enter 7 for exit");
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
                    al.deleteFirst();
                    break;
                }
                case 4: {
                    al.deleteLast();
                    break;
                }
                case 5: {
                    al.display();
                    break;
                }
                case 6: {
                    al.displayRecursive(LinkedList.Head);
                    break;
                }
                case 7: {
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
}
