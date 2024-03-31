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

        public void Lihat() {
            System.out.println("Nama Produser      : " + NamaProduser);
            System.out.println("Alamat Produser    : " + AlamatProduser);
        }

        public void Lihat(int Parameter){
            if (Parameter == 1) {
                System.out.println("Nama Produser      : " + NamaProduser);
            }
        }

        public void Lihat(String Parameter){
            if (Parameter == "Alamat") {
                System.out.println("Alamat Produser      : " + AlamatProduser);
            }
        }
    }