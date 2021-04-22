package ogrenciTakip;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		Scanner kullaniciGirdisi = new Scanner(System.in);
		System.out.print("Listenizdeki öðrenci sayýsýný giriniz: ");
		int ogrenciSayisi = kullaniciGirdisi.nextInt();
		Ogrenci ogrenciListesi[] = new Ogrenci[ogrenciSayisi];
		
		int i=0;
		while(i<ogrenciSayisi) {
			ogrenciListesi[i] = new Ogrenci();
			System.out.println(i+1 + ". Öðrencinin Bilgileri:");
			System.out.print("Öðrencinin numarasýný giriniz: ");
			ogrenciListesi[i].ogr_no = kullaniciGirdisi.nextInt();
			System.out.print("Öðrencinin adýný ve soyadýný giriniz: ");
			ogrenciListesi[i].isim_soyisim = kullaniciGirdisi.next();
			System.out.print("Öðrencinin vize puanýný giriniz: ");
			ogrenciListesi[i].vize = kullaniciGirdisi.nextInt();
			System.out.print("Öðrencinin final puanýný giriniz: ");
			ogrenciListesi[i].final_puani = kullaniciGirdisi.nextInt();
			i++;
		}

		System.out.println("Öðrenci Bilgileri giriþi tamamlandý.");

		//Öðrenci sýralama
		System.out.println();
		System.out.println("****************************************");
		System.out.println("**** Geçme notuna göre sýralý liste ****");
		System.out.println("****************************************");
		
		Sorting siralama = new Sorting();
		siralama.ogrencileriSirala(ogrenciListesi, 0, ogrenciListesi.length);
		System.out.format("%10d%25s%10d", "No", "Ýsim-Soyisim", "Geçme Notu");
		for(Ogrenci ogrenci:siralama.ogrenciler) {
			System.out.format("%10d%25s%10d", ogrenci.ogr_no, ogrenci.isim_soyisim, ogrenci.getGecmeNotu());
		}
		
		//Öðrenci arama
		System.out.println();
		System.out.println("*****************************************");
		System.out.println("********** Öðrenci Arama Formu **********");
		System.out.println("*****************************************");

		System.out.print("Öðrencinin numarasýný giriniz: ");
		int ogrenciNumarasi = kullaniciGirdisi.nextInt();
		
		Searching aramaFormu = new Searching();
		Ogrenci ogrenci = aramaFormu.ogrenciAra(ogrenciListesi, ogrenciNumarasi);
		if(ogrenci != null) {
			System.out.println("Aranan Öðrenci:");
			System.out.println("Numarasý: " + ogrenci.ogr_no);
			System.out.println("Adý-Soyadý: " + ogrenci.isim_soyisim);
			System.out.println("Vize Puaný: " + ogrenci.vize);
			System.out.println("Final Puaný: " + ogrenci.final_puani);
			System.out.println("Geçme Notu " + ogrenci.getGecmeNotu());
			
		}

	}

}
