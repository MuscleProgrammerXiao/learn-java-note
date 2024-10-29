/**
 * 多重循环练习题
 * */
import java.util.Scanner;		
public class MulForExercise01{
	public static void main(String[] args) {
		//1.统计3个班成绩情况，每个班有5名同学，求出各个班的平均分和所有班级的平均分[学生的成绩从键盘输入]
		//2.统计3个班及格人数
		Scanner myScanner = new Scanner(System.in);
		int count = 0;
		int totalJigeNum = 0;
		int jigeNum = 0;
		for (int j = 1;j<=3 ;j++ ) {
			double sum = 0;
			for(int i = 1; i <= 5 ; i++){
				System.out.println("请输入第" + j + "个班级的第" + i + "个学生的成绩");
				double score = myScanner.nextDouble();
				if(score >= 60){
					jigeNum++;
				}
				sum += score;
				System.out.println("成绩为"+ score);
			}
			count += sum;
			totalJigeNum += jigeNum;
			System.out.println("平均成绩为"+ (sum/5));
			System.out.println("及格人数为"+ jigeNum);
			jigeNum=0;
		}
		System.out.println("所有班级的平均分"+ (count/15));
		System.out.println("所有班级的及格人数"+ totalJigeNum);

		//99乘法表
		// for(int i =1;i<10;i++){
		// 	for (int j = 1 ; j<10 ; j++ ) {
		// 		System.out.println(i + " x " + j + " = " + i*j);
		// 	}
		// 		System.out.println("\n");

		// }
	}
}