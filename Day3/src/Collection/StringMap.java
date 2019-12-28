package Collection;

import java.util.Arrays;

public class StringMap {
	public static void main(String[] args) {
		String s = "This is a beautiful Day";
		System.out.println(s);
		if(s.contains("Day")) {
			int start = s.indexOf("Day") + 1;
			int end = start + "Day".length()-1;
			System.out.println(start+" ; "+end);
		}
		StringBuffer buffer = new StringBuffer();
		buffer.append("<html>");
		buffer.append("<head><title>Hello</title></head>");
		System.out.println(buffer.toString());
		String text = "malayalam";
		if(chkPalindrome(text)) {
			System.out.println("This is a Palindrome");
		}
		else
		{
			System.out.println("This is not a Palindrome");
		}
		String sent = "The quick brown fox jumps over a lazy dog";
		String temp = "";
		char[] a = sent.toCharArray();
		for(int i=0;i<sent.length();i++) {
			if((a[i]>='A' && a[i]<='Z') || (a[i]>='a' && a[i]<='z')) {
				if(!temp.contains(a[i]+"")) {
				temp = temp + a[i];
				}
			}
		}
		System.out.println(temp.toLowerCase().length());
		char[] ch = temp.toLowerCase().toCharArray();
		Arrays.sort(ch);
		System.out.println(new String(ch));
	}
	
	public static boolean chkPalindrome(String text) {
		StringBuffer sb = new StringBuffer(text);
		sb = sb.reverse();
		return text.equals(sb.toString());
		
	}
}
