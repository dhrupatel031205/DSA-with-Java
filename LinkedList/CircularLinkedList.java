/*
	Name : Patel Dhruv R.
 	Date : 05/06/24
	Circular Linked List --> This linked list will behave as a singly linked list but here is only one exaption is that ther is last and first Node are joined.
	methods :-
		1. addFirst(int data) --> add data as the first node of the list
		2. addLast(int data) --> add data as the last node of the list
		3. addParticularIndex(int data, int index) --> add the data at the index
		4. deleteFirst() --> delete the first node of the list
		5. deleteLast() --> delete the last node of the list
		6. deletePerticular(int data) --> delete the data of the list
		7. displayUsingRecursion(Node n) --> print the reverse list using recursion
		8. display() --> display the full list
		9. search(int data) --> it will check that data exits or not
		10. addBetween(int data, int target1, int target2) --> add data between target1 and target2
		11. addAfter(int data, int target) --> add data after the target
		12. addBefore(int data, int target) --> add data before the target
*/
import java.util.*;
class List
{
	// class Node --> for making node
	static class Node 
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data = data;
			next = null;
		}
	}
	// Head pointor
	static Node Head = null;
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		while(b)
		{
			// calling different methods using while loop and switch case
			System.out.println("1. add first");
			System.out.println("2. add last");
			System.out.println("3. add before");
			System.out.println("4. add after");
			System.out.println("5. add particular index");
			System.out.println("6. add between");
			System.out.println("7. delete first");
			System.out.println("8. delete last");
			System.out.println("9. delete particular ");
			System.out.println("10. search element");
			System.out.println("11. display");
			System.out.println("12. display reverse");
			System.out.println("13. exit");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1 :
				{
					System.out.println("Enter the element you want to add");
					int x = sc.nextInt();
					addFirst(x);
					System.out.println("Element added successfully");
					break;
				}
				case 2 :
				{
					System.out.println("Enter the element you want to add");
					int x = sc.nextInt();
					addLast(x);
					System.out.println("Element added successfully");
					break;
				}
				case 3 :
				{
					System.out.println("Enter the data you want to add");
					int x = sc.nextInt();
					System.out.println("Enter the target");
					int y = sc.nextInt();
					addBefore(x,y);
					System.out.println("Element added successfully");
					break;
				}
				case 4 :
				{
					System.out.println("Enter the data you want to add");
					int x = sc.nextInt();
					System.out.println("Enter the target");
					int y = sc.nextInt();
					addAfter(x,y);
					System.out.println("Element added successfully");
					break;
				}
				case 5 :
				{
					System.out.println("Enter the element you want to add");
					int x = sc.nextInt();
					System.out.println("Enter the index");
					int y = sc.nextInt();
					addParticularIndex(x,y);
					System.out.println("Element added successfully");
					break;
				}
				case 6 :
				{
					System.out.println("Enter the element you want to add");
					int x = sc.nextInt();
					System.out.println("Enter the target 1");
					int y = sc.nextInt();
					System.out.println("Enter the target 2");
					int z = sc.nextInt();
					addBetween(x,y,z);
					System.out.println("Element added successfully");
					break;
				}
				case 7 :
				{
					deleteFirst();
					System.out.println("Element removed successfully");
					break;
				}
				case 8 :
				{
					deleteLast();
					System.out.println("Element removed successfully");
					break;
				}
				case 9 :
				{
					System.out.println("Enter the element you want to delete");
					int x = sc.nextInt();
					deletePerticular(x);
					System.out.println("Element removed successfully");
					break;
				}
				case 10 :
				{
					System.out.println("Enter the element you want to search");
					int x = sc.nextInt();
					search(x);
					break;
				}
				case 11 :
				{
					display();
					break;
				}
				case 12 :
				{
					displayUsingRecursion(Head);
					System.out.println();
					break;
				}
				case 13 :
				{
					b = false;
					break;
				}
				default :
				{
					System.out.println("THANKS for using my program!!");
					break;
				}
			}
		}
	}
	// addFirst(int d) method for add the element d at the head pointor
	public static void addFirst(int d)
	{
		// creating the new node 
		Node n1 = new Node(d);
		// if list is empty
		if(Head == null)
		{
			Head = n1;
			Head.next = n1;
		}
		else
		{
			n1.next = Head;
			// temp pointor for traverse the list and go at the last node 
			Node temp = Head;
			while(temp.next != Head)
			{
				temp = temp.next;
			}
			temp.next = n1;
			Head = n1;
		}
	}
	public static void addLast(int d)
	{
		// creating the new node 		
		Node n1 = new Node(d);
		// if list is empty
		if(Head == null)
		{
			Head = n1;
			Head = Head.next;
		}
		else
		{
			Node temp = Head;
			while(temp.next != Head)
			{
				temp = temp.next;
			}
			temp.next = n1;
			n1.next = Head;
		}
	}
	public static void addBefore(int d, int target)
	{
		int flag = 0;
		Node temp = Head;
		do
		{
			if(temp.data == target)
			{
				flag = 1;
				break;
			}
			temp = temp.next;
		}while(temp != Head);
		if(flag == 0)
		{
			System.out.println("target doesnot exist");
		}
		else
		{
			// creating the new node 
			Node n = new Node(d);
			Node t = Head;
			while(t.next.data != target)
			{
				t = t.next;
			}
			n.next = t.next;
			t.next = n;
		}
	}
	public static void addAfter(int d, int target)
	{
		int flag = 0;
		Node temp = Head;
		do
		{
			if(temp.data == target)
			{
				flag = 1;
				break;
			}
			temp = temp.next;
		}while(temp != Head);
		if(flag == 0)
		{
			System.out.println("target doesnot exist");
		}
		else
		{
			// creating the new node 
			Node n = new Node(d);
			Node t = Head;
			while(t.data != target)
			{
				t = t.next;
			}
			n.next = t.next;
			t.next = n;
		}
	}
	public static void addParticularIndex(int data, int index)
	{
		Node temp = Head;
		// creating the new node 
		Node n = new Node(data);
		if(index == 1)
		{
			n.next = Head;
			while(temp.next != Head)
			{
				temp = temp.next;
			}
			temp.next = n;
			Head = n;
		}
		else
		{
			for(int i = 1;i <index -1;i++)
			{
				temp = temp.next;
			}
			n.next = temp.next;
			temp.next = n;
		}
	}
	public static void addBetween(int d, int a, int b)
	{
		// creating the new node 
		Node n = new Node(d);
		Node temp = Head;
		int flag = 0;
		do
		{
			if(temp.data == a && temp.next.data == b)
			{
				flag = 1;
				break;
			}
			temp = temp.next;
		}while(temp != Head);
		if(flag == 0)
		{
			System.out.println("target doesnot exist");
		}
		else
		{
			Node t = Head;
			while(t.next.data != b)
			{
				t = t.next;
			}
			n.next = t.next;
			t.next = n;
		}
	}
	public static void search(int target)
	{
		if(Head == null)
		{
			System.out.println("List is empty");
		}
		else
		{
			int flag = 0;
			Node temp = Head;
			do
			{
				if(temp.data == target)
				{
					flag = 1;
				}
				temp = temp.next;
			}while(temp != Head);
			if(flag == 0)
			{
				System.out.println("Target doesnot exist in the list");
			}
			else
			{
				System.out.println("Target exist in the list");
			}
		}
	}
	public static void deleteFirst()
	{
		if(Head == null)
		{
			System.out.println("List is empty");
		}
		else if(Head.next == Head)
		{
			Head = null;
		}
		else
		{
			Node temp = Head;
			Node del = Head;
			while(temp.next != Head)
			{
				temp = temp.next;
			}
			temp.next = Head.next;
			Head = Head.next;
			del.next = null;
		}
	}
	public static void deleteLast()
	{
		if(Head == null)
		{
			System.out.println("List is empty");
		}
		else if(Head.next == Head)
		{
			Head = null;
		}
		else
		{
			Node temp = Head;
			while(temp.next.next != Head)
			{
				temp = temp.next;
			}
			Node del = temp.next;
			temp.next = Head;
			del.next = null;
		}
	}
	public static void deletePerticular(int d)
	{
		int flag = 0;
		Node temp = Head;
		do
		{
			if(temp.data == d)
			{
				flag = 1;
			}
			temp = temp.next;
		}while(temp != Head);
		if(flag == 0)
		{
			System.out.println("The element doesnot exist");
		}
		else
		{
			if(Head.data == d)
			{
				Node del = Head;
				Node deltemp = Head;
				while(deltemp.next != Head)
				{
					deltemp = deltemp.next;
				}				
				deltemp.next = Head.next;
				Head = Head.next;
				del.next = null;
			}
			else
			{
				Node dummy = Head;
				while(dummy.next != Head)
				{
					dummy = dummy.next;
				}
				Node del = dummy.next;
				dummy.next = del.next;
				del.next = null;
			}
		}
	}
	public static void display()
	{
		Node temp = Head;
		while(temp.next != Head)
		{
			System.out.print(temp.data+" --> ");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}	
	public static void displayUsingRecursion(Node temp)
	{
		if(temp.next != Head)
		{
			displayUsingRecursion(temp.next);
			System.out.print(temp.data + " --> ");
		}
		else
		{
			System.out.print(temp.data + " --> ");
			return;
		}
	}
}
