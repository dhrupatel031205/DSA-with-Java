/*
    Name : Dhruv Patel
    Aim : Singly Linked List
    Basic Methods :-
        1. addFirst(int x) --> Add the x element at first of the list
		2. addLast(int x) --> Add the x element at the last of the list
		3. deleteFirst() --> Delete the first element of the list
		4. deleteLast() --> Delete the last element of the list
		5. addBefore(int x, int y) --> Add the x element before the y index of the list
		6. addAfter(int x, int y) --> Add the x element after the y index of the list
		7. display() --> display the whole List
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

    // insertBefore(int x, int y)
    void insertBefore(int x, int y) {
        Node dummy = Head;
        int flag = 0;
        Node temp = Head;
        // logic for check that perticular data exist or not
        while (temp != null) {
            if (temp.data == x) {
                flag = 1;
            }
            temp = temp.next;
        }
        if (flag == 0) {
            System.out.println("Element is not exist in the list");
        } else {
            // logic for add the y data before x
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

    // insertAfter(int x, int y)
    void insertAfter(int x, int y) {
        Node dummy = Head;
        int flag = 0;
        Node temp = Head;
        // logic for check that perticular data exist or not
        while (temp != null) {
            if (temp.data == x) {
                flag = 1;
            }
            temp = temp.next;
        }
        if (flag == 0) {
            System.out.println("Element is not exist in the list");
        } else {
            // logic for add the y data after x
            Node n1 = new Node(y);
            while (dummy.data != x) {
                dummy = dummy.next;
            }
            n1.next = dummy.next;
            dummy.next = n1;
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
}

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean b = true;
        LinkedList al = new LinkedList();
        while (b) {
            System.out.println("Enter 1 for add element at first");
            System.out.println("Enter 2 for add element at last");
            System.out.println("Enter 3 for add element before");
            System.out.println("Enter 4 for add element after");
            System.out.println("Enter 5 for delete element at first");
            System.out.println("Enter 6 for delete element Last");
            System.out.println("Enter 7 for display");
            System.out.println("Enter 8 for exit");
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
                    al.display();
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
}