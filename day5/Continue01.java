public class Continue01{
	public static void main(String[] args) {
		// int i = 5;
		// while(i>0){
		// i--;
		// if(i==2){
		// continue;
		// }
		// System.out.println("i="+ i);  
		// }

		label1:
		for(int j = 0;j < 4; j++){
			lable2:
			for(int i = 0; i < 10; i++){
				if(i == 2){
					continue; //µÈ¼ÛÓÚ continue label2
				}
				System.out.println("i=" +i); 
			}
		}
	}
}

