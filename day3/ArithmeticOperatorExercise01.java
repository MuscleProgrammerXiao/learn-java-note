/**
 * ��ϰ��
 * */

public class ArithmeticOperatorExercise01{
	public static void main(String[] args) {
		//��ϰ��1
		// int i = 1;
		// i=i++;//����ʹ����ʱ��������1��temp=i;��2��i=i+1;��3��i=temp;
		// System.out.println(i);//1

		// int k = 1;
		// k=++k;//����ʹ����ʱ��������1��k=k+1;��2��temp=k;��3��k=temp;
		// System.out.println(k);//2


		//��ϰ��2
		int i1 = 10;
		int i2 = 20;
		int i = i1++;
		System.out.println("i="+i);		// 10
		System.out.println("i2="+i2);	// 20

		i=--i2;
		System.out.println("i="+i);		// 19
		System.out.println("i2="+i2);	// 19

	}
}