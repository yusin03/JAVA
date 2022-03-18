import java.util.Scanner;
public class Main {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int x, y, a, b, c, d;
		
		x = input.nextInt();
		y = input.nextInt();
		
		a = x * (y % 10);
		b = x * ((y / 10) % 10);
		c = x * (y / 100);
		d = x * y;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
