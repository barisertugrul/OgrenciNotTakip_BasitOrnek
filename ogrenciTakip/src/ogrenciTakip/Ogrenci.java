package ogrenciTakip;

public class Ogrenci {
	
	int ogr_no;
	String isim_soyisim;
	int vize;
	int final_puani; //Sadece final ad�, javaya ait bir isimlendirme oldu�u i�in kullan�lam�yor
	
	//Parametre g�ndrerek hesaplama
	public double gecmeNotuHesapla(int vizeNotu,int finalNotu) {
		double gecmeNotu = (0.3 * vizeNotu) + (0.7 * finalNotu);
		return gecmeNotu;
	}
	
	//S�n�f �zelli�ine ba�l� hesaplama
	public double getGecmeNotu() {
		double gecmeNotu = (0.3 * vize) + (0.7 * final_puani);
		return gecmeNotu;
	}

}
