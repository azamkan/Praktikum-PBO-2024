package Data;

public abstract class Produser {
    String NamaProduser;
    String AlamatProduser;

    public String getNamaProduser() {
        return NamaProduser;
    }
    public void setNamaProduser(String NamaProduser){
        this.NamaProduser = NamaProduser;
    }
    public void setAlamatProduser(String AlamatProduser){
        this.AlamatProduser = AlamatProduser;
    }

    public String getAlamatProduser(String AlamatProduser){
        return AlamatProduser;
    }

    public abstract void Lihat();
}