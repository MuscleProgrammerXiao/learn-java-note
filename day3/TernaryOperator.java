public class TernaryOperator{
	public static void main(String[] args) {
		int a = 10;
		int b = 99;
		int result = a > b ? a++ : b--; 
		System.out.println("a="+a+"b="+b);//a=10,b=98
	}
}