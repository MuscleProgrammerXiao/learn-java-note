public class ForcrConvert{
	public static void main(String[] args) {
		// ��ʾǿ������ת��
		int n1 = (int)1.9;
		System.out.println("n1=" + n1); // 1,��ɾ�����ʧ

		int n2 = 2000;
		byte b1 = (byte)n2;
		System.out.println("b1=" + b1);// -48,����������


		// ǿ������ת��,ʹ��С�����������ȼ�

		// int x = (int)10 * 3.5 + 6 * 1.5;
		int x = (int)(10 * 3.5 + 6 * 1.5);
		System.out.println(x);
	}
}