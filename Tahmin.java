package project;
import java.util.*;

public class Tahmin {

	public static void main(String[] args) {
	
	int girdi;
	int sayi = 0;
	
		Random ran = new Random ();
		sayi = ran.nextInt(100);
		
		System.out.println("0 ile 100 arasinda rastgele bir sayi tutuldu..");
		System.out.println("Tahmininizi giriniz: " );
		
	do {
	    
		Scanner tahmin = new Scanner (System.in);
		girdi=tahmin.nextInt();
		
		if (girdi == sayi) {
			System.out.println("Tebrikler ! Dogru tahmin ettiniz..");
		}
		
		else if (girdi < sayi) {
			System.out.println("Lutfen daha buyuk bir sayi giriniz. ");
		
		}
		else if (girdi > sayi) {
			System.out.println("Lutfen daha kucuk bir sayi giriniz.");
			
		}
		
	} while (girdi != sayi);
		

}
}