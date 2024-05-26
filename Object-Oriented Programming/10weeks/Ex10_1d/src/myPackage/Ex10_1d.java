package myPackage;

public class Ex10_1d {

	public static void main(String[] args) {
		SubstitutionCipher sub1 = new SubstitutionCipher(3);
		SubstitutionCipher sub2 = new SubstitutionCipher(5);
		ShuffleCipher shuffle1 = new ShuffleCipher(2);
		ShuffleCipher shuffle2 = new ShuffleCipher(4);
		
		System.out.println("===SubstitutionCipher Test===");
		System.out.println("When \"abcdefghi\" shift " + sub1.getShift() + " times: " +
						sub1.encode("abcdefghi"));
		System.out.println("When \"apple\" shift " + sub2.getShift() + " times: " +
						sub2.encode("apple"));
		System.out.println();
		System.out.println("===ShuffleCipher Test===");
		System.out.println("When \"abcdefghi\" shuffle " + shuffle1.getN() + " times:" +
						shuffle1.encode("abcdefghi"));
		System.out.println("When \"pineapple\" shuffle " + shuffle2.getN() + " times:" +
					shuffle2.encode("pineapple"));
	}

}
