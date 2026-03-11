public class Car {
	// Tạo các thuộc tính cho xe 
	private String HangXe;
	private String MauXe;
	private int Tuoi;
	private double Gia;
	//tạo constructor 
	public Car(String HangXe, String MauXe, int Tuoi, double Gia ) {
		this.HangXe = HangXe;
		this.MauXe = MauXe;
		this.Tuoi = Tuoi;
		this.Gia = Gia;
	}
	//getter 
	public String getHangXe() {
		return HangXe;
	}
	public String getMauXe() {
		return MauXe;
	}
	public int getTuoi() {
		return Tuoi;
	}
	public double getGia() {
		return Gia;
	}
	//setter
	public void setHangXe(String HangXe) {
	    this.HangXe = HangXe;
	}

	public void setMauXe(String MauXe) {
	    this.MauXe = MauXe;
	}

	public void setTuoi(int Tuoi) {
	    this.Tuoi = Tuoi;
	}

	public void setGia(double Gia) {
	    this.Gia = Gia;
	}

}
