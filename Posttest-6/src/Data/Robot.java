package Data;

public class Robot extends Produk {
    private String TanggalPembuatan;

    public Robot(String NamaProduser, String AlamatProduser, String NamaProduk, String SeriProduk, String TanggalPembuatan) {
        super(NamaProduser, AlamatProduser, NamaProduk, SeriProduk);
        this.TanggalPembuatan = TanggalPembuatan;
    }

    public String getTanggalPembuatan() {
        return TanggalPembuatan;
    }

    public void setTanggalPembuatan(String TanggalPembuatan) {
        this.TanggalPembuatan = TanggalPembuatan;
    }

    @Override
    public void Lihat() {
        System.out.println("Nama Produser      : " + NamaProduser);
        System.out.println("Alamat Produser    : " + AlamatProduser);
        System.out.println("Nama Produk        : " + NamaProduk);
        System.out.println("Jenis Produk       : " + JenisProduk);
        System.out.println("Seri Produk        : " + SeriProduk);
        System.out.println("Tanggal Pembuatan  : " + TanggalPembuatan);
    }

    public final void Lihat(String Lihat) {
        System.out.println("Nama Produk   : " + NamaProduk);
        System.out.println("Jenis Produk  : " + JenisProduk);
        System.out.println("Seri Produk   : " + SeriProduk);
    }
    public final void Lihat(int Lihat) {
        System.out.println("Nama Robot    : " + NamaProduk);
        System.out.println("Nama Produser : " + NamaProduser);
    }
    public final void LihatProduser() {
        System.out.println("Nama Produser      : " + NamaProduser);
        System.out.println("Alamat Produser    : " + AlamatProduser);
    }
}