package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		//değişken isimlendirmeleri javada camelCase yazılır
		String ortaMetin ="ilginizi çekebilir";
		String altMetin = "Vade süresi";
		
		System.out.println(ortaMetin);
		//**********DEĞİŞKENLER**********
		
		//Örnekler
		//int = integer (tam sayı)
		int vade =12;
		
		// double (ondalıklı sayı)
		double dolarDun =18.25;
		double dolarBugun =18.20;
		
	    boolean dolarDustuMu = false;
		
	    String okYonu = "";
	    //**********ŞART BLOKLARI**********
	    
	    //örnek1
	    if (dolarBugun<dolarDun) { 
	    	okYonu = "down.svg";
			System.out.println(okYonu);
		} else if(dolarBugun>dolarDun) {
			okYonu = "up.svg";
		}
	    else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
			    
		}
	    //**********DÖNGÜLER**********
	    
		//Array
	    String[] krediler = {"Hızlı Kredi","Maaşını Halkbanktan Alanlar","Mutlu Emekli"};
	    
	    //örnek1	    
	    for (int i = 0; i < krediler.length; i++) {
	    	System.out.println(krediler[i]);
	}
	    //örnek2
	    for(int i=1;i<=15;i++) {
	    	System.out.println(i);
	    }
	    //örnek3
	    String urun = "Laptop";
	    for(int i=1;i<10;i++) {
	    	System.out.println(urun + i);
	    }
	    //While
	    int sayi=10;
	    while(sayi<100) {
	    	sayi=sayi+10;
	    	System.out.println(sayi);
	    }
	    
	    //Do While
	    int sayi2 = 11;
	    do {
	    	System.out.println(sayi2);
	    	sayi =sayi+10;
	    } while (sayi2>100);
	
        
	
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
	}
