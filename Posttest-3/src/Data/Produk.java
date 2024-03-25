package Data;

public class Produk extends Produser {
    private String NamaProduk;
    private String SeriProduk;

    public Produk(String NamaProduser, String AlamatProduser, String NamaProduk, String SeriProduk) {
        super(NamaProduser, AlamatProduser);
        this.NamaProduk = NamaProduk;
        this.SeriProduk = SeriProduk;
    }

    public String getNamaProduk() {
        return NamaProduk;
    }

    public void setNamaProduk(String NamaProduk) {
        this.NamaProduk = NamaProduk;
    }

    public String getSeriProduk() {
        return SeriProduk;
    }

    public void setSeriProduk(String SeriProduk) {
        this.SeriProduk = SeriProduk;
    }

    public void LihatProduk() {
        super.LihatProduser();
        System.out.println("Nama Produk        : " + NamaProduk);
        System.out.println("Seri Produk        : " + SeriProduk);
    }
}