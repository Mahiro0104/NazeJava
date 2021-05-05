/**
 * 
 */
package nazeJava_2;

/**
 * @author sekai
 *
 */
public class CyclicTactics implements Tactics {
	
	int lastHand = -1;
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
 		//		int i = Judge.cnt;
//		
//		if(i == 0) {
//			hand = Player.STONE;
//		} else if(i == 1) {
//			hand = Player.SCISSORS;
//		} else {
//			hand = Player.PAPER;
//		}
		
		lastHand = (lastHand + 1) % 3;
		System.out.println(lastHand);
		return lastHand;
	}

}
