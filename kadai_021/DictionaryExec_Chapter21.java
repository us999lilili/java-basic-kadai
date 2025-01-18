package text.kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
//		辞書クラスのインスタンス作成
		Dictionary_Chapter21 dic = new Dictionary_Chapter21();
		dic.add();
		
//		調べる英単語を配列にセット
		String[] fruitsArray = {"apple", "banana", "grape", "orange"};
		
//		辞書を調べるメソッドを引数指定で呼び出し
		dic.searchWords(fruitsArray);

	}

}
