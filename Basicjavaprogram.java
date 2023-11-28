package Demo;
import java.util.Scanner;
public class Basicjavaprogram {
 public static void main(String[] args) {
	 int n,i;
	 System.out.println("Enter the number ?");
	 Scanner sc= new Scanner(System.in);
	n=sc.nextInt();
	int fact=1;
	for(i=1;i<=n;i++) {
	 fact=fact*i;
	}
 System.out.println(" the value is:"+(fact));
 }
}