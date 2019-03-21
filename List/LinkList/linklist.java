public class linklist{

	private LNode head=new LNode('H',null);

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

	public linklist(String str){
	
		char[] chars=str.toCharArray();
		for (char c:chars) {
			LNode s=new LNode(c,head.getNext());
			head.setNext(s);
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
	}

	public static void main(String[] args)
	{

		linklist demo=new linklist("123456789");
		demo.printResult();
	}

}