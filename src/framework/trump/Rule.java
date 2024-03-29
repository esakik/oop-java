package framework.trump;

/**
 * トランプルールインターフェース.
 */
public interface Rule {
    /**
     * テーブルに置けるカードを探す.
     * 手札とテーブルから、テーブルに出しうるカードの組み合わせを探す.
     *
     * @param hand  手札
     * @param table テーブル
     * @return 見つかったカードの組み合わせ. 見つからなかった場合はnullを返す.
     */
    Card[] findCandidate(Hand hand, Table table);
}

