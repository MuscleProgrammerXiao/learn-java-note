import java.util.Scanner;

public class Input{
	public static void main(String[] args) {
		// 演示接受用户的输入
		// 步骤
		// Scanner类 表示 简单文本扫描器，在java.util 包
		// 1. 引入/导入 Scanner类所在的包
		// 2. 创建 Scanner 对象，new 创建一个

		Scanner myScanner = new Scanner(System.in);
		// 3. 接收用户输入了， 使用 相关的方法
		System.out.println("请输入名字");
		String  name = myScanner.next(); //接收用户输入
		System.out.println("请输入年龄");
		int age = myScanner.nextInt(); //接收用户输入
	}
}