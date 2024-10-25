public class ForcrConvert{
	public static void main(String[] args) {
		// 演示强制类型转换
		int n1 = (int)1.9;
		System.out.println("n1=" + n1); // 1,造成精度损失

		int n2 = 2000;
		byte b1 = (byte)n2;
		System.out.println("b1=" + b1);// -48,造成数据溢出


		// 强制类型转换,使用小括号提升优先级

		// int x = (int)10 * 3.5 + 6 * 1.5;
		int x = (int)(10 * 3.5 + 6 * 1.5);
		System.out.println(x);
	}
}