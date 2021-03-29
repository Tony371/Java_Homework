package JavaTest;

public class Week4_Student {
	private String name;
	private String phoNum;
	private String stuNum;

	public Week4_Student() {
		this.name = "null";
		this.phoNum = "666";
		this.stuNum = "666";
	}

	public Week4_Student(String name, String phoNum, String stuNum) {
		this.name = name;
		this.phoNum = phoNum;
		this.stuNum = stuNum;
	}

	public void getMessage(String name, String phoNum, String stuNum) {
		this.name = name;
		this.phoNum = phoNum;
		this.stuNum = stuNum;
	}

	public void displayStudent() {
		String info = "";
		info = "学生姓名：" + this.name + "    学生电话：" + this.phoNum + "    学生学号：" + this.stuNum;
		System.out.println(info);
	}

	public static void main(String[] args) {

		Week4_Student a = new Week4_Student();
		Week4_Student b = new Week4_Student();
		Week4_Student c = new Week4_Student();

		a.getMessage("lvhao", "1598795414", "1904240721");
		b.getMessage("xiaobang", "15982865741", "1907240212");
		c.getMessage("JJ", "1567894545", "1902210524");
		a.displayStudent();
		b.displayStudent();
		c.displayStudent();

	}
}
