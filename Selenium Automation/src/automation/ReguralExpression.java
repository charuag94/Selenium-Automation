package automation;

public class ReguralExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ab4%$d1e2A3B^C";

		String special = "";
		String smallAlpha = "";
		String capAlpha = "";
		String number="";
		
		special=str.replaceAll("[A-Za-z0-9]+", "");
		smallAlpha=str.replaceAll("[^a-z]+", "");
		capAlpha=str.replaceAll("[^A-Z]+", "");
		number=str.replaceAll("[^0-9]+", "");
		
		System.out.println(special+"            "+smallAlpha+"            "+capAlpha+"            "+number);
		
		String s=str.replaceAll("[\\W_]", "");
		
		System.out.println(s);
	}

}
