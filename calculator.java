package Demo;

public class calculator {
	
		int add,sub;
		public void add(int a,int b) {
			add=a+b;
					
			}
		public static void main(String[] args) {
			calculator c=new calculator();
			c.add(3,4);
			System.out.println("The Sum of addition of two numbers are:"+c.add);

			c.sub(7,2);
			System.out.println("The Sum of addition of two numbers are:"+c.sub);
	
			}
		private void sub(int i, int j) {
		sub=i-j;
			
		}
}