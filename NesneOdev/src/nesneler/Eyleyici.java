package nesneler;

public class Eyleyici implements Observable {

    @Override
    public void sogutucuAc(MerkeziIslemBirimi nesne , Observer observer)
    {
        nesne.SogutucuDurumuSet(true);
        nesne.SicaklikDusur();
    }

    @Override
    public void sogutucuKapat(MerkeziIslemBirimi nesne , Observer observer)
    {
        nesne.SogutucuDurumuSet(false);
        nesne.SicaklikYukselt();
    }

}
