public class DoWhileExercise01{
	public static void main(String[] args) {
		// 1.��ӡ1-100
		// int i = 1;
		// do{
		// 	System.out.println("i��"+i);
		// 	i++;
		// }while(i<=100);


		// 2.ͳ��1-100�ĺ�
		// int i = 1;
		// int num = 0;
		// do{
		// 	num += i;
		// 	if( i == 100 ){
		// 		System.out.println("num��"+num);  //5050
		// 	}
		// 	i++;
		// }while(i<=100);

		// 3.ͳ��1-200֮���ܱ�5���������ܱ�3�����ĸ���
		int i = 1;
		do{
			if( i%5==0 && i%3 != 0){
				System.out.println("��5���������ܱ�3����"+i);  
			}
			i++;
		}while(i < 200);


	}
}