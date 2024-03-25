package Data;

public class Produser {
    private String NamaProduser;
    private String AlamatProduser;

    public Produser(String NamaProduser, String AlamatProduser) {
        this.NamaProduser = NamaProduser;
        this.AlamatProduser = AlamatProduser;
    }

    public String getNamaProduser() {
        return NamaProduser;
    }

    public void setNamaProduser(String NamaProduser) {
        this.NamaProduser = NamaProduser;
    }

    public String getAlamatProduser() {
        return AlamatProduser;
    }

    public void setAlamatProduser(String AlamatProduser) {
        this.AlamatProduser = AlamatProduser;
    }

    public void LihatProduser() {
        System.out.println("Nama Produser      : " + NamaProduser);
        System.out.println("Alamat Produser    : " + AlamatProduser);
    }
}