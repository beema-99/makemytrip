
public class Change_index {
	static String Word = "Palendrome in String and Number";
	static String reverse = "";

	public static void main(String[] args) {

		String[] split = Word.split(" ");
		for (int i = 1; i <=split.length-2;i++) {
			reverse = reverse + split[i] + " ";

		}
		
		String changeindex = split[4] + " " + reverse + split[0];
		System.out.println(changeindex);
	}

}
