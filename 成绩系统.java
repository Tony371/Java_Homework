import java.util.Scanner;

public class �ɼ�ϵͳ {
	public static int score[];

	public static void main(String[] args) {

		int choose = menu(); // �˵�
		while (choose != 5) { // ��ѡ��Ĳ���1-5ʱ��һֱѭ��
			switch (choose) {
			case 1:
				enterResults();
				break;
			case 2:
				if (score == null) {
					System.out.println("û������ɼ�����ѡ��1"); // ���ɼ�Ϊ��ʱ��ѡ��1¼��ɼ�
					break;
				} else
					classAverage(score); // �ɼ���Ϊ��ʱ����ƽ����
				break;
			case 3:
				if (score == null) {
					System.out.println("û������ɼ�����ѡ��1");
					break;
				} else
					highestGrade(score); // ����߷�
				break;
			case 4:
				if (score == null) {
					System.out.println("û������ɼ�����ѡ��1");
					break;
				} else
					lowestGrade(score); // ����ͷ�
				break;
			default:
				System.out.println("���������������");
			}
			choose = menu();
		}
		System.out.println("�ټ�");
	}

	public static int menu() {
		int choice = 0;
		System.out.println("******************");
		System.out.println("***1.����ѧ���ɼ�*****");
		System.out.println("***2.��ƽ����********");
		System.out.println("***3.����߷�********");
		System.out.println("***4.����ͷ�********");
		System.out.println("***5.�˳�***********");
		System.out.println("��ѡ��1~5��");
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		return choice;
	}

	public static void enterResults() { // ����ѧ���ɼ�
		score = new int[5];
		int flag = 1;
		for (int i = 0; i < score.length; i++) {
			System.out.println("�������" + (i + 1) + "��ͬѧ�ɼ�");
			flag = 1;
			while (flag == 1) {
				Scanner scan = new Scanner(System.in);
				score[i] = scan.nextInt();
				if (score[i] <= 0 || score[i] > 100)
					System.out.println("������󣡣�����");
				else
					flag = 0;
			}
		}

	}

	public static void classAverage(int score[]) { // ��ƽ����

		double sum = 0, avg;
		for (int i = 0; i < score.length; i++) {
			sum = sum + score[i];
		}
		avg = sum / score.length;
		System.out.println("ƽ���ɼ�Ϊ��" + avg);

	}

	public static void highestGrade(int score[]) { // ����߷�
		int num;
		num = score[0];
		for (int i = 0; i < score.length; i++) {
			if (score[i] > num)
				num = score[i];
		}
		System.out.println("��߷�Ϊ��" + num);
	}

	public static void lowestGrade(int score[]) { // ����ͷ�
		int num;
		num = score[0];
		for (int i = 0; i < score.length; i++) {
			if (score[i] < num)
				num = score[i];
		}
		System.out.println("��ͷ�Ϊ��" + num);

	}

}
