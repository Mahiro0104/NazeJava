package test;

public class SaidaiKoubaisuu {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int numA = 100;
		int numB = 24;
		
		while(numA != numB) {
			if (numA > numB) {
				numA = numA - numB;
			} else {
				numB = numB - numA;
			}
			System.out.println("numA=" + numA + ",numB=" + numB + "\n");
		}
		System.out.println("\nnumA=" + numA + ",numB="+ numB + "です。これが最大公約数です。\n");
	}
}
