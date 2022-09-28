public class Main {
    public static void main(String[] args) {
        /*double[] myList = new double[4];
        double number1 = 1.2;
        double number2 = 1.3;
        double number3 = 1.4;
        double number4 = 1.5;*/

        double[] myList = {1.2,3.3,1.4,1.5};  // ŞEKLİNDE DE SÜSLÜ PARANTEZ İÇİNE ARRAYLERİMİZİ YAZABİLİRİZ
        double total =0;
        double max = myList[0];     // max = değişken ismi

        for(double number: myList){
            if(max<number){
                max = number;
            }
            total = total+number;
            System.out.println(number);
        }
        System.out.println("Toplam: "+total);
        System.out.println("En Büyük:"+ max);
    }
}