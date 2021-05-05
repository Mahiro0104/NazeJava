/**
 * 
 */
package nazeJava_2;

/**
 * じゃんけん戦略インターフェース
 * 
 * @author sekai
 *
 */
public interface Tactics {
	
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
	public int readTactics();

}
