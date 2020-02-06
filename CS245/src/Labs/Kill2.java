package Labs;

public class Kill2 {
	
	public static void main(String[] args) {
	
		if(args.length != 1) {
			
			System.out.println("Invalid number - only accepting one");
			System.exit(0);
			
		}
		remove2nd(args[0]);
	}
	
	
	public static String remove2nd(String s) {
		int length = s.length();
		if(length > 1) {
			return s.charAt(0) + s.substring(2);
		}
		return "error";
		
		// s.substring(0,1)
		
	}


}
