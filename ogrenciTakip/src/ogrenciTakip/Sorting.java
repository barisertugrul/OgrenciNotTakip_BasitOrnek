package ogrenciTakip;

public class Sorting {
	Ogrenci[] ogrenciler;
	void ogrencileriSirala(Ogrenci[] ogrenciListesi, int altindis, int üstindis) {

		ogrenciler = ogrenciListesi;
		
		int i = altindis, j = üstindis;
		Ogrenci h;
		
		double ortaNot = ogrenciler[(altindis + üstindis) / 2].getGecmeNotu();
		
		do {
			while (ogrenciler[i].getGecmeNotu() < ortaNot)
				i++;
			while (ogrenciler[j].getGecmeNotu() > ortaNot)
				j--;
			if (i <= j) {
				h = ogrenciler[i];
				ogrenciler[i] = ogrenciler[j];
				ogrenciler[j] = h;
				i++;
				j--;
			}
		} while (i <= j);
		
		if (altindis < j)
			ogrencileriSirala(ogrenciler, altindis, j);
		if (i < üstindis)
			ogrencileriSirala(ogrenciler, i, üstindis);
	}
}
