public class Main {
    public static void main(String[] args) {
        int number = -1;
        int remainder = number%2;  // remainder: kalan
        //System.out.println(remainder);
        boolean isPrime = true;

        if(number == 1){
            System.out.println("1 asal sayı değildir.");
            return;
        }
        if(number<1){
            System.out.println("Geçersiz sayı.");
            return;
        }
        for(int i=2; i<number; i++){
            if(number % i == 0){
                isPrime = false;
            }
        }
        if(isPrime){
            System.out.println("Sayı asaldır.");
        }else{
            System.out.println("Sayı asal değildir.");
        }
    }
}