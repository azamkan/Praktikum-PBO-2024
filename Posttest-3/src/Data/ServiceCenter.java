package Data;

public class ServiceCenter extends Produser {
    private String NamaServiceCenter;
    private String AlamatServiceCenter;

    public ServiceCenter(String NamaProduser, String AlamatProduser, String NamaServiceCenter, String AlamatServiceCenter) {
        super(NamaProduser, AlamatProduser);
        this.NamaServiceCenter = NamaServiceCenter;
        this.AlamatServiceCenter = AlamatServiceCenter;
    }

    public String getNamaServiceCenter() {
        return NamaServiceCenter;
    }

    public void setNamaServiceCenter(String NamaServiceCenter) {
        this.NamaServiceCenter = NamaServiceCenter;
    }

    public String getAlamatServiceCenter() {
        return AlamatServiceCenter;
    }

    public void setAlamatServiceCenter(String AlamatServiceCenter) {
        this.AlamatServiceCenter = AlamatServiceCenter;
    }

    public void LihatServiceCenter() {
        super.LihatProduser();
        System.out.println("Nama Service Center     : " + NamaServiceCenter);
        System.out.println("Alamat Service Center   : " + AlamatServiceCenter);
    }
}
