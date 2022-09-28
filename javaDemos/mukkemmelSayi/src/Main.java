public class Main {
    public static void main(String[] args) {
        //Mükkemmel sayı nedir: kendisinden başka pozitif tam bölenlerinin sayısı kendisine eşit olan sayıya denir
        //Örn: 6--->1,2,3
        //Örn:28--->1,2,7,14 vb.
        int number = 6;
        int total = 0;

        for(int i=1; i<number; i++ ){
            if(number % i == 0 ){
                total = total + i;
            }
        }
        if(total == number){
            System.out.println("Sayı mükkemmel sayıdır");
        }else{
            System.out.println("Sayı mükkemmel sayı değildir");
        }

    }
}