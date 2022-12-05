
public class palendrome {

	static String val = "Malayalam";
	static String reverse = "";

	public static void main(String[] args) {
		String[] split = val.split("");
		for (int i = split.length - 1; i >= 0; i--) {

			reverse = reverse + split[i];

		}
		System.out.println("the reverse string is : "  +reverse);

		if (val.equalsIgnoreCase(reverse)) {
			System.out.println("its palendrome");
		} else {
			System.out.println("not palendrome");
			

		}

	}
}
