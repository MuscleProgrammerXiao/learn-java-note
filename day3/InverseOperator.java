public class InverseOperator{
	public static void main(String[] args) {
		//a^b�����߼���򣬵�a��b��ͬʱ������Ϊtrue������Ϊfalse��
		// boolean b = (10 > 1)^ (20 > 10);
		// System.out.println("b=" + b); //false

		// int x = 5;
		// int y = 5;
		// if(x++==6 & ++y==6){ //���ж�x==6,false����ִ��x++,��ʱxΪ6������ִ��++y�����ж�y==6�����Ϊtrue������xΪ6��yΪ6
		// 	x=11;
		// }
		// System.out.println("x=" + x + ",y=" + y);//x=6;y=6

		// int x = 5;
		// int y = 5;
		// if(x++==6 && ++y==6){ //���ж�x==6,Ϊfalse����·&&����ִ�к�����������ִ��x++������xΪ6��yΪ5
		// 	x=11;
		// }
		// System.out.println("x=" + x + ",y=" + y);//x=6;y=5

		// int x = 5;
		// int y = 5;
		// if(x++==6 | ++y==6){ // ���ж�x==6,Ϊfalse,��x++,��ִ��++y�����ж�Ϊtrue����ִ��x=11�����Խ��ΪxΪ11��yΪ6
		// 	x=11;
		// }
		// System.out.println("x=" + x + ",y=" + y);

		int x = 5;
		int y = 5;
		if(x++==6 || ++y==6){// ���ж�x==6,Ϊfalse,��ִ��x++,��ִ��++y,���ж�Ϊtrue����ִ��x=11.���Խ��ΪxΪ11��yΪ6
			x=11;
		}
		System.out.println("x=" + x + ",y=" + y);


	}
}