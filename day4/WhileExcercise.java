public class WhileExcercise{
	public static void main(String[] args) {
		// 1.��ӡ 1-100 ֮�������ܱ�3����������ʹ��while��
		int i = 1;
		while(i<=100){
			if(i%3==0){
				System.out.println("�ܱ�3����������"+i);
			}
			i++;
		}
		// 2.��ӡ 40-200 ֮�����е�ż��ʹ��while���κ���ϰ��
		int k = 40;
		while(k<=200){
			if(k%2==0){
				System.out.println("40-200֮�����е�ż��:"+ k);
			}
			k++;
		}
	}
}