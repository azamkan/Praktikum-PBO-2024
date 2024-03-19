package DataRobot;

public class Robot {
    private String NamaRobot; 
    private String SeriRobot;
    private String ProduserRobot;

    public Robot(String NamaRobot, String SeriRobot, String ProduserRobot) {
        this.NamaRobot = NamaRobot;
        this.SeriRobot = SeriRobot;
        this.ProduserRobot = ProduserRobot;
    }

    public String getNamaRobot() {
        return NamaRobot;
    }

    public void setNamaRobot(String NamaRobot) {
        this.NamaRobot = NamaRobot;
    }

    public String getSeriRobot() {
        return SeriRobot;
    }

    public void setSeriRobot(String SeriRobot) {
        this.SeriRobot = SeriRobot;
    }

    public String getProduserRobot() {
        return ProduserRobot;
    }

    public void setProduserRobot(String ProduserRobot) {
        this.ProduserRobot = ProduserRobot;
    }

    public void LihatRobot(){
        System.out.println("Nama Robot     : " + NamaRobot);
        System.out.println("Seri Robot     : " + SeriRobot);
        System.out.println("Produser Robot : " + ProduserRobot);
    }
}
