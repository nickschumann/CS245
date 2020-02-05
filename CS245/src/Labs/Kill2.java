package Labs;

public class Kill2 {
	public static void main(String[] args) {
		System.out.println(remove2nd("cat dog"));
		if(args.length != 1) {
			System.out.println("Invalid number - only accepting one");
		}
	}
	public static String remove2nd(String s) {
		int length = s.length();
		if(length > 2) {
			return s.charAt(0) + s.substring(2);
		}
		return "error";
	}


}
