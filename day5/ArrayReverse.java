public class ArrayReverse{
	public static void main(String[] args) {
		int[] arr1 = {11,22,33,44,55,66};
		int[] arr2 = new int[arr1.length];
		int index = arr1.length;
		int temp = 0;
		for(int i = 0;i < arr1.length ; i++){
			index--;
			// arr2[i] = arr1[index];
			// System.out.println("i"+i+"index"+index);
			temp=arr1[index];
			System.out.println(temp);
			System.out.println(i);
			arr2[i] = temp;
		}
		System.out.println(arr2);
	}
}