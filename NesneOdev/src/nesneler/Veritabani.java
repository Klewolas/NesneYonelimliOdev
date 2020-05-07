package nesneler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Veritabani {

    private static Veritabani instance = null;
    private synchronized static void createInstance() {
        if (instance == null)
            instance = new Veritabani();
    }
    public static Veritabani getInstance() {
        if (instance == null)
            createInstance();
        return instance;
    }

    private Connection baglan(){

        Connection conn=null;

        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/NesneOdev",
                    "postgres", "postgres");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public boolean KullaniciKontrol(String k , String s)
    {
        System.out.println("Kullanıcı kontrol ediliyor.");
        String sql= "SELECT * FROM \"Schema1\".\"Kullanici\"";
        String isim = "";
        String sifre = "";

        Connection conn=this.baglan();
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            conn.close();

            while(rs.next())
            {
                isim = rs.getString("KullaniciAdi");
                sifre = rs.getString("Sifre");
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(isim.equals(k) && sifre.equals(s))
            return true;
        else
            return false;

    }
}
