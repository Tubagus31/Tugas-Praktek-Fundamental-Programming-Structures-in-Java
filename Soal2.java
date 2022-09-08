package TugasPraktikum3;
import java.util.Scanner;

public class Soal2 {
	public static void main(String[] args) {
		Scanner inputan = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			String s = inputan.next();
			int angka=inputan.nextInt();
			System.out.printf("%=15s", s);
			System.out.printf("%03d\n", angka );
		}
	}
}
