import java.util.Scanner;

public class firstNum {
	public static int firstNum, secondNum;

	public static void main(String[] args) {

		int choose = menu();
		while (choose != 6) 
		{
			switch (choose) {
			case 1:
				input();
				break;
			case 2:
				function1(firstNum, secondNum);
				break;
			case 3:
				function2(firstNum, secondNum);
				break;
			case 4:
				function3(firstNum, secondNum);
				break;
			case 5:
				function4(firstNum, secondNum);
				break;
			default:
				System.out.println("���������������");
			}
			choose = menu();
		}
		System.out.println("���˳�");
	}

	public static int menu() {
		int choice = 0;
		System.out.println("1.����");
		System.out.println("2.��ʾ������֮�����������");
		System.out.println("3.���������֮�������ż���ĺ�");
		System.out.println("4.���1~10֮�����������Լ����ǵ�ƽ��");
		System.out.println("5.�����������֮������������ƽ����");
		System.out.println("6.�˳�");
		System.out.println("�����루1~6��");
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		return choice;
	}

	public static void input() {
		int flag = 1;
		while (flag == 1) {
			System.out.println("�����������������ҵ�һ������С�ڵڶ���");
			Scanner scan = new Scanner(System.in);
			firstNum = scan.nextInt();
			secondNum = scan.nextInt();
			if (firstNum < secondNum)
				flag = 0;
			else
				System.out.println("���������������");
		}
	}

	public static void function1(int m, int n) { // ��ʾ������֮�����������
		for (int i = firstNum; i <= secondNum; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
			if (i % 10 == 0)
				System.out.println(",");
		}
	}

	public static void function2(int m, int n) { // ���������֮�������ż���ĺ�
		int sum = 0;
		for (int i = firstNum; i <= secondNum; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("ż����Ϊ��" + sum);
	}

	public static void function3(int m, int n) { // ���1~10֮�����������Լ����ǵ�ƽ��
		double x;
		for (int i = 1; i <= 10; i++) {
			x = Math.pow(i, 2);
			System.out.println(i + "��ƽ��Ϊ" + x);
		}
	}

	public static void function4(int m, int n) { // �����������֮������������ƽ����
		double x, sum = 0;
		for (int i = firstNum; i <= secondNum; i++) {
			if (i % 2 != 0) {
				x = Math.pow(i, 2);
				sum = sum + x;
			}
		}
		System.out.println("ƽ����Ϊ" + sum);
	}

}