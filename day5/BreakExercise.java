import java.util.Scanner;
public class BreakExercise{
	public static void main(String[] args) {
		// 1. 1-100以内的数求和，求出 当和 第一次大于20的当前数。
		// int total = 0;
		// for(int i = 1;i<=100;i++){
		// 	total += i;
		// 	if(total > 20){
		// 		System.out.println("当前数为"+i);
		// 		break;
		// 	}
		// }
		// 实现登录验证 ，有三次机会，如果用户名为 "顶针",密码 "666"提示登录成功,否则提示还有几次机会（for + break）
		Scanner myScanner = new Scanner(System.in);
		String userName = "";
		String passward = "";
		for(int i = 2;i>=0;i--){
			System.out.println("请输入用户名");
			userName = myScanner.next();
			System.out.println("请输入密码");
			passward = myScanner.next();
			if("顶针".equals(userName)  &&  "666".equals(passward)){
				System.out.println("登录成功！");
				break;
			}else {
				System.out.println("用户名或密码有误，还剩" + i + "次输入机会");
			}
		}
	}
}