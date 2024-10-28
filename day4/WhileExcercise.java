public class WhileExcercise{
	public static void main(String[] args) {
		// 1.打印 1-100 之间所有能被3整除的数（使用while）
		int i = 1;
		while(i<=100){
			if(i%3==0){
				System.out.println("能被3整除的数："+i);
			}
			i++;
		}
		// 2.打印 40-200 之间所有的偶像（使用while，课后练习）
		int k = 40;
		while(k<=200){
			if(k%2==0){
				System.out.println("40-200之间所有的偶像:"+ k);
			}
			k++;
		}
	}
}