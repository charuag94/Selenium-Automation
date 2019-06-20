package automation;

public class ArrangeASCIIValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ab4%$d1e2A3B^C";

		String special = "";
		String smallAlpha = "";
		String capAlpha = "";
		String number="";

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				smallAlpha = smallAlpha + str.charAt(i);
			}

			else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {

				capAlpha = capAlpha + str.charAt(i);
			}

			else if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {

				number = number + str.charAt(i);
			}

			else {
				special = special + str.charAt(i);
			}
		}

		System.out.println(special + smallAlpha + capAlpha+number);

	}

}
