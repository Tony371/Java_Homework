package week_1;

import java.util.Scanner;

public class Homework_2 {
	public static void main(String[] args){
		final double COSTOF_COLOR = 0.10;//ÿӢ��Ⱦɫ�ļ۸�
		final double COSTOF_FRAME = 0.15;//ÿӢ�߿�ܵļ۸�
		final double COSTOF_FANCY = 0.25;//ÿӢ�߾��¿�ܵļ۸�
		final double COSTOF_PAPER = 0.02;//ÿƽ��Ӣ��ʹ��ֽ��ļ۸�
		final double COSTOF_GLASS = 0.07;//ÿƽ��Ӣ��ʹ�ò����ļ۸�
		final double COSTOF_CROWN = 0.35;//ÿ�����û�װ�εļ۸�
		
		double Length;//��ܳ�
		double Width;//��ܿ�
		int type;//������ࡣ0��ʾ��ͨ�ģ�1��ʾ���µġ�
		String FrameColor;//�����ҪȾ����ɫ
		int Crown;//��Ҫ��������
		double total;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�����ܳ���");
		Length = scan.nextDouble();
		System.out.println("�����ܿ�");
		Width = scan.nextDouble();
		System.out.println("����������(0��ʾ��ͨ��1��ʾ����)��");
		type = scan.nextInt();
		System.out.println("���뻨������(>=0&&<=4)��");
		Crown = scan.nextInt();
		scan.nextLine();
		System.out.println("������ҪȾ����ɫ��");
		FrameColor = scan.next();
		if(type == 0){
			total = (Length+Width)*(COSTOF_FRAME+COSTOF_COLOR)+Length*Width*(COSTOF_PAPER+COSTOF_GLASS)+COSTOF_CROWN*Crown;
		}else
			total = (Length+Width)*(COSTOF_FANCY+COSTOF_COLOR)+Length*Width*(COSTOF_PAPER+COSTOF_GLASS)+COSTOF_CROWN*Crown;
		System.out.println("�����۸�Ϊ��"+total);

	}

}
