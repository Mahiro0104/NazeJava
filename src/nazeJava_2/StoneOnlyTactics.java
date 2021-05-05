/**
 * 
 */
package nazeJava_2;

/**
 * @author sekai
 *
 */
public class StoneOnlyTactics implements Tactics {
	public int readTactics() {
		// 必ずグーを出す
		return Player.STONE;
	}
}
