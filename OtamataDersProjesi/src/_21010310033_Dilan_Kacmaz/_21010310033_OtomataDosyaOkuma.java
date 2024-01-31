package _21010310033_Dilan_Kacmaz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class _21010310033_OtomataDosyaOkuma {

	public ArrayList<String> dosya = new ArrayList<String>();
	public ArrayList<String> degiskenler = new ArrayList<String>();
	public ArrayList<String> array2 = new ArrayList<String>();
	public String baslangicState = null;

	public void dosyaOkuma() throws IOException {

		File FST = new File("FST.txt");

		if (FST.exists()) {
			System.out.println("FST.txt dosyası okundu");
		} else {
			System.out.println("bulunamadı");
		}

		FileReader fileReader = new FileReader("FST.txt");
		BufferedReader buffer = new BufferedReader(fileReader);
		String satir;

		while ((satir = buffer.readLine()) != null) {
			dosya.add(satir);
		}
		baslangicState = dosya.get(dosya.size() - 1);
		baslangicState = baslangicState.substring(4, baslangicState.length()).trim();
		ekleme(dosya);

	}

	public void ekleme(ArrayList<String> dosya) {
		String state = dosya.get(0);
		String dizi2 = dosya.get(1);

		String a = state.replace("{", "");
		a = a.replace("}", "");
		a = a.replace(",", "");
		a = a.replace("= ", "");
		String[] first = a.split(" ");

		for (int i = 0; i < first.length; i++) {
			degiskenler.add(first[i]);
		}
		if (!degiskenler.isEmpty()) {
			degiskenler.remove(0);
		}

		String b = dizi2.replace("{", "");
		b = b.replace("}", "");
		b = b.replace(",", "");
		b = b.replace("= ", "");
		String[] arrayy2 = b.split(" ");

		for (int i = 0; i < arrayy2.length; i++) {
			array2.add(arrayy2[i]);
		}
		if (!array2.isEmpty()) {
			array2.remove(0);
		}

	}

}
