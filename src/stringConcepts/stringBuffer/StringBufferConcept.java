package stringConcepts.stringBuffer;

public class StringBufferConcept{

	public static void main(String[] args) {
		
		StringBuffer sb= new StringBuffer();
		sb.append("jagadeesh");
		sb.append(" ");
		sb.append("keerthi");
		
		System.out.println(sb);
		
		sb.delete(0, 5);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.replace(0, 1, "hrud");
		System.out.println(sb);
		sb.insert(0, "jag");
		System.out.println(sb);

	}

}
