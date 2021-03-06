/**
 * 
 */
package nazeJava_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 標準入力によりじゃんけんの手をユーザーに聞く戦略クラス。
 * 
 * @author sekai
 *
 */
public class AskTactics implements Tactics {
	/**
	 * 戦略を読み、じゃんけんの手を得る。
	 * グー・チョキ・パーいずれかをPlayerクラスに定義された以下の関数で返す。
	 * 
	 * Player.STONE    …グー
	 * Player.SCISSORS …チョキ
	 * Player.PAPER    …パー
	 * 
	 * @return じゃんけんの手
	 */
	public int readTactics() {
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("\nじゃんけんの手を入力して下さい。");
		System.out.println("0: グー");
		System.out.println("1: チョキ");
		System.out.println("2: パー\n");
		System.out.println("? ");
		
		// じゃんけんの手
		int hand = 0;
		
		while (true) {
			try {
					// 入力文字列を受け取る
					String inputStr = br.readLine();
					
					// 入力文字列を数値に変換する。
					hand = Integer.parseInt(inputStr);
					
					// 0～2のいずれかが入力されたらループを抜ける
					if (hand == Player.STONE
					|| hand == Player.SCISSORS
					|| hand == Player.PAPER) {
						break;
					}
					else 
					{System.out.println("入力が正しくありません。再度入力して下さい。");
					System.out.println("? ");
					}
				}
			catch (Exception ex) {
				System.out.println("入力が正しくありません。再度入力して下さい。");
				System.out.println("? ");
			}
		}
		
		return hand;
	}
}
