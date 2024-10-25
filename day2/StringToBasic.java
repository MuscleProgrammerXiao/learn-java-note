public class StringToBasic{
	public static void main(String[] args) {
		// 基本类型 --> String
		int n1 = 100;
		float n2 = 1.1f;
		double n3 = 3.4;
		boolean b1 = true;
		String str1 = n1 + "";
		String str2 = n2 + "";
		String str3 = n3 + "";
		String str4 = b1 + "";
		System.out.println(str1 + "" + str2 + "" + str3 + "" + str4);

		// String --> 对应的基本数据类型
		String s5 = "123";
		int num1 = Integer.parseInt(s5);
		double num2 = Double.parseDouble(s5);
		float num3 = Float.parseFloat(s5);
		long num4 = Long.parseLong(s5);
		byte num5 = Byte.parseByte(s5);
		boolean b = Boolean.parseBoolean("true");
		short num6 = Short.parseShort(s5);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(b);
		System.out.println(num6);
	}
}