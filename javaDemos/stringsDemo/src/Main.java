public class Main {
    public static void main(String[] args) {

       String mesaj = "Bugün hava çok güzel";
       System.out.println(mesaj);

       /*System.out.println("Eleman Sayısı : "+mesaj.length());
       System.out.println("5. Eleman :"+mesaj.charAt(4));
       System.out.println(mesaj.concat(" Yaşasın!"));
       System.out.println(mesaj.startsWith("B"));  // mesaj B harfi ile mi başlıyor True-False
        System.out.println(mesaj.endsWith("."));   // mesaj . ile mi bitiyor True-False
        char[]karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf("a"));*/

        //REPLACE FONKSİYONU
        String yeniMesaj = mesaj.replace(' ','-');
        System.out.println(yeniMesaj);
        //System.out.println(mesaj.replace(' ', '-'));

        //SUBSTRING FONKSİYONU
        System.out.println(mesaj.substring(2,4));

        //SPLIT FONKSİYONU
        for(String kelime : mesaj.split(" ")){
            System.out.println(kelime);
        }

        //TO LOWER CASE (tüm harfleri küçük harfe çeviriyor)
        System.out.println(mesaj.toLowerCase());

        // TO UPPER CASE (tüm harfleri büyük harfe çeviriyor
         System.out.println(mesaj.toUpperCase());

         //TRIM (baştaki ve sondaki boşlukları siler)
        System.out.println(mesaj.trim());

    }
}