package _21010310033_Dilan_Kacmaz;
import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.Scanner;
public class _21010310033_DosyaOkuma {
	

		public static String[] dosya;
		public static String[] sehirler;
		public static String[]tablo;
		public static String[]kisiler;
		public static String[]sefer;
		public static String[] []sehirkodu;
		public static String[] []tablodurum ;
		
		public static int sehirsayisi=0;
		public static int kisisayisi=0;
		
		
		public static void dosyaOkuma() throws IOException {

			File Bilgiler = new File("Bilgiler.txt");

			if (Bilgiler.exists()) {
				System.out.println("Bilgiler.txt dosyasý okundu");
			} else {
				System.out.println("bulunamadI");
			}

			FileReader fileReader = new FileReader("Bilgiler.txt");
			BufferedReader buffer = new BufferedReader(fileReader);
			
			int sayac=0;
			while(buffer.readLine() !=null) {
				sayac++;
			}

			fileReader = new FileReader("Bilgiler.txt");
			buffer = new BufferedReader(fileReader);
			
			dosya=new String[sayac];
			
			int index=0;
			String satir;
			
			while ((satir = buffer.readLine()) != null) {
				dosya[index++]=satir;
				
				
				if (satir.contains("\t")) {
	                sehirsayisi++;
	            }
				
			}
			       
		}

	}


