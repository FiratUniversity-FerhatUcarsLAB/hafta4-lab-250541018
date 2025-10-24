
import java.util.Scanner;
import java.text.DecimalFormat;

public class MaasHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat para = new DecimalFormat("###,##0.00");
        DecimalFormat yuzde = new DecimalFormat("0.0");

        // Sabit oranlar
        final double SGK_ORANI = 0.14;
        final double GELIR_VERGISI_ORANI = 0.15;
        final double DAMGA_VERGISI_ORANI = 0.00759; // dikkat: 0.00759 olacak

        // Bilgi girişi
        System.out.print("Çalışan Adı Soyadı: ");
        String adSoyad = input.nextLine();

        System.out.print("Aylık Brüt Maaş (TL): ");
        double brutMaas = input.nextDouble();

        System.out.print("Haftalık Çalışma Saati: ");
        int haftalikSaat = input.nextInt();

        System.out.print("Mesai Saati Sayısı: ");
        int mesaiSaat = input.nextInt();

        // 1. Gelirler
        double mesaiUcreti = (brutMaas / 160) * mesaiSaat * 1.5;
        double toplamGelir = brutMaas + mesaiUcreti;

        // 2. Kesintiler
        double sgk = toplamGelir * SGK_ORANI;
        double gelirVergisi = toplamGelir * GELIR_VERGISI_ORANI;
        double damgaVergisi = toplamGelir * DAMGA_VERGISI_ORANI;
        double toplamKesinti = sgk + gelirVergisi + damgaVergisi;

        // 3. Net Maaş
        double netMaas = toplamGelir - toplamKesinti;

        // 4. İstatistikler
        double kesintiOrani = (toplamKesinti / toplamGelir) * 100;
        double saatlikNetKazanc = netMaas / 176;
        double gunlukNetKazanc = netMaas / 22;

        // Çıktı
        System.out.println("\n========== MAAŞ BORDROSU ==========");
        System.out.println("Çalışan: " + adSoyad);
        System.out.println("-----------------------------------");
        System.out.println("Brüt Maaş:          " + para.format(brutMaas) + " TL");
        System.out.println("Mesai Ücreti:       " + para.format(mesaiUcreti) + " TL");
        System.out.println("Toplam Gelir:       " + para.format(toplamGelir) + " TL");
        System.out.println("-----------------------------------");
        System.out.println("SGK (%14):           -" + para.format(sgk) + " TL");
        System.out.println("Gelir Vergisi (%15): -" + para.format(gelirVergisi) + " TL");
        System.out.println("Damga Vergisi (%0.76): -" + para.format(damgaVergisi) + " TL");
        System.out.println("Toplam Kesinti:     -" + para.format(toplamKesinti) + " TL");
        System.out.println("-----------------------------------");
        System.out.println("Net Maaş:           " + para.format(netMaas) + " TL");
        System.out.println("-----------------------------------");
        System.out.println("Kesinti Oranı:      %" + yuzde.format(kesintiOrani));
        System.out.println("Saatlik Net Kazanç: " + para.format(saatlikNetKazanc) + " TL");
        System.out.println("Günlük Net Kazanç:  " + para.format(gunlukNetKazanc) + " TL");
        System.out.println("===================================");
        
        input.close();
    }
}
