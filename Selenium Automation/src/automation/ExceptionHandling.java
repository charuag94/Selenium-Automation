package automation;

public class ExceptionHandling {

	static String s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hi this is besant");

		try {
			System.out.println(s);

			System.out.println(10 / 0);
			// System.out.println(s.length());
		}

		catch (ArithmeticException e) {
			System.out.println(" Arithmetic exception block is running " + e);
		}

		catch (NullPointerException e) {
			System.out.println("Null pointer exception block is handling " + e);
		}

		catch (Exception e) {

			System.out.println(e);
		}

		try {
			System.out.println(s);

			// System.out.println(10 / 0);
			System.out.println(s.length());
		}

		catch (ArithmeticException e) {
			System.out.println(" Arithmetic exception block is running " + e);
		}

		catch (NullPointerException e) {
			System.out.println("Null pointer exception block is handling " + e);
		}

		catch (Exception e) {

			System.out.println(e);
		}

		finally {
			System.out.println("The end");

		}
	}

}
