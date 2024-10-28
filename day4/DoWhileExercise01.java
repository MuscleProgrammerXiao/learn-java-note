public class DoWhileExercise01{
	public static void main(String[] args) {
		// 1.打印1-100
		// int i = 1;
		// do{
		// 	System.out.println("i："+i);
		// 	i++;
		// }while(i<=100);


		// 2.统计1-100的和
		// int i = 1;
		// int num = 0;
		// do{
		// 	num += i;
		// 	if( i == 100 ){
		// 		System.out.println("num："+num);  //5050
		// 	}
		// 	i++;
		// }while(i<=100);

		// 3.统计1-200之间能被5整除但不能被3整除的个数
		int i = 1;
		do{
			if( i%5==0 && i%3 != 0){
				System.out.println("被5整除但不能被3整除"+i);  
			}
			i++;
		}while(i < 200);


	}
}