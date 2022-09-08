package TugasPraktikum3;
import java.util.*;
import java.util.stream.Collectors;

public class Soal1{
	public static void main(String[]args) {
		String s = "";
		do {
			Scanner input = new Scanner(System.in);
			System.out.print("Input String:");
			s = input.nextLine();
			if (s.length() < 1)
				System.out.println("Inputkan teks ");	
		}while (s.length() < 1);
		String[] words = s.split(" |\\!|\\,|\\?|\\.|\\_|\\'|\\@");
		int n = words.length;
		
		System.out.println(n);
		for (String w : words){
			System.out.println(w);
		}
	}
}
