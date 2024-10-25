public class FloatDetail{
	public static void main(String[] args) {
		double num11 = 2.7;
		double num12 = 8.1 / 3;
		if(num11 == num12){
			System.out.println("相等");
		}
		if(Math.abs(num11 - num12) < 0.000001){
			System.out.println("差值非常小");
		}
	}
}