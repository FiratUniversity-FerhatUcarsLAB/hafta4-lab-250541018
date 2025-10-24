
import java.util.Scanner;

public class GeometnikHesap {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       //yaricap bilgisi al
       System.out.println("Daire yaricapini giriniz (cm):");
       double yaricap = input.nextDouble();

       //pi saxisi tanimLama
       float pi = 3.14159f;
       //Matematiksel islemler

       System.out.println("'SONUCLAR");
       System.out.println("-------------");

       double alan = pi * yaricap * yaricap;
       System.out printf ("Daire alanı: %.2f cm^2", alan);

       double cevre = 2 * pi * yaricap;
       System.out.printf("\nDaire cevre: %.2f cm ", cevre);

       double cap = 2 * yaricap;
       System.out.printf("\nDaire cap: %.2f cm ", cap);

       double kure_hacmi = (4.0 / 3.0) * pi * yaricap * yaricap * yaricap;
       System.out.printf("\nküre hacmi: %.2f сm^3 ", kure_hacmi);

       double kure_yuzey_alanı = 4 * pi * Math.pow(yaricap, 2);
       System.out.printf("\nküre Yüzey Alanı: %.2f cm^2", kure_yuzey_alanı);

          }
    }
