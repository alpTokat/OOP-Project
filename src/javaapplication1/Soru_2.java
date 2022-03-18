
package javaapplication1;


import java.util.Scanner;
     
public class Soru_2 {

   
            
    public static void main(String[] args) {
        int yıl;
        Personel person1=new Personel();
        Scanner girdi=new Scanner(System.in);
        System.out.println("Adınızı giriniz:");
        person1.personel_Ad=girdi.next();
        System.out.println("Soyadınızı giriniz:");
        person1.personel_Soyad=girdi.next();
        System.out.println("Çocuk sayısını giriniz:");
        person1.cocuk_Sayısı=girdi.nextInt();
        System.out.println("Maaşınızı giriniz:");
        person1.maas=girdi.nextInt();
        System.out.println("Kaç yıl sonrası maaşınızın hesaplanmasını istersiniz?");
        yıl=girdi.nextInt();
        person1.zam_hesapla(person1.maas,person1.cocuk_Sayısı,yıl);
        for (int i = 0; i < yıl; i++) {
            person1.yas_hesapla();
        }
        System.out.println(person1.maas);
    }
}
