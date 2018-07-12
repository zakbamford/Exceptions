package _02_gotta_catchem_all;

public class ExceptionMethods {
	public static double divide(double numerator, double denominator) throws IllegalArgumentException {
		if (denominator == 0)
			throw new IllegalArgumentException();
		else
			return numerator / denominator;
	}

	public static String reverseString(String str) throws IllegalStateException {
		String str2 = "";
		if (str.length() == 0)
			throw new IllegalStateException();
		else {
			for (int i = str.length() - 1; i >= 0; i++)
				str2 += str.charAt(i);
			return str2;
		}
	}
}
