
public class PalindromeTester
	{
		public static void main(String[] args)
			{
			String [] s = {"d", "a", "k", "a", "d"};

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
