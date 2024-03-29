package framework.sevens;

import framework.trump.Master;

/**
 * 七並べ用進行役クラス.
 */
public class SevensMaster extends Master {
    // パスできる制限回数
    public static final int PASS_LIMIT = 3;

    /**
     * パスを宣言する.
     *
     * @param player パスするプレイヤー
     */
    public void pass(SevensPlayer player) {
        // パスを表示
        System.out.println("  " + player + "さんは " + player.getPass() + " 回目のパスしました！");

        if (player.getPass() > PASS_LIMIT) {
            // パス回数が制限値を超えている場合は負け。
            System.out.println("  " + player + "さんは負けです！");
            deregisterPlayer(player);
        }
    }
}
