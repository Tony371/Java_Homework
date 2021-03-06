import java.util.Scanner;

public class 成绩系统 {
	public static int score[];

	public static void main(String[] args) {

		int choose = menu(); // 菜单
		while (choose != 5) { // 当选择的不是1-5时，一直循环
			switch (choose) {
			case 1:
				enterResults();
				break;
			case 2:
				if (score == null) {
					System.out.println("没有输入成绩，请选择1"); // 当成绩为空时，选择1录入成绩
					break;
				} else
					classAverage(score); // 成绩不为空时，求平均分
				break;
			case 3:
				if (score == null) {
					System.out.println("没有输入成绩，请选择1");
					break;
				} else
					highestGrade(score); // 求最高分
				break;
			case 4:
				if (score == null) {
					System.out.println("没有输入成绩，请选择1");
					break;
				} else
					lowestGrade(score); // 求最低分
				break;
			default:
				System.out.println("输入错误，重新输入");
			}
			choose = menu();
		}
		System.out.println("再见");
	}

	public static int menu() {
		int choice = 0;
		System.out.println("******************");
		System.out.println("***1.输入学生成绩*****");
		System.out.println("***2.求平均分********");
		System.out.println("***3.求最高分********");
		System.out.println("***4.求最低分********");
		System.out.println("***5.退出***********");
		System.out.println("请选择（1~5）");
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		return choice;
	}

	public static void enterResults() { // 输入学生成绩
		score = new int[5];
		int flag = 1;
		for (int i = 0; i < score.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个同学成绩");
			flag = 1;
			while (flag == 1) {
				Scanner scan = new Scanner(System.in);
				score[i] = scan.nextInt();
				if (score[i] <= 0 || score[i] > 100)
					System.out.println("输入错误！！！！");
				else
					flag = 0;
			}
		}

	}

	public static void classAverage(int score[]) { // 求平均分

		double sum = 0, avg;
		for (int i = 0; i < score.length; i++) {
			sum = sum + score[i];
		}
		avg = sum / score.length;
		System.out.println("平均成绩为：" + avg);

	}

	public static void highestGrade(int score[]) { // 求最高分
		int num;
		num = score[0];
		for (int i = 0; i < score.length; i++) {
			if (score[i] > num)
				num = score[i];
		}
		System.out.println("最高分为：" + num);
	}

	public static void lowestGrade(int score[]) { // 求最低分
		int num;
		num = score[0];
		for (int i = 0; i < score.length; i++) {
			if (score[i] < num)
				num = score[i];
		}
		System.out.println("最低分为：" + num);

	}

}
