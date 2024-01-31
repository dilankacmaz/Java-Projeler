package _21010310033_Dilan_Kacmaz;



	public class _21010310033_islemler extends _21010310033_DosyaOkuma {

		   public static void islemler (String[]dosya) {
				
				kisisayisi= (dosya.length - 2*(sehirsayisi-1) - 5) /2;
				sehirler=new  String[sehirsayisi-1];
		        for(int i=1;i<sehirsayisi;i++) {
		        	
		        	sehirler[i-1]=dosya[i];
		        	
		        }
				
				sehirkodu=new String[sehirsayisi-1][2];
				for(int i=0;i<sehirler.length;i++) {
					String [] parca = sehirler[i].split(" ");
					sehirkodu[i][0]= parca[0];
					sehirkodu[i][1]= parca[1];
				}
				
				tablo=new String[sehirsayisi];
				for(int i=sehirsayisi+1;i<dosya.length-(2*kisisayisi+2);i++) {
					tablo[i-(sehirsayisi+1)]=dosya[i];
				}
				
				tablodurum =new String[sehirsayisi][sehirsayisi];
				
				for (int i = 0; i < sehirsayisi; i++) {
		            String[] satir = tablo[i].split("	");
		            for (int j = 0; j < sehirsayisi; j++) {
		                tablodurum[i][j] =satir[j];
		            }
		        }
				
				
				kisiler= new String[kisisayisi];
				for(int i=2*(sehirsayisi-1)+4;i<dosya.length-(kisisayisi+1);i++) {
					kisiler[i-(2*(sehirsayisi-1)+4)]=dosya[i];
				}
				
				String[] [] baslangic=new String[kisisayisi][2];
				for(int i=0;i<kisiler.length;i++) {
					String [] parca = kisiler[i].split(" ");
					baslangic[i][0]= parca[0];
					baslangic[i][1]= parca[1];
				}
			
				
			}
			
		}


