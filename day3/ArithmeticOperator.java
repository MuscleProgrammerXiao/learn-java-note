/**
 * ��ʾ�����������ʹ��
 * */
public class ArithmeticOperator{

	// ��дһ��main����
	public static void main(String[] args) {
		// ʹ��
		System.out.println(10 / 4); 	//2,�����������ᱣ�����ȵ�����
		System.out.println(10.0 /4);	//java��2.5
		double d = 10 / 4;
		System.out.println(d); 			//java�� 10/4=2��2=>2.0


		// % ȡģ��ȡ��
		// ��%�ı��ʣ���һ����ʽ a % b = a - a / b * b
		System.out.println(10 %  3);	// 1
		System.out.println(-10 % 3);	//-1
		System.out.println(10 % -3);	// 1
		System.out.println(-10 %-3);	//-1


		// ++��ʹ��
		// ����ʹ��
		int i = 10;
		i++;	//���� �ȼ��� i = i + 1; => i = 11
		++i;	//���� �ȼ��� i = i + 1; => i = 12
		System.out.println("i=" + i);	//12


		/**
		 * ��Ϊ���ʽʹ��
		 * ǰ++��++i��������ֵ
		 * ��++��i++�ȸ�ֵ������
		 * */
		 int j = 8;
		 // int k = ++j;//�ȼ� j=j+1;k=j;		k=9;j=9;
		 int k = j++;//�ȼ� k=j;j=j+1;	k=8;j=9;
		 System.out.println("k=" + k + "j=" + j); // 8 9 
	}
}