package ntu.nguyentuanK;

public class HocSinh {

    private String tenHS;
	private int tuoiHS;
	private double lopHS;
	//Constructor rong
	public HocSinh() {
		
	}
	//Constructor day du
	public HocSinh(String tenHS,int tuoiHS, double lopHS) {
		this.tenHS = tenHS;
		this.tuoiHS = tuoiHS;
		this.lopHS = lopHS;
	}
	//Getter & Setter
	public String getTenHS() {
		return tenHS;
	}
	public void setTenHS(String tenHS) {
		this.tenHS = tenHS;
	}
	public double getTuoiHS() {
		return tuoiHS;
	}
	public void setTuoiHS(int tuoiHS) {
		this.tuoiHS = tuoiHS;
	}
	public double getLopHS() {
		return lopHS;
	}
	public void setLopHS(double lopHS) {
		this.lopHS = lopHS;
	}
	@Override
	public String toString() {
		return "HocSinh [tenHS=" + tenHS + ", tuoiHS=" + tuoiHS + ", lopHS=" + lopHS + "]";
	}
	
}
