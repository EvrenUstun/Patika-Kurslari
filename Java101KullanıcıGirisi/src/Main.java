import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String userName, password, newPassword;
        byte choice;

        System.out.print("Kullanıcı Adınız : ");
        userName = input.nextLine();

        System.out.print("Şifreniz : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Başarılı!");
        } else {
            if (userName.equals("patika")) {
                System.out.println("Hatalı şifre. Şifrenizi sıfırlamak ister misiniz?");
                System.out.println("1- Evet / 2- Hayır");
                System.out.print("Seçiminiz : ");

                choice = input.nextByte();

                if (choice == 1) {
                    password = "java123";
                    System.out.println("Lütfen yeni şifrenizi giriniz : ");
                    newPassword = input.next();

                    System.out.println("\n");

                    if (newPassword.equals(password)) {
                        System.out.println("Şifre oluşturulamadı, lütfen daha sonra tekrar deneyiniz.");
                    } else {
                        password = newPassword;
                        System.out.println("Şifre başarıyla oluşturuldu.");
                    }

                } else {
                    System.out.println("İyi günler...");
                }
            } else {
                System.out.println("Böyle bir kullanıcı bulunamadı. " + "(Kullanıcı Adı: " + userName + ")");
            }


        }

    }
}