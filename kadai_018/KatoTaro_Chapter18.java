package text.kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {
	
	public KatoTaro_Chapter18() {
        this.setGivenName();
        this.commonIntroduce();
    }
	
//	名を表すフィールドの値をセットするメソッド
	public void setGivenName() {
		givenName = "太郎";
	}
	
	public void eachIntroduce() {
        System.out.println("私はJavaが得意です");	
    }
}
