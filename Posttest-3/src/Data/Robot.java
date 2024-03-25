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

    public void LihatProduk() {
        super.LihatProduk();
        System.out.println("Tanggal Pembuatan  : " + TanggalPembuatan);
    }
}