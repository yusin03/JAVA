import java.util.Scanner;
public class baekjoon_2884 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int H, M;
		H = input.nextInt();
		M = input.nextInt();
		
		if(0 <= M && M < 45)
		{
			if(H == 0)
			{
				H = 23;
				M = 60 - (45 - M);
			}
			else
			{
				H = H - 1;
				M = 60 - (45 - M);
			}
		}
		else
		{
			M = M - 45;
		}
		
		System.out.print(H+ " " + M);
	}
}
