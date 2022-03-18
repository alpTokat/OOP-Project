package javaapplication1;
public class Personel {
    public static String personel_Ad;
    public static String personel_Soyad;
    public static int cocuk_Sayısı;
    public static double maas;
    
     public static void zam_hesapla(double maas,int cocuk,int yıl){
        double toplam_zam;
        double toplam=0;
        double yuzde;
        double cocuk_parası=cocuk*42;
        double yıllık_zam = 0;
        if(maas<=1000){
          yuzde=(3.0/100.0);
          yıllık_zam=maas*yuzde;
        }
        else if(maas>1000&&maas<=2500){
          yuzde=(4.0/100.0);
          yıllık_zam=maas*yuzde;
        }
        else if(maas>2500){
         yuzde=(5.0/100.0);
         yıllık_zam=maas*yuzde;
        }
        toplam_zam=cocuk_parası+yıllık_zam;
        System.out.println(personel_Ad+" "+personel_Soyad+" Eski Maası:"+maas+" Yeni Maası:"+(maas+toplam_zam)+" Zam:"+toplam_zam);
        
    }
     public static void yas_hesapla(){
         double yuzde=0.0;
         double zam=0.0;
         double cocuk_parası;
         if (maas<1000) {
             yuzde=(3.0/100.0);
             zam=maas*yuzde;
         }
         else if (maas>1000&&maas<2500) {
             yuzde=(4.0/100.0);
             zam=maas*yuzde;
         }
         else if (maas>2500) {
             yuzde=(5.0/100.0);
             zam=maas*yuzde;
         }
        cocuk_parası=(cocuk_Sayısı*42);
        maas=maas+(zam+cocuk_parası); 
    }
}
