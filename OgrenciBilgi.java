import java.util.Scanner;
public class OgrenciBilgi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Adınızı Giriniz: ");
        String ad = input.nextLine();

        System.out.print("Soyadınızı giriniz: ");
        String soyad = input.nextLine();

        System.out.print("öğrenci numaranız" );
        int öğrenciNo = input.nextInt();

        System.out.print("Yasınız" );
        int yas = input.nextInt();

        System.out.print("GPA (0.00-4.00");
        float gpa = input.nextFloat();

        //bilgiler ekrana bastırılıyor
        System.out.println("=== OGRENCI BİLGİ SİSTEMİ ===");
        System.out.printf("Ad Soyad: %s %s \n ", ad, soyad );
        System.out.printf("Qarenci No: %d" , öğrenciNo);
        System.out.printf("\n Yas: %d", yas);
        System. out.printf("\n GPA %.2f", gpa);

    }
}
        
      
