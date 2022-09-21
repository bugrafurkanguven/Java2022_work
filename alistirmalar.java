package intro;

public class alistirmalar {

	public static void main(String[] args) {
		int[] sayilar = new int [] {1,2,3,4,5,6,7,8,9,10};
		int aranacak = 3;
		
		boolean varMi = sayiBul(sayilar,aranacak);
		
		
		mesajVer(varMi,aranacak);
		
}
	public static void mesajVer(boolean varMi, int aranacak) { 
		
		String mesaj = "";
		if(varMi == true) {
			mesaj = "Sayı Var:" + aranacak;
			System.out.println(mesaj);
		}else {
			mesaj ="Sayı Yok:" + aranacak ;
			System.out.println(mesaj);
		}
		
	}
	public static boolean sayiBul(int[] sayilar, int aranacak) {
        boolean varMi = false;
		 
		
		for(int sayi : sayilar) {
		   if(sayi == aranacak) {
			 varMi = true;
			 break;
		 }
        }
		
		return varMi;
	}
	
}

//Bir foksiyon yaz - bool döndürsün - sayiBul
//İki parametre aslın. P1: dizi gönder,  P2:3 (aranacak sayıyı gir)
//Ekrana 3 sayısı dizide vardır/yoktur yazsın     