package nesneler;


public class MerkeziIslemBirimi implements Observer {
    private boolean sogutucuDurumu = false;

    private SicaklikAlgilayici a = new SicaklikAlgilayici();
    private Eyleyici e = new Eyleyici();


    public void SogutucuDurumuSet(boolean durum)
    {
        this.sogutucuDurumu = durum;
    }

    public boolean SogutucuAcikMi()
    {
        return sogutucuDurumu;
    }

    public boolean SogutucuKapaliMi()
    {
        return !sogutucuDurumu;
    }

    public void sogutucuAc(MerkeziIslemBirimi nesne)
    {
        e.sogutucuAc(nesne , this);
        SogutucuAcildi();
    }

    public void sogutucuKapat(MerkeziIslemBirimi nesne)
    {
        e.sogutucuKapat(nesne , this);
        SogutucuKapatildi();
    }

    public void UyariMesaji(String s)
    {
        System.out.println("Sogutucu zaten " + s + ".");
    }

    public void SicaklikGoster()
    {
        System.out.println("Sıcaklık : " + a.sicaklikOku());
    }

    public void SicaklikYukselt()
    {
        a.sicaklikArttir();
    }

    public void SicaklikDusur()
    {
        a.sicaklikAzalt();
    }

    @Override
    public void SogutucuAcildi()
    {
        System.out.println("Soğutucu açıldı.");
    }

    @Override
    public void SogutucuKapatildi()
    {
        System.out.println("Soğutucu kapatıldı.");
    }
}
