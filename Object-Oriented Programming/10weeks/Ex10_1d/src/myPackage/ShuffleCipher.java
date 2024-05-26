package myPackage;

public class ShuffleCipher implements MessageEncoder {
	private int n;
	public ShuffleCipher() {
		n = 0;
	}
	public int getN() {
		return n;
	}
	public ShuffleCipher(int n) {
		this.n = n;
	}
	public String encode(String plainText) {
		valid(plainText);
		StringBuffer newText = new StringBuffer(plainText);
		for (int i = 0; i < n; i++) {
			int sign = 1;
			int newIndex = 0;
			int middleIndex = (int)Math.ceil(newText.length()/2.0);
			StringBuffer buffer = new StringBuffer();
			for (int j = 0; j < newText.length(); j++) {
				buffer.append(newText.charAt(newIndex + j/2));
				newIndex += sign*middleIndex;
				sign = -sign;
			}
			newText.replace(0, newText.length(), buffer.toString());
		}
		return newText.toString();
	}
	private boolean valid(String plainText) {
		for (int i = 0; i < plainText.length(); i++) {
			if (plainText.charAt(i) < 'a' || plainText.charAt(i) > 'z') {
				System.out.println("Illegal Text!");
				System.exit(0);
			}
		}
		return true;
	}

}
