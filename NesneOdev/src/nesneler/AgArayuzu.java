package nesneler;

import java.util.Scanner;

public class AgArayuzu{

    public static void Giris()
    {
        String KullaniciAdi;
        String Sifre;
        Scanner giris = new Scanner(System.in);


        while(true)
        {
            System.out.print("Kullanici Adinizi Giriniz: ");
            KullaniciAdi = giris.next();
            System.out.print("Kullanici Sifrenizi Giriniz: ");
            Sifre = giris.next();
            if(Veritabani.getInstance().KullaniciKontrol(KullaniciAdi,Sifre)) {
                System.out.println("Giriş başarılı.");
                break;
            }
            else
            {
                System.out.println("Kullanıcı adı veya şifre hatalı.");
            }
        }

    }

    public static void Uygulama(MerkeziIslemBirimi nesne)
    {
        Scanner giris = new Scanner(System.in);
        int secim;

        while(true)
        {
            System.out.println("Seçim Yapınız:");
            System.out.println("1-Sıcaklık Görüntüle");
            System.out.println("2-Soğutucuyu Aç");
            System.out.println("3-Soğutucuyu Kapat");
            System.out.println("4-Çıkış Yap");
            secim = giris.nextInt();
            switch(secim)
            {
                case 1:
                    nesne.SicaklikGoster();
                    break;

                case 2:
                    if(nesne.SogutucuAcikMi())
                        nesne.UyariMesaji("acik");
                    else
                        nesne.sogutucuAc(nesne);
                    break;

                case 3:
                    if(nesne.SogutucuKapaliMi())
                        nesne.UyariMesaji("kapali");
                    else
                        nesne.sogutucuKapat(nesne);
                    break;

                case 4:
                    System.exit(0);
                    break;
            }
        }
    }

}
