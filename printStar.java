import java.util.Scanner;

public class printStar {
	public static void main(String[] args) 
	{
		int n;
		
		System.out.println("请输入行数：");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		for (int i = 1; i < n; i++) // 第一行
		{ 
			for (int j = 0; j < n - i; j++) // 打空格
			{ 
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) 
			{
				System.out.print("* "); // 打*
			}
			System.out.println();
		}
		System.out.println("打印完成");
	}

}
