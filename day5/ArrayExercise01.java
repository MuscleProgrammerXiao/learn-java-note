public class ArrayExercise01{
	public static void main(String[] args) {
		//1.����һ��char���͵�26��Ԫ�ص����飬�ֱ� ���� 'A'-'Z'��ʹ��forѭ����������Ԫ�ز���ӡ������������char ������������ 'A' + 1 -> 'B'
		// char[] letterList= new char[26];
		// for(int i = 0; i < letterList.length ; i++){
		// 	letterList[i] = (char)('A' + i);
		// }
		// System.out.println("===letterList����===");
		// for (int i = 0;i<letterList.length ;i++ ) {
		// 	System.out.println(letterList[i] + "  ");
		// }


		//2.�����һ������int[]�����ֵ {4,-1,9,10,23}�����õ���Ӧ���±ꡣ
		// int [] list = {4,-1,9,10,23};
		// int max = list[0];
		// int index = 0;
		// for(int i = 0;i<list.length;i++){
		// 	if(list[i]>=max){
		// 		max=list[i];
		// 		index = i;
		// 	}
		// }
		// System.out.println("���ֵ"+max+"�±�"+index); //���ֵ23�±�4

		
		//3.�����һ������ĺͣ�ƽ��ֵ
		// int [] list = {4,-1,9,10,23};
		// int total = 0;
		// for(int i=0;i<list.length;i++){
		// 	total += list[i];
		// }
		// System.out.println("����ĺ�:"+total+"ƽ��ֵ:"+total/list.length);//����ĺ�:45ƽ��ֵ:9
	}
}