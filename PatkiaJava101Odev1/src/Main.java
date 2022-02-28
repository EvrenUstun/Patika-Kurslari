import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenler oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;

        // Scanner sınıfımızı tanımladık.
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan Değerleri al
        System.out.println("Matematik notunu giriniz : ");
        mat = inp.nextInt();

        System.out.println("Fizik notunu giriniz : ");
        fizik = inp.nextInt();

        System.out.println("Kimya notunu giriniz : ");
        kimya = inp.nextInt();

        System.out.println("Türkçe notunu giriniz : ");
        turkce = inp.nextInt();

        System.out.println("Tarih notunu giriniz : ");
        tarih = inp.nextInt();

        System.out.println("Müzik notunu giriniz : ");
        muzik = inp.nextInt();

        double ort = (fizik + kimya + mat + turkce + tarih + muzik) / 6;
        System.out.println("Not ortalaması : " + ort);

        System.out.println(ort > 60 ? "Sınıfı geçtiniz" : "Sınıfta kaldınız");
    }
}