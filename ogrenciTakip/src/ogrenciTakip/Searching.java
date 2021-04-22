package ogrenciTakip;

import java.util.Arrays;

public class Searching {
	
	public Ogrenci ogrenciAra(Ogrenci[] ogrenciListesi, int ogrenciNumarasi) {
		int[] numaraListesi = new int[ogrenciListesi.length];
		
		for(Ogrenci ogrenci:ogrenciListesi) {
			numaraListesi[Arrays.asList(ogrenciListesi).indexOf(ogrenci)] = ogrenci.ogr_no;
		}
		int bulunan = Arrays.binarySearch(numaraListesi, ogrenciNumarasi);
		if(bulunan > -1)
			return ogrenciListesi[bulunan];
		else
			return null;
	}
	
}
