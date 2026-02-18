package conngua;

public class Ngua {

    private String ten;
    private int tuoi;
    private String mauLong;
    private double canNang;
    private boolean dangChay;

    public Ngua(String ten, int tuoi, String mauLong, double canNang) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.mauLong = mauLong;
        this.canNang = canNang;
        this.dangChay = false;
    }

    public String getTen() { return ten; }
    public int getTuoi() { return tuoi; }
    public String getMauLong() { return mauLong; }
    public double getCanNang() { return canNang; }
    public boolean isDangChay() { return dangChay; }

    public void chay() {
        dangChay = true;
        System.out.println(ten + " dang chay");
    }

    public void dungLai() {
        dangChay = false;
        System.out.println(ten + " da dung lai");
    }

    public void keu() {
        System.out.println("Hiiiii...");
    }
}
