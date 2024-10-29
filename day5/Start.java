public class Start{
	public static void main(String[] args) {
		// 打印一个空心金字塔
		int total = 10;
		for (int i=1;i<=total;i++) {
			for(int k =1;k<= total-i;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++){
					if(j==2*i-1||j==1||i==total){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
			}
			System.out.println("");
		}

	}
}