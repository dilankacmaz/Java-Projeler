import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class _21010310033_DosyaOku {
	public static String[] dosya;

	public static void dosyaOkuma() throws IOException {

		File RAM = new File("RAM.txt");

		if (RAM.exists()) {
			System.out.println("RAM.txt dosyasý okundu");
		} else {
			System.out.println("bulunamadI");
		}

		FileReader fileReader = new FileReader("RAM.txt");
		BufferedReader buffer = new BufferedReader(fileReader);
		
		int sayac=0;
		while(buffer.readLine() !=null) {
			sayac++;
		}

		fileReader = new FileReader("RAM.txt");
		buffer = new BufferedReader(fileReader);
		
		dosya = new String[sayac];
		
		int index=0;
		String satir;
		while ((satir = buffer.readLine()) != null) {
			dosya[index++]=satir;
		}
		
		
		

	}

}
