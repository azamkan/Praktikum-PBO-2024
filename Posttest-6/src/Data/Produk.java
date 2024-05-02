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
    

    //@Override
    public String getNamaProduser() {
        return NamaProduser;
    }
    //@Override
    public void setNamaProduser(String NamaProduser){
        this.NamaProduser = NamaProduser;
    }
    //@Override
    public void setAlamatProduser(String AlamatProduser){
        this.AlamatProduser = AlamatProduser;
    }
    //@Override
    public String getAlamatProduser(){
        return AlamatProduser;
    }


    @Override
    public void Lihat() {
        System.out.println("Nama Produser      : " + NamaProduser);
        System.out.println("Alamat Produser    : " + AlamatProduser);
        System.out.println("Nama Produk        : " + NamaProduk);
        System.out.println("Jenis Produk       : " + JenisProduk);
        System.out.println("Seri Produk        : " + SeriProduk);
    }
}