/*
	DOubly Linked List
	methods :-
		1. addFirst(int x) --> add the element x at the first of list
		2. addLast(int x) --> add the element x aat the last of the list
		3. addBefore(int data, int target) --> add the element data at the before of the target
		4. addAfter(int data, int target) --> add the element data at the after of the target
		5. addBetween(int data, int target1, int target2) --> add the element data between the target1 and target2
		6. deleteFirst() --> delete the first element of the list
		7. deleteLast() --> delete the last element of the list
		8. deleteParticular() --> delete particular element data of the list
		9. display() --> it will print the list 
		   reverseDisplay() --> it will print the list in reverse order
*/
import java.util.*;
class DLL
{
	class Node 
	{
		int data;
		Node next;
		Node previous;
		Node(int data)
		{
			this.data = data;
			next = null;
			previous = null;
		}
	}
	Node Head = null;
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		DLL dll = new DLL();
		boolean b = true;
		while(b)
		{
			System.out.println("1. addFirst");
			System.out.println("2. addLast");
			System.out.println("3. addBefore");
			System.out.println("4. addAfter");
			System.out.println("5. addBetween");
			System.out.println("6. deleteFirst");
			System.out.println("7. deleteLast");
			System.out.println("8. deleteParticular");
			System.out.println("9. display");
			System.out.println("10. exit");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1 :
				{
					System.out.println("Enter the element you wnat to add first");
					int x = sc.nextInt();
					dll.addFirst(x);
					break;
				}
				case 2 :
				{
					System.out.println("Enter the element you wnat to add last");
					int x = sc.nextInt();
					dll.addLast(x);
					break;
				}
				case 3 :
				{
					System.out.println("Enter the element you wnat to add before");
					int x = sc.nextInt();
					System.out.println("Enter the target");
					int y = sc.nextInt();
					dll.addBefore(x,y);
					break;
				}
				case 4 :
				{
					System.out.println("Enter the element you wnat to add after");
					int x = sc.nextInt();
					System.out.println("Enter the target");
					int y = sc.nextInt();
					dll.addAfter(x,y);
					break;
				}
				case 5 :
				{
					System.out.println("Enter the element you wnat to add after");
					int x = sc.nextInt();
					System.out.println("Enter the target1");
					int y = sc.nextInt();
					System.out.println("Enter the target2");
					int z = sc.nextInt();
					dll.addBetween(x,y,z);
					break;
				}
				case 6:
				{
					dll.deleteFirst();
					break;
				}
				case 7 :
				{
					dll.deleteLast();
					break;
				}
				case 8 :
				{
					System.out.println("Enter the element you wnat to delete");
					int x = sc.nextInt();
					dll.deleteParticular(x);
					break;
				}
				case 9 :
				{
					dll.display();
					dll.reverseDisplay();
					break;
				}
				case 10 :
				{
					b = false;
					break;
				}
			}
		}
	}
	public void addFirst(int d)
	{
		Node n = new Node(d);
		if(Head == null)
		{
			Head = n;
		}
		else 
		{
			n.next = Head;
			Head.previous = n;
			Head = n;
		}
	}
	public void addLast(int d)
	{
		Node n = new Node(d);
		Node temp = Head;
		if(Head == null)
		{
			Head = n;
		}
		else 
		{
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = n;
			n.previous = temp;
		}
	}
	public void addBefore(int d, int target)
	{
		Node temp = Head;
		int flag = 0;
		while(temp.next != null)
		{
			if(temp.data == target)
			{
				flag = 1;
				break;
			}
			temp = temp.next;
		}
		if(flag == 0)
		{
			System.out.println("target doesnot exist");
		}
		else
		{
			Node n = new Node(d);
			if(Head.data == target)
			{
				Head.previous = n;
				n.next = Head;
				Head = n;
			}
			else
			{
				temp.previous.next = n;
				n.previous = temp.previous;
				n.next = temp;
				temp.previous = n;
			}
		}
	}
	public void addAfter(int d, int target)
	{
		Node temp = Head;
		int flag = 0;
		while(temp.next != null)
		{
			if(temp.data == target)
			{
				flag = 1;
				break;
			}
			temp = temp.next;
		}
		if(flag == 0)
		{
			System.out.println("target doesnot exist");
		}
		else
		{
			Node n = new Node(d);
			if(Head.data == target)
			{
				Head.next = n;
				n.previous = Head;
			}
			else
			{
				temp.next.previous = n;
				n.next = temp.next;
				temp.next = n;
				n.previous = temp;
			}
		}
	}
	public void addBetween(int d, int target1, int target2)
	{
		Node temp = Head;
		int flag = 0;
		while(temp != null)
		{
			if(temp.data == target1 && temp.next.data == target2)
			{
				flag = 1;
				break;
			}
			temp = temp.next;
		}
		if(flag == 0)
		{
			System.out.println("target doesnot exist");
		}
		else
		{
			Node n = new Node(d);
			temp.next.previous = n;
			n.next = temp.next;
			n.previous = temp;
			temp.next = n;
		}	
	}
	public void insertParticular(int d, int index)
	{
		Node temp = Head;
		int flag = 0;
		int i = 0;
		while(temp.next != null)
		{
			if(i == index)
			{
				flag = 1;
				break;
			}
			i++;
			temp = temp.next;
		}
		if(flag == 0)
		{
			System.out.println("target doesnot exist");
		}
		else
		{
			Node n = new Node(d);
			if(index == 1)	
			{
				Head.previous = n;
				n.next = Head;
				Head = n;
			}
			else
			{
				n.next = temp.next;
				temp.next.previous = n;
				temp.previous.next = n;
				n.previous = temp.previous;
			}
		}
	}
	public void deleteFirst()
	{
		if(Head == null)
		{
			System.out.println("List is empty");
		}
		else
		{
			Head = Head.next;
			Head.previous.next = null;
			Head.previous = null;
		}
	}
	public void deleteLast()
	{
		if(Head == null)
		{
			System.out.println("List is empty");
		}
		else
		{
			Node temp = Head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.previous.next = null;
			temp.previous = null;
		}
	}
	public void deleteParticular(int d)
	{
		Node temp = Head;
		if(Head == null)
		{
			System.out.println("List is empty");
		}
		else
		{
			int flag = 0;
			while(temp.next != null)
			{
				if(temp.data == d)
				{
					flag = 1;
					break;
				}
				temp = temp.next;
			}
			if(flag == 0)
			{
				System.out.println("target doesnot exist");
			}
			else
			{
				temp.previous.next = temp.next;
				temp.next.previous = temp.previous;
				temp.next = null;
				temp.previous = null;
			}
		}
	}
	public void display()
	{
		Node temp = Head;
		while(temp != null)
		{
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
		System.out.println();
	}
	public void reverseDisplay()
	{
		Node temp = Head;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		while(temp != null)
		{
			System.out.print(temp.data + " --> ");
			temp = temp.previous;
		}
		System.out.println();
	}
}