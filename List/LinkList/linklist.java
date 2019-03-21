public class linklist{

	private LNode head;

	class LNode{
		private char data;
		private LNode next;

		public LNode(char c,LNode next)
		{
			this.data=c;
			this.next=next;
		}

		public void setData(char c){this.data=c;}
		public void setNext(LNode next){this.next=next;}
		public char getData(){return this.data;}
		public LNode getNext(){return this.next;}

	}

	public void headInsert(String str)
	{
		head=new LNode('H',null);
		char[] chars=str.toCharArray();
		for(char c:chars)
		{
			LNode s=new LNode(c,head.getNext());
			head.setNext(s);
		}
	}

	public void rearInsert(String str){
	
		head=new LNode('H',null);
		char[] chars=str.toCharArray();
		LNode rear=head;
		for (char c:chars) {
			LNode s=new LNode(c,rear.getNext());
			rear.setNext(s);
			rear=s;
		}
	}

	public void printResult()
	{
		LNode rear=head.getNext();
		while(rear!=null)
		{
			System.out.print(rear.getData()+"\t");
			rear=rear.getNext();
		}
		System.out.println();
	}

	public static void main(String[] args)
	{

		linklist demo=new linklist();
		demo.headInsert("12345678910");
		demo.printResult();
		demo.rearInsert("12345678910");
		demo.printResult();
	}

}