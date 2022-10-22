import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, newPassword;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adı giriniz :");
        userName = input.nextLine();
        System.out.print("Şifre giriniz : ");
        password = input.nextLine();

        if(userName.equals("Bora") && password.equals("Alis")){
            System.out.println("Giriş Başarılı !");
        } else {
            int select;
            System.out.println("Hatalı Kullanıcı adı veya Şifre !!!\nSıfırlamak için\nevet = 1, hayır = 2");
            select = input.nextByte();

        switch(select){
            case 1 :
                Scanner yenisifre = new Scanner(System.in);
                System.out.print("Yeni Şifre Giriniz :");
                newPassword = yenisifre.nextLine();
                if(newPassword.equals(password)){
                    System.out.println("Eski şifreniz ile aynı şifre girdiniz !");
                } else{
                    System.out.println("Şifre başarıyla değiştirildi !");
                }
                break;
            case 2 :
                System.out.println("Sistemden çıkış yapılıyor !");
                break;

            }

        }

    }
}