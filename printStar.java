import java.util.Scanner;

public class printStar {
	public static void main(String[] args) 
	{
		int n;
		
		System.out.println("������������");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		for (int i = 1; i < n; i++) // ��һ��
		{ 
			for (int j = 0; j < n - i; j++) // ��ո�
			{ 
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) 
			{
				System.out.print("* "); // ��*
			}
			System.out.println();
		}
		System.out.println("��ӡ���");
	}

}
