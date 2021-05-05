/**
 * 
 */
package nazeJava_2;

/**
 * @author sekai
 *
 */
public class ObjectJanken {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 審判（齋藤さん）のインスタンス生成
		Judge saito = new Judge();
		
		// プレイヤー1（村田さん）の生成
		Player murata = new Murata("村田さん");
		
		// 村田さんに渡す戦略クラスを生成する
		Tactics murataTactics = new CyclicTactics();
		
		// 村田さんに戦略クラスを渡す
		murata.setTactics(murataTactics);
		
		// プレイヤー2（山田さん）の生成
		Player yamada = new Yamada("山田さん");
		
		// 山田さんに渡す戦略クラスを生成する
		Tactics yamadaTactics = new RandomTactics();
		
		// 山田さんに戦略クラスを渡す
		yamada.setTactics(yamadaTactics);
		
		// 村田さんと山田さんをプレイヤーとしてじゃんけんを開始する
		saito.startJanken(murata, yamada);
	}
}
