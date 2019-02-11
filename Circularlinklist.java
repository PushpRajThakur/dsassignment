import java.util.Scanner;
class node
{
	int data;
	node next;
}

public class Circularlinklist {
	node head;
    public	void insert(int data)
	{
		node n=new node();
		n.data=data;
		if(head==null)
		{
			head=n;
			n.next=head;
		}
		else
		{
			node temp=head;
			while(temp.next!=head)
			{
				temp=temp.next;
			}
			temp.next=n;
			n.next=head;
		}
		
	}
	void display()
	{
		node temp=head;
		while(temp.next!=head)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    Circularlinklist l=new Circularlinklist();
	    int d=s.nextInt();
	    for(int i=0;i<d;i++)
	    {
	    	int a=s.nextInt();
	    	l.insert(a);
	    }
	    l.display();
	}
}
