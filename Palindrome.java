import java.util.Scanner;
public class Palindrome {
	
	private static char[] input;
	private static char[] dest;
	private static String i;
	
	private static String getInput() {
		Scanner keys = new Scanner(System.in);
		System.out.println("Input a potential palindrome.");
		i = keys.nextLine();
		return i;
		}
	private static char[] handleInput(String in) {
		input = in.toCharArray();
		return input;
		}
	
	private static char[] handleDestination(char[] in) {
		int end = in.length - 1;
		dest = new char[in.length];
		
		for (int t = 0; t < in.length; t++) {
			char temp = input[end];
			dest[t] = temp;
			end--;			
			}
		return dest;		
		}
	private static boolean pally(char[] in, char[] de) {
		boolean isPalindrome = false;
		String inp = new String(in);
		String des = new String(de);
		
		if (inp.equalsIgnoreCase(des)) {
			isPalindrome = true;
			}
		return isPalindrome;
		}			
	
	
	public static void main(String[] args) {
		getInput();
		handleInput(i);
		handleDestination(input);
		System.out.println(dest[1]);
		System.out.println(pally(input, dest));		
		}
	}
