import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        int km;
        double perKm =2.20, total = 10;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden giriniz : ");
        km = input.nextInt();

        // 20 liranın altındak ücretlerde minimum 20 tl almak için koşul kullanıyoruz.
        total += (km * perKm);
        total = (total < 20 ) ? 20: total;
        System.out.print("Toplam Tutar : " + total);

    }
}