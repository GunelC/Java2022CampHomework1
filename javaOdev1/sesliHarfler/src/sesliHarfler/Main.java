package sesliHarfler;

public class Main {

	public static void main(String[] args) {
    
		char harf = 'A';

		switch (harf) {
		case 'A', 'a', 'O', 'o', 'U', 'u', 'I', 'ı':
			System.out.println("kalın");
			break;

		case 'İ', 'i', 'E', 'e', 'Ü', 'ü', 'Ö', 'ö':
			System.out.println("ince");
			break;
		default:
			System.out.println("Sesli harf giriniz");

		}
	}

}
