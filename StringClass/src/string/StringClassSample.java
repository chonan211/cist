package string;
/**
 * 2014/2/24
 * @author chonan
 *
 */
public class StringClassSample {
	String s = new String("0123456789");

	public static void main(String[] args) {
		//クソな書き方
		String s = new String("0123456789");
		//推奨：リテラルを直接代入
		String string  = "0123456789";
		System.out.println("charAt " + s.charAt(2));
		System.out.println("length " + s.length());
		System.out.println("indexOf " + s.indexOf(1));
		System.out.println("startsWith " + s.startsWith("1"));
		System.out.println("split " + s.split(s, 2));
		System.out.println("substring " + s.substring(1));

	}

	void chMenber(String s){
		this.s = s;

	}



}
