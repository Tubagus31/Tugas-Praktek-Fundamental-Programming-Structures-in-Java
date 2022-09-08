package TugasPraktikum3;
import java.util.Scanner;

public class Soal5 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		String mobil4 = input.nextLine();
		String[] gabung = mobil4.split(" ");
		String mobil = gabung[0] + gabung[1] + gabung[2] + gabung[3];
		long sum = Long.parseLong(mobil);
		sum -= 999999;
		if(sum % 5 == 0) {
			System.out.println("Jalan");
		} else {
			System.out.println("berhenti");
		}
	}
}
