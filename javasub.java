package Demo;

public class javasub {
	int sub;
	public void sub(int a,int b) {
		sub=a-b;
	}
	public static void main(String[] args) {
		calculator c=new calculator();
		c.sub(7,3);
		System.out.println("The substraction of two numbers are:"+c.sub);

	}

}


