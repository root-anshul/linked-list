package link_list;
import java.util.Scanner;

public class ll {
	Scanner in =new Scanner(System.in);
	public class node{
		public node(int data2) {
			 data = data2;
		}
		int data;
		node next;
	}
	node head;
	public void print() {
		node temp=head;
	while(temp !=null) {
		System.out.println(temp.data+ "=>");
		temp=temp.next;
	}
	}
	public int size() {
		int size=0;
		node temp=head;
		while(temp !=null) {
			size++; 
			temp=temp.next;
			System.out.println(size);
		}
		return size;
	}
	public int getfirst() {
		if(isempty()) {
			throw new RuntimeException("no node at first");
		}
		return head.data;
	}

	private node getatnode(int idx) {
		if(idx < 0 ) {
			System.out.println("no node");
		}
		node temp=head;
		for(int i=1;i<=idx;i++) {
			temp=temp.next;
			
		}
		System.out.println(temp.data);
		return temp;
		
	}
	public void atlast(int data) {
		node nn =new node(data);
		if(isempty()) {
			head=nn;
			return;
			
		}
		node temp=head;
		while(temp.next!=null) {
			
			temp=temp.next;
		}
		 temp.next=nn;
	}
		public void first(int data) {
			node nn=new node(data);
			if(isempty()) {
				head=nn;
				return;
				
			}
			nn.next=head;
			head=nn;
			
		}
		
		public void atrandom(int idx,int data) {
			node prev=getatnode(idx-1);
			node after=prev.next; 
			node curr=new node(data);
			prev.next=curr;
			curr.next=after;
			
			
			
		}
		
		public boolean isempty(){
			return head==null;	
			
		}
		public int removelast() {
			node prev=getatnode(size()-2);
			node curr=prev.next;
			int data=curr.data;
			prev.next=null;
			
			return data;
		}
		
		
		public int removefirst() {
			int data=head.data;
			head=head.next;
			return data;
		}
		public void reverse() {
			node curr=head;
			node prev=null;
			while(curr!=null) {
				node after=curr.next;
				curr.next=prev;
				prev=curr;
				curr=after;
			}
		}
		
		
		
}
