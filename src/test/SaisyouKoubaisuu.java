package test;

public class SaisyouKoubaisuu {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 整数AとB
		int numA = 24;
		int numB = 36;
		
		// AとBを定数に。
		final int numAf = numA;
		final int numBf = numB;
		
		// AとBが同じでない間繰り返す
		while(numA != numB) {
			
			// AとBを比較し、小さい方に小さい方の定数を加算。
			if(numA > numB) {
				numB += numBf;
			} else {
				numA += numAf;
			}
			
			System.out.println(numA + "、" + numB);
		}
		
		System.out.println("最小公倍数は" + numA + "です");

	}
}
