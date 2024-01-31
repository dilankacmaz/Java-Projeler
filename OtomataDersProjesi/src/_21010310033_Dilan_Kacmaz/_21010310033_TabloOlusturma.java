package _21010310033_Dilan_Kacmaz;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class _21010310033_TabloOlusturma {
	
	public String ekle;
	public int sayac= 0;
	public String a; 
	public String state=null;
	public ArrayList<String>tablo= new ArrayList<String>();
	public ArrayList<String >dosya=new ArrayList<String>(); 
	public ArrayList<String >ciktilar=new ArrayList<String>(); 
	public ArrayList<String>girdiDegiskenleri_array=new ArrayList<String>();
	
	
	public void tabloOlustur() throws IOException {
		
		_21010310033_OtomataDosyaOkuma dosyaOkuma = new _21010310033_OtomataDosyaOkuma();
		dosyaOkuma.dosyaOkuma();
		state = dosyaOkuma.baslangicState;
		ciktilar.add(state);
		dosya.addAll(dosyaOkuma.dosya);
		girdiDegiskenleri_array.addAll(dosyaOkuma.array2);
		
		for(int i=4;i<dosya.size()-1;i++) {
			 ekle= dosya.get(i);
			 
			 for(int j=0;j<1;j++) {
	           		a=ekle.replace("(",""); 
	           		a=a.replace(")", "");
	           		a=a.replace(",", "");
	           		a=a.replace("	", " ");
	           		String[]dizi=a.split(" ");
	           		
	           		for(int k=0;k<dizi.length;k++) {
	           			tablo.add(dizi[k]);	
	           		}
			 }
		}
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen birinci input’u giriniz:");
		String input1=input.nextLine();
		String x;
		for (int i = 0; i < input1.length(); i++) {
			x=input1.substring(i,i+1);
			gecisler(x);
		}
		yazdir();
		ciktilar.removeAll(ciktilar);
		state=dosyaOkuma.baslangicState;
		ciktilar.add(state);
		System.out.println("Lütfen ikinci input’u giriniz:");
		input1=input.nextLine();
		x="";
		for (int i = 0; i < input1.length(); i++) {
			x=input1.substring(i,i+1);
			gecisler(x);
		}
		yazdir();
	}
	
	public void gecisler(String input) {
		int satir_sayisi=girdiDegiskenleri_array.size()*2;
		int temp=2;
		int satir_index=0;
		
		int girdi_index=girdiDegiskenleri_array.lastIndexOf(input)+1;
		
		for (int i = 0; i < tablo.size(); i+=satir_sayisi+1) {
			if(state.equals(tablo.get(i))) {
				state=tablo.get(i);
				satir_index=i;
				break;
			}
		}
		temp=temp*girdi_index;
		for (int index = 2; index < tablo.size(); index+=2) {
			
			if(satir_index%2==0) {
				
				if(satir_index==0) {
					ciktilar.add(tablo.get((index*girdi_index)-1));
					state=tablo.get((index*girdi_index)-1);
					ciktilar.add(tablo.get((index*girdi_index)));
					break;
				}else if(((temp>satir_index)&&(temp<satir_index+satir_sayisi+1))) {
					ciktilar.add(tablo.get(temp-1));
					state=tablo.get(temp-1);
					ciktilar.add(tablo.get(temp));
					break;
				}else {
					temp+=satir_index;
				}
				
			}
			else {
				index+=2;
				if((temp>satir_index)&&(temp<satir_index+satir_sayisi+1)) {
					ciktilar.add(tablo.get(temp-1));
					state=tablo.get(temp-1);
					ciktilar.add(tablo.get(temp));
					break;
				}else {
					temp+=satir_index;
				}
			}
		}
		
	}
	
	public void yazdir() {
		System.out.println();
		System.out.print(ciktilar.get(0)+",");
		for (int i = 1; i < ciktilar.size(); i+=2) {
			if(i!=ciktilar.size()-2) {
				System.out.print(ciktilar.get(i)+",");
			}else {
				System.out.println(ciktilar.get(i));
			}
			
		}
		System.out.println();
		System.out.print("Çýktý = ");
		for (int i = 2; i < ciktilar.size(); i+=2) {
			System.out.print(ciktilar.get(i));
		}
		System.out.println();
		
	}

}
