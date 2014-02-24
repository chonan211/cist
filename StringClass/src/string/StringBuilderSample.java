package string;

/**
 * 2014/2/24
 * @author chonan
 *
 */
public class StringBuilderSample {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("0123456789");

		System.out.println("charAt " + sb.charAt(2));
		System.out.println("length " + sb.length());
		System.out.println("subSequence" + sb.subSequence(1, 3));

		sb.append("abcd");
		System.out.println(sb);
		sb.delete(11, 14);
		System.out.println(sb);
		System.out.println("indexOf " + sb.indexOf("4"));
		System.out.println("insert " + sb.insert(0, "abcd"));
		System.out.println("replace " + sb.replace(0, 3, "mmmm"));

	}
}
