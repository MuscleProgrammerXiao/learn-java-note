public class ArithmeticOperatorExercise02{
	public static void main(String[] args) {
		// 1.���绹��59��ż٣��ʺ�xx��������xx��
		int holiday = 59;
		int week = holiday / 7;
		int day = holiday % 7;
		System.out.println("��"+week+"��������"+day+"��"); //��8��������3��
		// 2.����һ���������滪���¶ȣ������¶�ת�������¶ȵĹ�ʽΪ�� 5/9*(�����¶�-100)������������¶ȶ�Ӧ�������¶ȡ�[234.5]
		double fahrenheit = 234.5;//����һ�������¶�
		double celsius = 5.0 / 9 * (fahrenheit - 100);
		System.out.println("�����¶�Ϊ"+celsius); //�����¶�Ϊ74.72222222222223
	}
}