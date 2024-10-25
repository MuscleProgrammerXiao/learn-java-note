public class InverseOperator{
	public static void main(String[] args) {
		//a^b：叫逻辑异或，当a和b不同时，则结果为true，否则为false。
		// boolean b = (10 > 1)^ (20 > 10);
		// System.out.println("b=" + b); //false

		// int x = 5;
		// int y = 5;
		// if(x++==6 & ++y==6){ //先判断x==6,false，再执行x++,此时x为6，继续执行++y。再判断y==6。结果为true，所以x为6，y为6
		// 	x=11;
		// }
		// System.out.println("x=" + x + ",y=" + y);//x=6;y=6

		// int x = 5;
		// int y = 5;
		// if(x++==6 && ++y==6){ //先判断x==6,为false，短路&&不会执行后面条件。再执行x++。所以x为6，y为5
		// 	x=11;
		// }
		// System.out.println("x=" + x + ",y=" + y);//x=6;y=5

		// int x = 5;
		// int y = 5;
		// if(x++==6 | ++y==6){ // 先判断x==6,为false,再x++,再执行++y，再判断为true，再执行x=11。所以结果为x为11，y为6
		// 	x=11;
		// }
		// System.out.println("x=" + x + ",y=" + y);

		int x = 5;
		int y = 5;
		if(x++==6 || ++y==6){// 先判断x==6,为false,再执行x++,在执行++y,再判断为true，再执行x=11.所以结果为x为11，y为6
			x=11;
		}
		System.out.println("x=" + x + ",y=" + y);


	}
}