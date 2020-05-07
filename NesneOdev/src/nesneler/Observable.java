package nesneler;

public interface Observable {
    void sogutucuAc(MerkeziIslemBirimi nesne , Observer observer);
    void sogutucuKapat(MerkeziIslemBirimi nesne , Observer observer);
}
