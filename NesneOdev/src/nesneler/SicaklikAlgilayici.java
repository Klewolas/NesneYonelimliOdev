package nesneler;

import java.util.Random;

public class SicaklikAlgilayici {
    private int sicaklik = 0;
    Random rand = new Random();

    public SicaklikAlgilayici()
    {
        sicaklik = rand.nextInt(21) + 5;
    }

    public int sicaklikOku()
    {
        return sicaklik;
    }

    public void sicaklikArttir()
    {
        this.sicaklik += rand.nextInt(5);
    }

    public void sicaklikAzalt()
    {
        this.sicaklik -= rand.nextInt(5);
    }
}
