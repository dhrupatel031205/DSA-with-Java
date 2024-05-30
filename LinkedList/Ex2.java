/*
    Name : Dhruv Patel
    Date : 30/05/24
    Aim : Singly Linked List
    detectLoop() --> returns that loop is exist in the list or not
*/
class LinkedList3 {
    // class Node for make the Node
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Head pointor --> point the first node of the list
    static Node Head = null;

    // detectLoop() --> boolean
    static boolean detectLoop() {
        Node fastPointor = Head;
        Node slowPointor = Head;
        while (fastPointor != null && fastPointor.next != null) {
            fastPointor = fastPointor.next.next;
            slowPointor = slowPointor.next;
            if (slowPointor == fastPointor) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n3;
        boolean b = LinkedList3.detectLoop();
        System.out.println(b);
    }
}