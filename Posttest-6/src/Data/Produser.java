package Data;

public abstract class Produser implements MyInterface {
    String NamaProduser;
    String AlamatProduser;

    //public abstract String getNamaProduser();
    public abstract void setNamaProduser(String NamaProduser);

    public abstract void setAlamatProduser(String AlamatProduser);

    //public abstract String getAlamatProduser();

    public void Lihat(){
        System.out.println("Nama Produser           : " + NamaProduser);
        System.out.println("Alamat Produser         : " + AlamatProduser);
    }
}