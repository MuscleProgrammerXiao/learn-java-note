public class ArrayExercise01{
	public static void main(String[] args) {
		//1.创建一个char类型的26个元素的数组，分别 放置 'A'-'Z'。使用for循环访问所有元素并打印出来。提升：char 类型数据运算 'A' + 1 -> 'B'
		// char[] letterList= new char[26];
		// for(int i = 0; i < letterList.length ; i++){
		// 	letterList[i] = (char)('A' + i);
		// }
		// System.out.println("===letterList数组===");
		// for (int i = 0;i<letterList.length ;i++ ) {
		// 	System.out.println(letterList[i] + "  ");
		// }


		//2.请求出一个数组int[]的最大值 {4,-1,9,10,23}，并得到对应的下标。
		// int [] list = {4,-1,9,10,23};
		// int max = list[0];
		// int index = 0;
		// for(int i = 0;i<list.length;i++){
		// 	if(list[i]>=max){
		// 		max=list[i];
		// 		index = i;
		// 	}
		// }
		// System.out.println("最大值"+max+"下标"+index); //最大值23下标4

		
		//3.请求出一个数组的和，平均值
		// int [] list = {4,-1,9,10,23};
		// int total = 0;
		// for(int i=0;i<list.length;i++){
		// 	total += list[i];
		// }
		// System.out.println("数组的和:"+total+"平均值:"+total/list.length);//数组的和:45平均值:9
	}
}