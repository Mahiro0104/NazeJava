package nazeJava_2;

/* オブジェクト指向を使用しないじゃんけんプログラム */

public class SimpleJanken {

	// じゃんけんの手を表す定数
	public static final int STONE = 0; // グー
	public static final int SCISSORS = 1; // チョキ
	public static final int PAPER = 2; // パー
	
	
	// ------------------------------
	// ①ここからプログラム
	// ------------------------------
	
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.println("【じゃんけん開始】\n");
		
	
		// プレイヤー1の勝ち数
		int player1WinCount = 0;
		
		// プレイヤー2の勝ち数
		int player2WinCount = 0;
		
		int player1Hand = 0;
		
		int player2Hand = 0;

		// じゃんけんを3回実施する
		// ------------------------------
		// ⑥勝負した回数を加算する
		// ⑦3回勝負が終わったか？
		// ------------------------------
		for(int cnt = 0; cnt < 3; cnt ++) {
			// 乱数を格納するための変数
			double randomNum = 0;
			
			// ------------------------------
			// ②プレイヤー1が何を出すか決める
			// ------------------------------
			
			// 0以上3未満の小数として乱数を得る
			randomNum = Math.random() * 3;
			
			if(randomNum < 1) {
				// randomNumが0.0以上1.0未満の場合、グー
				player1Hand = STONE;
				
				//プレイヤー1の手を表示する
				System.out.println("グー");
			}
			
			else if(randomNum < 2) {
				// randomNumが1.0以上2.0未満の場合、チョキ
				player1Hand = SCISSORS;
				
				//プレイヤー1の手を表示する
				System.out.println("チョキ");
			}

			else if(randomNum < 3) {
				// randomNumが2.0以上3.0未満の場合、グー
				player1Hand = PAPER;
				
				//プレイヤー1の手を表示する
				System.out.println("パー");
			}

			// ------------------------------
			// ③プレイヤー2が何を出すか決める
			// ------------------------------
			
			// 0以上3未満の小数として乱数を得る
			randomNum = Math.random() * 3;
			
			if(randomNum < 1) {
				// randomNumが0.0以上1.0未満の場合、グー
				player2Hand = STONE;
				
				//プレイヤー1の手を表示する
				System.out.println("グー");
			}
			
			else if(randomNum < 2) {
				// randomNumが1.0以上2.0未満の場合、チョキ
				player2Hand = SCISSORS;
				
				//プレイヤー1の手を表示する
				System.out.println("チョキ");
			}

			else if(randomNum < 3) {
				// randomNumが2.0以上3.0未満の場合、グー
				player2Hand = PAPER;
				
				//プレイヤー1の手を表示する
				System.out.println("パー");
			}

			// ------------------------------
			// ④どちらが勝ちかを判定し、結果を表示する
			// ------------------------------
			
			// プレイヤー1が勝つ場合
			if (
					(player1Hand == STONE && player2Hand == SCISSORS)	 || (player1Hand == SCISSORS && player2Hand == PAPER) || (player1Hand == PAPER && player2Hand == STONE)
					) {
				System.out.println("kusa");
				
				player1WinCount ++;
			} else if (
					(player1Hand == STONE && player2Hand == PAPER) || (player1Hand == SCISSORS && player2Hand == STONE) || (player1Hand == PAPER && player2Hand == SCISSORS)
					) {
				System.out.println("unko");
				
				player2WinCount ++;
			} else {
				System.out.println("gero");
			}
		}
		
		// ------------------------------
		// ⑧最終的な少佐を判定し、画面に表示する
		// ------------------------------
		System.out.println("【じゃんけん終了】");
		
		//プレイヤー1の勝ち数が多いとき
		if (player1WinCount > player2WinCount) {
			// プレイヤー1の勝ち数を表示する
			System.out.println(player1WinCount + "対" + player2WinCount + "で、プレイヤー1の勝ちです！\n");
		}
		else if (player1WinCount < player2WinCount) {
			// プレイヤー1の勝ち数を表示する
			System.out.println(player1WinCount + "対" + player2WinCount + "で、プレイヤー2の勝ちです！\n");
		}
		else if (player1WinCount == player2WinCount){
			// プレイヤー1の勝ち数を表示する
			System.out.println(player1WinCount + "対" + player2WinCount + "で、引き分けです！\n");
		}

		
	}
}
