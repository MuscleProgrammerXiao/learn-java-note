public class ArithmeticOperatorExercise02{
	public static void main(String[] args) {
		// 1.假如还有59天放假，问合xx个星期零xx天
		int holiday = 59;
		int week = holiday / 7;
		int day = holiday % 7;
		System.out.println("合"+week+"个星期零"+day+"天"); //合8个星期零3天
		// 2.定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为： 5/9*(华氏温度-100)，请求出华氏温度对应的摄氏温度。[234.5]
		double fahrenheit = 234.5;//定义一个华氏温度
		double celsius = 5.0 / 9 * (fahrenheit - 100);
		System.out.println("摄氏温度为"+celsius); //摄氏温度为74.72222222222223
	}
}