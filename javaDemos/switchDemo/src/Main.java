import java.awt.desktop.SystemSleepEvent;

public class Main {
    public static void main(String[] args) {
        char grade = 'D';

        switch (grade){
            case 'A':
                System.out.println("Mükkemmel Geçti");
                break;
            case 'B':
                System.out.println("Geçti");
                break;
            case 'C':
                System.out.println("Şartlı");
                break;
            case 'F':
                System.out.println("Kaldı");
                break;
            default:
                System.out.println("Geçersiz Not Girdiniz");

        }
    }
}