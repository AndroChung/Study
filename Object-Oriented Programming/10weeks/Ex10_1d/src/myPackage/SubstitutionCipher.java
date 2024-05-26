package myPackage;

public class SubstitutionCipher implements MessageEncoder {
	private int shift;
	public SubstitutionCipher() {
		shift = 0;
	}
	SubstitutionCipher(int shift) {
		this.shift = shift;
	}
	public int getShift() {
		return shift;
	}
	public String encode(String plainText) {
		valid(plainText);
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < plainText.length(); i++) {
			buffer.append((char)(97 + ((plainText.charAt(i) - 97) + shift)%26));
		}
		return buffer.toString();
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
