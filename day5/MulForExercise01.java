/**
 * ����ѭ����ϰ��
 * */
import java.util.Scanner;		
public class MulForExercise01{
	public static void main(String[] args) {
		//1.ͳ��3����ɼ������ÿ������5��ͬѧ������������ƽ���ֺ����а༶��ƽ����[ѧ���ĳɼ��Ӽ�������]
		//2.ͳ��3���༰������
		Scanner myScanner = new Scanner(System.in);
		int count = 0;
		int totalJigeNum = 0;
		int jigeNum = 0;
		for (int j = 1;j<=3 ;j++ ) {
			double sum = 0;
			for(int i = 1; i <= 5 ; i++){
				System.out.println("�������" + j + "���༶�ĵ�" + i + "��ѧ���ĳɼ�");
				double score = myScanner.nextDouble();
				if(score >= 60){
					jigeNum++;
				}
				sum += score;
				System.out.println("�ɼ�Ϊ"+ score);
			}
			count += sum;
			totalJigeNum += jigeNum;
			System.out.println("ƽ���ɼ�Ϊ"+ (sum/5));
			System.out.println("��������Ϊ"+ jigeNum);
			jigeNum=0;
		}
		System.out.println("���а༶��ƽ����"+ (count/15));
		System.out.println("���а༶�ļ�������"+ totalJigeNum);

		//99�˷���
		// for(int i =1;i<10;i++){
		// 	for (int j = 1 ; j<10 ; j++ ) {
		// 		System.out.println(i + " x " + j + " = " + i*j);
		// 	}
		// 		System.out.println("\n");

		// }
	}
}