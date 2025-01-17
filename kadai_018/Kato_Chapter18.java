package text.kadai_018;

abstract public class Kato_Chapter18 {
	
	public String familyName;
	public String givenName;
	public String address;
	
//	共通の紹介を出力するメソッド
	public void commonIntroduce() {
		familyName = "加藤";
        address = "東京都中野区〇×";
	}
	
//	個別の紹介を出力するメソッド
	abstract public void eachIntroduce();
	
//	紹介を実行するメソッド
	public void execIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
        System.out.println("住所は" + address + "です");
        eachIntroduce(); 
	}
}
