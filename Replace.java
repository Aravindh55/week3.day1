package week3.day1;

public class Replace {

	public static void main(String[] args) {
		String sentence = "I am working with Java8";
		String text1 = sentence.replaceAll(sentence.substring(7,11),"abcd");
		System.out.println(text1);
		String text2 = sentence.substring(4, 14);
		System.out.println(text2);
	}

}
