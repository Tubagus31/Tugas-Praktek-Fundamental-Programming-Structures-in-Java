package TugasPraktikum3;
import java.util.Scanner;

public class Soal3 {
	 public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	     double angka1, angka2, penjumlahan, pengurangan, perkalian, pembagian;
	     char operasi;

	     while (true) {
	         System.out.println("Input angka: ");
	         angka1 = in.nextDouble();
	         operasi = in.next().charAt(0);
	         angka2 = in.nextDouble();

	         switch (operasi) {
		         case '+' -> {
		         	penjumlahan = angka1 + angka2;
		         	System.out.println(penjumlahan);
		         }
		         case '-' -> {
		        	 pengurangan = angka1 - angka2;
		        	 System.out.println(pengurangan);
		         }
		         case '*' -> {
		             perkalian = angka1 * angka2;
		             System.out.println(perkalian);
		         }
		         case '/' -> {
		             pembagian = angka1 / angka2;
		             System.out.println(pembagian);
		         }
		         case '%' -> {
		             pembagian = angka1 % angka2;
		             System.out.println(pembagian);
		         }
	         }
	     }
	 }
}
