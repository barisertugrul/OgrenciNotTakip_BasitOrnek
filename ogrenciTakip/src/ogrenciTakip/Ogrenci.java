package ogrenciTakip;

public class Ogrenci {
	
	int ogr_no;
	String isim_soyisim;
	int vize;
	int final_puani; //Sadece final adý, javaya ait bir isimlendirme olduðu için kullanýlamýyor
	
	//Parametre göndrerek hesaplama
	public double gecmeNotuHesapla(int vizeNotu,int finalNotu) {
		double gecmeNotu = (0.3 * vizeNotu) + (0.7 * finalNotu);
		return gecmeNotu;
	}
	
	//Sýnýf özelliðine baðlý hesaplama
	public double getGecmeNotu() {
		double gecmeNotu = (0.3 * vize) + (0.7 * final_puani);
		return gecmeNotu;
	}

}
