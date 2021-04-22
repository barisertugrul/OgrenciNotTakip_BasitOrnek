package ogrenciTakip;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		Scanner kullaniciGirdisi = new Scanner(System.in);
		System.out.print("Listenizdeki ��renci say�s�n� giriniz: ");
		int ogrenciSayisi = kullaniciGirdisi.nextInt();
		Ogrenci ogrenciListesi[] = new Ogrenci[ogrenciSayisi];
		
		int i=0;
		while(i<ogrenciSayisi) {
			ogrenciListesi[i] = new Ogrenci();
			System.out.println(i+1 + ". ��rencinin Bilgileri:");
			System.out.print("��rencinin numaras�n� giriniz: ");
			ogrenciListesi[i].ogr_no = kullaniciGirdisi.nextInt();
			kullaniciGirdisi.nextLine();
			System.out.print("��rencinin ad�n� ve soyad�n� giriniz: ");
			ogrenciListesi[i].isim_soyisim = kullaniciGirdisi.next();
			kullaniciGirdisi.nextLine();
			System.out.print("��rencinin vize puan�n� giriniz: ");
			ogrenciListesi[i].vize = kullaniciGirdisi.nextInt();
			kullaniciGirdisi.nextLine();
			System.out.print("��rencinin final puan�n� giriniz: ");
			ogrenciListesi[i].final_puani = kullaniciGirdisi.nextInt();
			i++;
		}

		System.out.println("��renci Bilgileri giri�i tamamland�.");

		//��renci s�ralama
		System.out.println();
		System.out.println("****************************************");
		System.out.println("**** Ge�me notuna g�re s�ral� liste ****");
		System.out.println("****************************************");
		
		Sorting siralama = new Sorting();
		siralama.ogrencileriSirala(ogrenciListesi, 0, ogrenciListesi.length-1);
		System.out.format("%10s%30s%12s", "No", "�sim-Soyisim", "Ge�me Notu\n");
		for(Ogrenci ogrenci:siralama.ogrenciler) {
			System.out.format("%10d%30s%12f\n", ogrenci.ogr_no, ogrenci.isim_soyisim, ogrenci.getGecmeNotu());
		}
		
		//��renci arama
		System.out.println();
		System.out.println("*****************************************");
		System.out.println("********** ��renci Arama Formu **********");
		System.out.println("*****************************************");

		System.out.print("��rencinin numaras�n� giriniz: ");
		
		int ogrenciNumarasi = kullaniciGirdisi.nextInt();
		
		Searching aramaFormu = new Searching();
		Ogrenci ogrenci = aramaFormu.ogrenciAra(ogrenciListesi, ogrenciNumarasi);
		if(ogrenci != null) {
			System.out.println("Aranan ��renci:");
			System.out.println("Numaras�: " + ogrenci.ogr_no);
			System.out.println("Ad�-Soyad�: " + ogrenci.isim_soyisim);
			System.out.println("Vize Puan�: " + ogrenci.vize);
			System.out.println("Final Puan�: " + ogrenci.final_puani);
			System.out.println("Ge�me Notu " + ogrenci.getGecmeNotu());
			
		}

	}

}
