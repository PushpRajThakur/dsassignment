class node{
	 int data;
	 node next;
 }
public class linkedlist {
	node start;
 void insert(int data)
	{
	node n=new node();
	n.data=data;
	n.next=null;
	if(start==null)
	{
		start=n;
	}
	else
	{
		node t= start;
		while(t.next!=null)
		{
			t=t.next;	
		}
		t.next=n;	
	}
	}
 void addnode(int data)
 {
	 node a = new node();
	 a.data=data;
	 a.next=start;
	 start=a;
 }
 void display()
 { node t=start;
	 while(t!=null)
	 {
	System.out.println(t.data);
	 t=t.next;
	 }
 }
	public static void main(String[] args)
	{
	linkedlist obj=new linkedlist();
	for(int i=1;i<=10;i++)
	obj.insert(i);
	obj.addnode(10);
    obj.display();
	}

}