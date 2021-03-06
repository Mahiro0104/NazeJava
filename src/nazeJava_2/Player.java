package nazeJava_2;

/**
 * @author sekai
 *
 */
public class Player {

	// じゃんけんの手を表す定数
	public static final int STONE = 0;
	public static final int SCISSORS = 1;
	public static final int PAPER = 2;

	//------------------------------
	// プレイヤークラスの属性
	//------------------------------
	/** プレイヤーの名前 */
	private String name_;

	/** プレイヤーの勝った回数 */
	private int winCount_ = 0;

	/** 与えられた戦略 */
	private Tactics tactics_;

	void setTactics(Tactics tactics) {
		tactics_ = tactics;
	}

	//------------------------------
	// コンストラクタ
	//------------------------------
	public Player(String name) {
		name_ = name;
	}

	//------------------------------
	// プレイヤークラスの操作
	//------------------------------

	/**
	 * じゃんけんの手を出す
	 * 
	 * @return
	 */
	public int showHand() {

		// 与えられた戦略を読んでじゃんけんの手を決める
		int hand = tactics_.readTactics();

		//		// プレイヤーの手
		//		int hand = 0;
		//		
		//		// 0以上3未満の小数として乱数を得る
		//		double randomNum = Math.random() * 3;
		//		
		//		if(randomNum < 1) {
		//			// randomNumが0.0以上1.0未満の場合、グー
		//			hand = STONE;
		//			
		//		}
		//		
		//		else if(randomNum < 2) {
		//			// randomNumが1.0以上2.0未満の場合、チョキ
		//			hand = SCISSORS;
		//			
		//		}
		//
		//		else if(randomNum < 3) {
		//			// randomNumが2.0以上3.0未満の場合、グー
		//			hand = PAPER;
		//			
		//		}

		// 決定した手を戻り値として返す
		return hand;

	}

	/**
	 * 審判から勝敗を聞く
	 * 
	 * @param result true:勝ち, false:負け
	 */
	public void notifyResult(boolean result) {
		if (true == result) {
			// 勝った場合は勝ち数を加算する
			winCount_ += 1;
		}
	}

	/**
	 * 自分の名前を答える
	 * 
	 * @return 名前
	 */
	public String getName() {
		return name_;
	}

	/**
	 * 自分の勝った回数を数える
	 * 
	 * @return 勝った回数
	 */
	public int getWinCount() {
		return winCount_;
	}
}
