package mypack;

public class StringPractice {
public static void main(String[] args) {
	String s= "Hello";
	String t= "java";
	
	for(int i=1;i<s.length();i++) {
		System.out.println(s.substring(s.charAt(i-1)));
	}
//	StringBuilder sb =new StringBuilder(s);
	//System.out.println(sb.toString());
}
}
