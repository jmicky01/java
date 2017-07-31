import java.util.Arrays;

public class Assginment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = new int[10];

		for (int i = 1; i < array1.length + 1; i++) {
			array1[i - 1] = i;
		}

		System.out.println("Original array of 10 elements: " + Arrays.toString(array1));
		array1[2] = 0;
		array1[6] = 0;

		System.out.println("Arry fter replacing elements of 3rd and 7th: " + Arrays.toString(array1));

		// sum of {3,9,1,10,15,17,25}
		int[] array2 = { 3, 9, 1, 10, 15, 17, 25 };
		System.out.println(array2[2]);
		int sum = 0;
		for (int i = 0; i < array2.length; i++) {
			sum += array2[i];
		}

		System.out.println("sum  of all array elements :" + sum);

		// 3) Write a program which makes use of any two assignment operators,
		// two arithmetic
		// operators and any one logical operator.

		int a = 10;
		a += 5;
		int b = 16;
		int c = a * b;
		if (a < b && b < c) {
			System.out.println("intiger c value is grater then a,b. The value of c is: " + c);
		} else {
			System.out.println("c is not a larger value");

		}
		// Check if given number is prime or not

		int count = 0;
		int givenNumber = 29;
		int m = givenNumber / 2;

		for (int i = 2; i <= m; i++) {
			if (givenNumber % i == 0) {
				System.out.println(givenNumber + " >>The number is not prime");
				count = 1;
				break;
			}
		}
		if (count == 0)
			System.out.println(givenNumber + " >>The number is prime");
//			
//			int x = 100; 
//			double y = 100.1; 
//			boolean z = (x = y); 
//			System.out.println(z);
//			it gives  error: Type mismatch: cannot convert from int to boolean
//			Answer: C. Compilation fails
		 
	}
}
