import java.util.Scanner;
public class BreakExercise{
	public static void main(String[] args) {
		// 1. 1-100���ڵ�����ͣ���� ���� ��һ�δ���20�ĵ�ǰ����
		// int total = 0;
		// for(int i = 1;i<=100;i++){
		// 	total += i;
		// 	if(total > 20){
		// 		System.out.println("��ǰ��Ϊ"+i);
		// 		break;
		// 	}
		// }
		// ʵ�ֵ�¼��֤ �������λ��ᣬ����û���Ϊ "����",���� "666"��ʾ��¼�ɹ�,������ʾ���м��λ��ᣨfor + break��
		Scanner myScanner = new Scanner(System.in);
		String userName = "";
		String passward = "";
		for(int i = 2;i>=0;i--){
			System.out.println("�������û���");
			userName = myScanner.next();
			System.out.println("����������");
			passward = myScanner.next();
			if("����".equals(userName)  &&  "666".equals(passward)){
				System.out.println("��¼�ɹ���");
				break;
			}else {
				System.out.println("�û������������󣬻�ʣ" + i + "���������");
			}
		}
	}
}