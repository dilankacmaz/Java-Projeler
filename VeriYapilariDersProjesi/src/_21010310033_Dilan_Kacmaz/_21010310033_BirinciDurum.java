package _21010310033_Dilan_Kacmaz;



	import java.util.Scanner;

	public class _21010310033_BirinciDurum extends _21010310033_DosyaOkuma {

		public static void birincidurum(String[]dosya) {
			Scanner scan=new Scanner(System.in);
			int toplam=0;
			double hiz=0.0;
			sefer= new String[kisisayisi];
			for(int i=(kisisayisi+2)+(2*sehirsayisi+1);i<dosya.length;i++) {
				sefer[i-((kisisayisi+2)+(2*sehirsayisi+1))]=dosya[i];
			}
		
			System.out.println("Varýþ süresi hesaplanacak olan kiþinin ismini giriniz:" );
			String input=scan.nextLine();
			
			for(int i=0;i<sefer.length;i++) {
				String []dizi = sefer[i].split(" ");
				String isimtut = dizi[0];
				String hiztut= dizi[2];
				hiztut=hiztut.replace(",", ".");
			    hiz=Double.parseDouble(hiztut);
				String []hedefler=dizi[1].split("-");
				
				
				
				
		   if(input.equals(isimtut)) {
			 
			   for(int j=0;j<hedefler.length-1;j++) {
				   for(int k=0;k<sehirkodu.length;k++) {
					
				   if(hedefler[j].equals(sehirkodu[k][0])) { 
					   
					   String degerr1=sehirkodu[k][1];
				       int deger1 = Integer.parseInt(degerr1);
				       for(int a=0;a<sehirkodu.length;a++) {
				    	   if(hedefler[j+1].equals(sehirkodu[a][0])){
				    		   String degerr2=sehirkodu[a][1];
				    		   int deger2 = Integer.parseInt(degerr2);
				   
								   String toplamm=tablodurum[deger1][deger2]; 	  
								   int yeni =  Integer.parseInt(toplamm);
								   toplam = toplam + yeni;
								   
				    	   }
				       }
					  
				   }
			   }
				   
		   }
			   int deger = (int) (toplam/hiz);
			 System.out.println(isimtut+" "+hedefler[hedefler.length-1]+" varýþ süresi "+deger+" dk");  
		   }	
			}
		   
		}
	}


