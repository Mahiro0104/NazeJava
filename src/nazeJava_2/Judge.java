/**
 * 
 */
package nazeJava_2;

/**
 * じゃんけんの審判を表すクラス
 * 
 * @author sekai
 *
 */
public class Judge {
	
	/**
	 * じゃんけんを開始する
	 * 
	 * @param player1
	 * @param player2
	 */
	public void startJanken(Player player1, Player player2) {
		// じゃんけんの開始を宣言する
		System.out.println("【じゃんけん開始】\n");
		
		// じゃんけんを三回行う
		for (int cnt = 0; cnt < 3; cnt++) {
			// 何戦目か表示する
			System.out.println("【" + (cnt + 1) + "回戦目】\n");
			
			// プレイヤーの手を見て、どちらが勝ちかを判定する
			Player winner = judgeJanken(player1, player2);
			
			if (winner != null) {
				// 勝者を表示する
				System.out.println("\n" + winner.getName() + "が勝ちました\n");
				
				// 勝者に結果を伝える
				winner.notifyResult(true);
				
			} else {
				// 引き分けの場合
				System.out.println("\n引き分けです！\n");
			}
		}
		
		// じゃんけんの終了を宣言する
		System.out.println("【じゃんけん終了】\n");
		
		// 最終的な勝者を判定する
		Player finalWinner = judgeFinalWinner(player1, player2);
		
		// 結果の表示
		System.out.println(player1.getWinCount() + "対" + player2.getWinCount() + "で");
				
		if (finalWinner != null) {
			System.out.println(finalWinner.getName() + "の、勝ちです！\n");
		} else {
			System.out.println("引き分けです！\n");
		}
	}
	
	/**
	 * じゃんけんぽんと声をかけ、プレイヤーの手を見て勝敗を判定する
	 * 
	 * @param player1
	 * @param player2
	 * @return
	 */
	private Player judgeJanken(Player player1, Player player2) {
		Player winner = null;
		
		// かけ声
		System.out.println(player1.getName() + "さんと" + player2.getName() + "さんの対戦です。\nそれでは、じゃんけん……\n\nぽんっ！");
		
		// プレイヤー1の手を出す
		int player1hand = player1.showHand();
		
		// プレイヤー2の手を出す
		int player2hand = player2.showHand();
		
		
		//それぞれの手を表示する
		printHand(player1hand);
		System.out.println("VS.");
		printHand(player2hand);
		System.out.println("\n");
		
		// プレイヤー1が勝つ場合
		if (
				(player1hand == Player.STONE && player2hand == Player.SCISSORS)
				|| (player1hand == Player.SCISSORS && player2hand == Player.PAPER)
				|| (player1hand == Player.PAPER && player2hand == Player.STONE)
			) {
			winner = player1;
		}
		
		// プレイヤー2が勝つ場合
		else if (
				(player1hand == Player.STONE && player2hand == Player.PAPER)
				|| (player1hand == Player.SCISSORS && player2hand == Player.STONE)
				|| (player1hand == Player.PAPER && player2hand == Player.SCISSORS)
			) {
			winner = player2;
		}
		
		return winner;
	}
	
	/**
	 * 最終的な勝者を判定する
	 * 
	 * @param player1 対象プレイヤー1
	 * @param player2 対象プレイヤー2
	 * @return 勝ったプレイヤー。引き分けの場合はnullを返す。
	 */
	private Player judgeFinalWinner(Player player1, Player player2) {
		Player winner = null;
		
		// player1から勝ち数を聞く
		int player1WinCount = player1.getWinCount();
		
		// player2から勝ち数を聞く
		int player2WinCount = player2.getWinCount();

		
		if (player1WinCount > player2WinCount) {
			// プレイヤー1の勝ち
			winner = player1;
		} else if (player1WinCount < player2WinCount) {
			// プレイヤー2の勝ち
			winner = player2;
		}
		
		// どちらでもない場合は引き分け
		
		return winner;
	}
	
	/**
	 * じゃんけんの手を表示する。
	 * 
	 * @param hand
	 */
	private void printHand(int hand) {
		switch (hand) {
		case Player.STONE :
			System.out.println("グー");
			break;
			
		case Player.SCISSORS :
			System.out.println("チョキ");
			break;
			
		case Player.PAPER :
			System.out.println("パー");
			break;
			
		default :
			break;
		}
	}
}
