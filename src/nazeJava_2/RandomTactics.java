/**
 * 
 */
package nazeJava_2;

/**
 * ランダムに手を決める戦略クラス。
 * 
 * @author sekai
 *
 */
public class RandomTactics implements Tactics {
	
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
		// プレイヤーの手
		int hand = 0;
		
		// 0以上3未満の小数として乱数を得る
		double randomNum = Math.random() * 3;
		
		if(randomNum < 1) {
			// randomNumが0.0以上1.0未満の場合、グー
			hand = Player.STONE;
			
		}
		
		else if(randomNum < 2) {
			// randomNumが1.0以上2.0未満の場合、チョキ
			hand = Player.SCISSORS;
			
		}

		else if(randomNum < 3) {
			// randomNumが2.0以上3.0未満の場合、グー
			hand = Player.PAPER;
		}
		
		return hand;
	}
}
