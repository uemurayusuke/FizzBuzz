
//・1から100までの数値をループで処理
//・3で割り切れる数値の場合は、「Fizz」と表示
//・5で割り切れる数値の場合は、「Buzz」と表示
//・3と5の両方で割り切れる数値の場合、「FizzBuzz」と表示
//・それ以外の数値は、その数値をそのまま表示



public class FizzBuzz {
	public static void main(String[] args) {
		for (int number = 1; number <=100; number++) {
			
			if (number%3 == 0 && number%5 == 0) {
				System.out.println("FizzBuzz");
//				a%bで剰余算
			} else if (number%3 == 0) {
				System.out.println("Fizz");
			} else if (number%5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(number);
			}
		}
	}
}






//public class FizzBuzz {
//	public static void main(String[] args) {
//		for (int number = 1; number <=100; number++) {
//			
//			if (number%3 == 0) {
//				System.out.println("Fizz");
////				a%bで剰余算
//			} else if (number%5 == 0) {
//				System.out.println("Buzz");
//			} else if (number%3 == 0 && number%5 == 0) {
//				System.out.println("FizzBuzz");
//			} else {
//				System.out.println(number);
//			}
//		}
//	}
//}
//上記では、3と5で割り切れる時のFizzBuzzが出力できない。




//public class FizzBuzz {
//	public static void main(String[] args) {
//		for (int number = 1; number <=100; number++) {
//			System.out.println(number);
//		}
//	}
//}
//上記で1から100まで1個ずつ出力する。
//ここに条件式を盛り込むか







