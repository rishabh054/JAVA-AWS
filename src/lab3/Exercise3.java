package lab3;

public class Exercise3 {

	public static void main(String[] args) {
		Exercise3 ex = new Exercise3();
		String s = "jAAaavvVVvvaaaaavva";
		System.out.println(ex.replaceConsonants(s.toCharArray()));
	}

	public boolean isVowel(char ch) {
		if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != 'A' && ch != 'E' && ch != 'I' &&
				ch != 'O' && ch != 'U') {
			return false;
		}
		return true;
	}

	public String replaceConsonants(char[] s) {

		for (int i = 0; i < s.length; i++) {
			if (!isVowel(s[i])) {

				if (s[i] == 'z') {
					s[i] = 'b';
				}
				
				if (s[i] == 'Z') {
					s[i] = 'B';
				}

				else {

					s[i] = (char) (s[i] + 1);

				}
			}
		}
		return String.valueOf(s);
	}

}
