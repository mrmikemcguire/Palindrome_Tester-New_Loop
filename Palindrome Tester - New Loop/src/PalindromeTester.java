import java.util.Scanner;

public class PalindromeTester
	{
		public static void main(String[] args)
			{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Please input your word.");
			String word = userInput.next();
			String [] s = word.split("");

			for(int beg = 0, end = s.length - 1; beg <= end; beg++, end--)
				{
				if (!s[beg].equals(s[end]))
					{
					System.out.println("Not a palindrome");
					System.exit(0);
					}
				}
			System.out.println("Palindrome");
			}
	}
