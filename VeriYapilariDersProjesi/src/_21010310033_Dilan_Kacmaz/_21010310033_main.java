package _21010310033_Dilan_Kacmaz;

import java.io.IOException;

public class _21010310033_main {

	public static void main(String[] args) throws IOException {
		_21010310033_DosyaOkuma yeni = new _21010310033_DosyaOkuma();
		yeni.dosyaOkuma();
		_21010310033_islemler.islemler(yeni.dosya);
		_21010310033_BirinciDurum.birincidurum(yeni.dosya);
		_21010310033_ikinciDurum.ikincidurum(yeni.dosya);
		_21010310033_ucuncuDurum.ucuncudurum(yeni.dosya);
		_21010310033_dorduncuDurum.dorduncudurum(yeni.dosya);
		
	}

}
