
public class RemoveBlank {
	public static void main(String[] args) {
		String text = "hello mike, hello world";
		System.out.println("去掉空格之前的字符串：" + text);
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<text.length();i++) {
			char c = text.charAt(i);
			if(c == ' ') {
				continue;
			}
			sb.append(c);
		}
		System.out.println("去掉空格之后的字符串：" + sb.toString());
		
	}
}
