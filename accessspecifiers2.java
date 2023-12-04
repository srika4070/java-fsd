package Demo;
class priaccessspecifier 
{ 
	void display() {
		System.out.println("You are using private access specifier"); 
	}
} 

public class accessspecifiers2 {


	public static void main(String[] args) {
		//private
		System.out.println("Private Access Specifier");
		priaccessspecifier obj=new priaccessspecifier();
		obj.display();
	}
}
