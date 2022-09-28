public class Main {
    public static void main(String[] args) {
        /*String ogrenci1="Buğra";
        String ogrenci2="Furkan";
        String ogrenci3="Güven";

        System.out.println(ogrenci1);*/

        String[] ogrenciler = new String[4];
        ogrenciler[0]="Buğra";
        ogrenciler[1]="Furkan";
        ogrenciler[2]="Güven";
        ogrenciler[3]="Emel";

        for(String ogrenci : ogrenciler){  // bu yöntem aşağıdaki yönteme göre daha sık kullanılıyor
            System.out.println(ogrenci);
        }
        System.out.println("-----------------------");

        for(int i=0; i<ogrenciler.length; i++){  // bu yöntem yukarıdaki yönteme göre daha az kullanılıyor
            System.out.println(ogrenciler[i]);
        }
    }
}