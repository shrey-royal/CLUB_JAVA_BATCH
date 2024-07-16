import java.util.Scanner;

public class Scanner_T6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your password: ");
		String pass = sc.next();
		sc.close();
		
		if(validatePassword(pass)) {
			System.out.println("Password is valid.");
		} else {
			System.out.println("Password is invalid!");
		}
	}
	
	public static boolean validatePassword(String pass) {
		if(pass.length() < 8) {
			return false;
		}
		
		boolean hasDigits = false;
		boolean hasSpecialChar = false;
		
		for(int i=0; i<pass.length(); i++) {
			int asciiValue = (int)pass.charAt(i);
			
			if(asciiValue >= 48 && asciiValue <= 57) {
				hasDigits = true;
			}
			
			if( (asciiValue >= 33 && asciiValue <= 47) ||
				(asciiValue >= 58 && asciiValue <= 64) ||
				(asciiValue >= 91 && asciiValue <= 96) ||
				(asciiValue >= 123 && asciiValue <= 126)) {
				hasSpecialChar = true;
			}
		}
		
		return hasDigits && hasSpecialChar;
	}
}