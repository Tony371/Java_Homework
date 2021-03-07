package week_1;

import java.util.Scanner;

public class Homework_2 {
	public static void main(String[] args){
		final double COSTOF_COLOR = 0.10;//每英尺染色的价格
		final double COSTOF_FRAME = 0.15;//每英尺框架的价格
		final double COSTOF_FANCY = 0.25;//每英尺精致框架的价格
		final double COSTOF_PAPER = 0.02;//每平方英尺使用纸板的价格
		final double COSTOF_GLASS = 0.07;//每平方英尺使用玻璃的价格
		final double COSTOF_CROWN = 0.35;//每个角用花装饰的价格
		
		double Length;//框架长
		double Width;//框架宽
		int type;//框架种类。0表示普通的，1表示精致的。
		String FrameColor;//框架需要染的颜色
		int Crown;//需要花的数量
		double total;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("输入框架长：");
		Length = scan.nextDouble();
		System.out.println("输入框架宽：");
		Width = scan.nextDouble();
		System.out.println("输入框架种类(0表示普通，1表示精致)：");
		type = scan.nextInt();
		System.out.println("输入花的数量(>=0&&<=4)：");
		Crown = scan.nextInt();
		scan.nextLine();
		System.out.println("输入需要染的颜色：");
		FrameColor = scan.next();
		if(type == 0){
			total = (Length+Width)*(COSTOF_FRAME+COSTOF_COLOR)+Length*Width*(COSTOF_PAPER+COSTOF_GLASS)+COSTOF_CROWN*Crown;
		}else
			total = (Length+Width)*(COSTOF_FANCY+COSTOF_COLOR)+Length*Width*(COSTOF_PAPER+COSTOF_GLASS)+COSTOF_CROWN*Crown;
		System.out.println("制作价格为："+total);

	}

}
