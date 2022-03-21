import java.util.Scanner;
public class baekjoon_2530 {

	public static void main(String[] args) 
	{
		Scanner time = new Scanner(System.in);
		
		int hour, min, sec, timer, secNum, minNum;
		
		hour = time.nextInt();
		min = time.nextInt();
		sec = time.nextInt();
		timer = time.nextInt();
		
		min = min + timer / 60;
		sec = sec + timer % 60;
		
		if(sec >= 60)
		{
			secNum = sec / 60;
			min = min + secNum;
			while(sec >= 60)
			{
				sec = sec - 60;
			}
			if(min >= 60)
			{
				minNum = min / 60;
				hour = hour + minNum;
				while(min >= 60)
				{
					min = min - 60;
				}
			}
			while(hour >= 24)
			{
				hour = hour - 24;
			}
		}
		else if(min >= 60)
		{
			minNum = min / 60;
			hour = hour + minNum;
			while(min >= 60)
			{
				min = min - 60;
			}
			while(hour >= 24)
			{
				hour = hour - 24;
			}
		}
		
		System.out.print(hour + " " + min + " " + sec);
	}
}
