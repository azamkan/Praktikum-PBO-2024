package Data;

public class ServiceCenter extends Produser {
    private String NamaServiceCenter;
    private String AlamatServiceCenter;

    public ServiceCenter(String NamaProduser, String AlamatProduser, String NamaServiceCenter, String AlamatServiceCenter) {
        this.NamaServiceCenter = NamaServiceCenter;
        this.AlamatServiceCenter = AlamatServiceCenter;
        this.NamaProduser = NamaProduser;
        this.AlamatProduser = AlamatProduser;
    }

    public final String getNamaServiceCenter() {
        return NamaServiceCenter;
    }

    public final void setNamaServiceCenter(String NamaServiceCenter) {
        this.NamaServiceCenter = NamaServiceCenter;
    }

    public final String getAlamatServiceCenter() {
        return AlamatServiceCenter;
    }

    public final void setAlamatServiceCenter(String AlamatServiceCenter) {
        this.AlamatServiceCenter = AlamatServiceCenter;
    }

    public void Lihat(){
        System.out.println("Nama Produser           : " + NamaProduser);
        System.out.println("Alamat Produser         : " + AlamatProduser);
        System.out.println("Nama Service Center     : " + NamaServiceCenter);
        System.out.println("Alamat Service Center   : " + AlamatServiceCenter);
    }
}
