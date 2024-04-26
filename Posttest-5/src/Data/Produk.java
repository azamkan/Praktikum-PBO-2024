package Data;

public class Produk extends Produser {
    public final String JenisProduk = "Robot";
    public String NamaProduk;
    public String SeriProduk;
    public Produk(String NamaProduser, String AlamatProduser, String NamaProduk, String SeriProduk) {
        this.NamaProduser = NamaProduser;
        this.AlamatProduser = AlamatProduser;
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
    
    public void Lihat() {
        System.out.println("Nama Produser      : " + NamaProduser);
        System.out.println("Alamat Produser    : " + AlamatProduser);
        System.out.println("Nama Produk        : " + NamaProduk);
        System.out.println("Jenis Produk       : " + JenisProduk);
        System.out.println("Seri Produk        : " + SeriProduk);
    }
}