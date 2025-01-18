package text.kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	HashMap<String, String> dicMap = new HashMap<String, String>();
	
	public void add() {
	dicMap.put("apple", "りんご");
	dicMap.put("peach", "桃");
	dicMap.put("banana", "バナナ");
	dicMap.put("lemon", "レモン");
	dicMap.put("pear", "梨");
	dicMap.put("kiwi", "キウィ");
	dicMap.put("strawberry", "いちご");
	dicMap.put("grape", "ぶどう");
	dicMap.put("muscat", "マスカット");
	dicMap.put("cherry", "さくらんぼ");
	}
	
	public void searchWords(String[] words) {
        for (String word : words) {
            if (dicMap.containsKey(word)) {
                System.out.println(word + "の意味は" + dicMap.get(word));
            } else {
                System.out.println(word + "は辞書に存在しません");
            }
        }
    }
}
